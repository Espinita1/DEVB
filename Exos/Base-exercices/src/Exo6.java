import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exo6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); //Récupère le input utilisateur
        String answer; //Variable pour la réponse
        String chosenPhrase; //String pour la frase de l'utilisateur
        int nbrChars = 0; //Integer pour stocker le nombre de charactères
        int nbrVowels = 0; //Integer pour le nombre de voyelles
        int nbrMots = 0; //Integer pour le nombre de mots
        boolean secondTime = false; //Bool pour la demande de saisie la deuxième fois

        Pattern p = Pattern.compile("[a-zA-Z]"); // Regex pour compter les voyelles
        Matcher m; //Matcher pas encore initialisée pour son dynamisme

        System.out.println("Veuillez taper une phrase, mot, etc");
        chosenPhrase = sc.nextLine();   //Lit l'input de l'utilisateur

        // Tant que la phrase choisie soit vide ou elle contient des espaces
        // Continue à demander la saisie
        while(chosenPhrase.isEmpty() || chosenPhrase.isBlank()) {
            System.out.println("Aucun saisie, veuillez recommencer");
            chosenPhrase = sc.nextLine();
        }

        //Boucle ce bloc d'instructions tant que l'utilisateur il veut
        //Ce bloc contient les méthodes utilisées pour faire cet exercices
        do {

            // Si c'est la deuxième fois qu'on refait, demande la saisie de la nouvelle phrase à l'utilisateur
            if(secondTime == true) {
                System.out.println("Veuillez taper une phrase, mot, etc");
                chosenPhrase = sc.nextLine();
            }

            //Réinitialise le nombre de charactères chaque passée
            nbrVowels = 0;

            //La méthode length de la classe String permet compter la longueur contenue dans la variable String
            //Elle retourne un Int
            nbrChars = chosenPhrase.length();

            //Pour compter le nombre de voyelles nous allons tenir en compte avec les espaces
            //Avec la méthode split nous comptons ces espaces, puis avec la méthode length
            //Nous comptons le nombre de voyelles sans tenir en compte les espaces
            //
            nbrMots = chosenPhrase.split("\\s+").length;
            m = p.matcher(chosenPhrase);

            while (m.find()) {
                nbrVowels++;
            }

            System.out.println("Il y a " + nbrMots + " mots dans votre phrase");
            System.out.println("Il y a " + nbrChars + " caractères dans votre phrase");
            System.out.println("Il y a " + nbrVowels + " voyelles dans cette phrase");


            System.out.println("Voulez-vous recommencer?");
            answer = sc.next();
            sc.nextLine();
            secondTime = true;

        } while (answer.equals("y"));
    }
}
