import java.util.Scanner;

public class Carre {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String response;
        int lines;
        int stars;

        do {
            System.out.println("Saissisez le nombre de lignes: ");
            lines = sc.nextInt();

            System.out.println("Saissisez le nombre d'étoiles: ");
            stars = sc.nextInt();

            for (int y=0;y<lines;y++)
            {

                for (int x=0;x<stars;x++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            System.out.println("Fini");

            System.out.println("Voulez-vous recommencer y/n");
            response = sc.next();
        }while(response.equals("y"));
    }
}
