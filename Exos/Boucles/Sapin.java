import java.util.Scanner;

public class Sapin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lines;
        String response;

        do {

            System.out.println("Saissisez le nombre de lignes: ");
            lines = sc.nextInt();

            for (int y=0; y < lines;y++)
            {

                for (int j = 0;j < lines - y; j++)
                {
                    System.out.print(" ");
                }

                for(int x = 0;x <= 2 * y + 1;x++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println("Voulez-vous recommencer y/n");

            response = sc.next();
        }while(response.equals("y"));
    }
}
