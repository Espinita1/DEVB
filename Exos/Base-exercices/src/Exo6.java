import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exo6 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String answer;
        String chosenPhrase;
        int nbrMots;
        int nbrChars;
        int nbrVowels;
        Pattern p = Pattern.compile("[a-zA-Z]");
        Matcher m;



        do {
            nbrChars = 0;
            System.out.println("Veuillez taper une phrase, mot, etc");
            chosenPhrase = sc.nextLine();

            nbrMots = chosenPhrase.length();
            System.out.println(nbrMots);
            m = p.matcher(chosenPhrase);

            while(m.find())
            {
                nbrChars++;
            }


            System.out.println(nbrChars);

            System.out.println("Voulez-vous recommencer?");
            answer = sc.next();
            sc.nextLine();
        }while (answer.equals("y") && !chosenPhrase.isEmpty());
    }
}
