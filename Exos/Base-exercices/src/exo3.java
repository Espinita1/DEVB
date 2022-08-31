import java.math.*;
import java.util.Scanner;

public class exo3 {
    public static void  main(String[] args)
    {
        Scanner options = new Scanner(System.in);
        String choix;
        final double THE_PI = Math.PI;

        do {

            Scanner sc = new Scanner(System.in);

            System.out.println("Saississez le rayon");

            double rayon = sc.nextDouble();

            System.out.println("Saississez la hauteur");

            double hauteur = sc.nextDouble();
            double surface = THE_PI * Math.pow(rayon, 2) ;
            double volume = surface * hauteur;

            System.out.println(volume);
            System.out.println("Voulez-vous recommencer y/n");

            choix = sc.next();

        }while(choix.equals("y"));
    }
}
