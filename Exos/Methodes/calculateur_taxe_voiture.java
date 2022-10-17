/******************************************************************************
** PROGRAMME                                                                 **
**                                                                           **
** Lieu      :  ETML                                                         **
** Auteur    :  Guzman Jordy                                                 **
** Date      :  17.10.2022                                                   **
**                                                                           **
** Modifications                                                             **
**   Auteur  :  Guzman Jordy                                                 **
**   Version :  1.0                                                          **
**   Date    :  		                                                     **
**   Raisons :  												             **
**                                                                           **
**                                                                           **
******************************************************************************/

/******************************************************************************
** DESCRIPTION                                                               **
** Calcule la taxe appliquée au véhicule à moteur selon un barème donné      **     
**																	         **
**                                                                           **
******************************************************************************/

import java.util.Scanner;

public class calculateur_taxe_voiture {

    private final static double TAXEDEBASE = 40;

    private final static double TAXEPARKG = 0.15;
    private final static double POIDSLIMIT = 2000;
    private final static double TAXPARKGSUPPLEMENTAIRE = 0.3;
    private final static double TAXEPOIDSPLAFONDSUPPLEMENTAIRE = 300;

    private final static double TAXEPARKW = 2;
    private final static double KWLIMIT = 100;
    private final static double TAXPARKWSUPPLEMENTAIRE = 3;
    private final static double TAXEPUISSANCEPLAFONDSUPPLEMENTAIRE = 200;
    private final static double REDUCTIONMOTEURECO = 0.25;

    private static Scanner inptReader = new Scanner(System.in);
    private static double poids = 0;
    private static double puissance = 0;
    private static double emissionCo2 = 0;
    private static String typeDeGaz = "";
    private static double totale = 0;
    static double totalTaxe = 0;
    static double totalPoidsTaxe = 0;
    static double totalPuissanceTaxe = 0;
    private static boolean aEssence = false;
    private static String reponse;

    public static void main(String[] args) {

        do {

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println(
                    "\t\t\t\t\t**********************************************************************************");
            System.out.println("\t\t\t\t\t**\t\t\t\t\t\t\t\t\t\t**");
            System.out.println("\t\t\t\t\t**\t\tBIENVENUS AU CALCULATEUR DE TAXES DE VOITURE ETML\t\t**");
            System.out.println("\t\t\t\t\t**\t\t\t\t\t\t\t\t\t\t**");
            System.out.println(
                    "\t\t\t\t\t**********************************************************************************");

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            System.out.print("Introduisez le poids de votre véhicule en Kg: ");
            poids = assigneValeureDouble();

            System.out.println();
            System.out.println();

            System.out.print("Introduisez la consommation de votre véhicule en KW: ");
            puissance = assigneValeureDouble();

            System.out.println();
            System.out.println();

            System.out.print("Introduisez le type de gaz utilisé par votre véhicule: ");
            typeDeGaz = assigneValeurString();
            System.out.println();
            System.out.println();

            if (typeDeGaz.equalsIgnoreCase("Essence") || typeDeGaz.equalsIgnoreCase("Diesel")) {
                System.out.print("Introduisez les émissions au KM de votre véhiculeen g: ");
                emissionCo2 = inptReader.nextDouble();
                System.out.println();
                if (emissionCo2 > 120) {
                    aEssence = true;
                }
            }

            totale = CalculerTaxeTotale(poids, puissance, aEssence);

            System.out.println("La taxe totale est de : " + totale);
            System.out.println("Voulez-vous recommencer? o/n");
            reponse = inptReader.next();
            System.out.println();
        } while (reponse.equalsIgnoreCase("o"));

    }

    /* Méthodes */

    private static double CalculerTaxePoids(double poids) {
        double poidsTaxe = 0;
        poidsTaxe = TAXEPARKG * poids;
        return poidsTaxe;
    }

    private static double CalculerTaxePoids(double poids, double surchargePoids) {

        double poidsTaxe = 0;
        poidsTaxe = (TAXPARKGSUPPLEMENTAIRE * surchargePoids) + TAXEPOIDSPLAFONDSUPPLEMENTAIRE;
        return poidsTaxe;
    }

    private static double CalculerTaxePuissance(double puissance) {
        double puissanceTaxe = 0;
        puissanceTaxe = TAXEPARKW * puissance;
        return puissanceTaxe;
    }

    public static double CalculerTaxePuissance(double puissance, double surchargeKw) {
        double puissanceTaxe = 0;
        puissanceTaxe = (TAXPARKWSUPPLEMENTAIRE * surchargeKw) + TAXEPUISSANCEPLAFONDSUPPLEMENTAIRE;
        return puissanceTaxe;
    }

    public static double CalculerTaxeTotale(double poids, double puissance, boolean estaEssence) {
        double surchargePoids = poids - POIDSLIMIT;
        double surchargePuissance = puissance - KWLIMIT;

        if (poids > POIDSLIMIT) {
            totalPoidsTaxe = CalculerTaxePoids(poids, surchargePoids);
        } else {
            totalPoidsTaxe = CalculerTaxePoids(poids);
        }

        if (puissance > KWLIMIT) {
            totalPuissanceTaxe = CalculerTaxePuissance(puissance, surchargePuissance);
        } else {
            totalPuissanceTaxe = CalculerTaxePuissance(puissance);
        }

        if (aEssence) {
            totalTaxe = (TAXEDEBASE + totalPoidsTaxe + totalPuissanceTaxe);
        } else {
            totalTaxe = ((TAXEDEBASE + totalPoidsTaxe + totalPuissanceTaxe) * REDUCTIONMOTEURECO);
        }

        return totalTaxe;
    }

    public static double assigneValeureDouble() {
        double numero = 0;
        do {
            while (!inptReader.hasNextDouble()) {
                System.out.println();
                System.out.println("Pas de saisie valide, veuillez recommencer");
                inptReader.nextLine();
            }
            numero = inptReader.nextDouble();
            if (numero < 0) {
                System.out.println("Le numéro est plus pétit que 0, veuillez recommencer");
                inptReader.nextLine();
            }
        } while (numero < 0);

        return numero;
    }

    public static String assigneValeurString() {

        String parole = "";
        while (!inptReader.hasNext()) {
            System.out.println();
            System.out.println("Pas de saisie valide, veuillez recommencer");
        }
        parole = inptReader.next();
        return parole;
    }
}
