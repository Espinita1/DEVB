import java.util.Scanner;
import java.lang.Math;

public class Exo1 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int largeur;
        int hauteur;
        int profondeur;
        int volume;
        int factorise;
        int nbr;
        int x;
        int y;
        int z;
/*
        System.out.print("Largeur: ");
        largeur = sc.nextInt();
        System.out.println();

        System.out.print("Hauteur: ");
        hauteur = sc.nextInt();
        System.out.println();

        System.out.print("Profondeur: ");
        profondeur = sc.nextInt();
        System.out.println();
*/

        System.out.print("Premier nombre: ");
        x = sc.nextInt();
        System.out.println();

        System.out.print("Deuxième nombre: ");
        y = sc.nextInt();
        System.out.println();

        System.out.print("Troisième nombre: ");
        z = sc.nextInt();
        System.out.println();

        /*System.out.print("Nombre factoriel: ");
        nbr = sc.nextInt();
        System.out.println();/*


        //System.out.println("Choissisez une de ces options...");
        //System.out.println("Volume d'un carré: 1");
        //System.out.println("2");
        //System.out.println("3");
/*
        volume = CalculerVolume(largeur,hauteur,profondeur);

        System.out.println("Le volume est: " + volume);
*/

        /*factorise = factoriser(nbr);
        System.out.println("Nombre factorisé: " + factorise);
        */
        nbr = plusGrandNumero(x,y,z);
        System.out.println("Nombre plus grand: " + nbr);
    }

    public static int calculerVolume(int largeur, int hauteur, int profondeur)
    {
        int volume;
        volume = largeur * hauteur * profondeur;

        return volume;

    }

    public static int factoriser(int nbr)
    {
        for (int x=nbr -1;x>0;x--)
        {

            nbr *= x;

        }
        return nbr;
    }

    public static int plusGrandNumero(int x,int y,int z)
    {
        int answer;

        // lol pas faire le if chiant lol bypass hack   23oui41h2utv n2i34 
        answer = Math.max(Math.max(x,z), Math.max(x,y));

        return answer;
    }

}
