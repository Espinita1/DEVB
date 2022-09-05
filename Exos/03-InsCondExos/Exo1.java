import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int premierNombre = 0;
        int deuxiemeNombre = 0;
        int resultat = 0;
        String operateur = "";

        System.out.println("Veuillez rentrer le premier nombre:");
        premierNombre = sc.nextInt();

        /*while(!sc.hasNextInt()){
            System.out.println("Pas de saisie valide, veuillez recommencer");
            sc.nextLine();
        }*/

        sc.nextLine();
        System.out.println("Veuillez rentrer le signe de l'opération à faire (+,-,x,/):");
        operateur = sc.next();

        sc.nextLine();
        System.out.println("Veuillez rentrer le deuxième nombre:");
        deuxiemeNombre = sc.nextInt();

        switch (operateur)
        {
            case "+":
            {
                resultat = premierNombre + deuxiemeNombre;
                break;
            }

            case "x":
            {
                resultat = premierNombre * deuxiemeNombre;
            }

            case "/":
            {
                resultat = premierNombre / deuxiemeNombre;
            }

            case "-":
            {
                resultat = premierNombre - deuxiemeNombre;
            }

            default:
                System.out.println("Une ou plusieures saisies sont invalides, veuillez recommencer...");
                break;
        }

        System.out.println("Voici votre résultat " + premierNombre + " " + operateur + " " + deuxiemeNombre + " = " + resultat);
    }
}