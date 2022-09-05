import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int multiple = 0;

        System.out.println("Veuillez rentrer un nombre entier.");
        multiple= sc.nextInt();

        if(multiple % 4 == 0)
        {
            System.out.println(multiple + " est multiple de 4.");

        }
        if (multiple % 3 == 0) {

            System.out.println(multiple + " est multiple de 3.");
        }else{
            System.out.println(multiple + " n'est pas multiple de 3 ni 4");
        }

        if(multiple < 0)
        {
            System.out.println( "Erreur le nombre " + multiple + "est négatif");
        }
    }
}
