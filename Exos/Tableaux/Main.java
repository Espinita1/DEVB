import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int k = 0;

        prnt("Veuillez mettre le nombre maximum de numéros: ");
        n = sc.nextInt();

        prnt("Nombre de tirages maximum: ");
        k = sc.nextInt();

        int[] tirageAuSort = randGen(n,k);
        int[] userInput = new int[k];
        /*
        for (int x = 0; x < tirageAuSort.length; x++)
        {
            prntln(tirageAuSort[x]);
        }*/

        prnt("Veuillez tenter votre chance: ");
        prntln("Introduisez " + k + " nombres: ");

        for(int y = 0; y < tirageAuSort.length; y++)
        {
            userInput[y] = sc.nextInt();
        }



    }

    public static int[] randGen(int maxNombre, int maxTirages)
    {
        Random rand = new Random(maxNombre+1);
        int tirages[] = new int[maxTirages];

        for (int i=0; i < maxTirages; i++)
        {
            tirages[i] = rand.nextInt(maxNombre - 1 + 1) + 1;
        }

        Arrays.sort(tirages);

        return tirages;
    }

    public static int[] compareTab(int[] premierTab, int[] deuxiemeTab)
    {
        String[] tabResult = new String[][premierTab.length];
        int a = 0;

        for (int z = 0; z < premierTab.length; z++)
            for (int w = 0; w < premierTab.length;w++)
            {
                if (premierTab[z] == deuxiemeTab[w])
                {
                    tabResult[a] = "Vous avez dévine " + a + " numéros";
                    a++;
                }

            }
        //if(Arrays.compare())


        return ;
    }

    // Just to print simple text because I'm lazy
    public static void prnt(String str)
    {
        System.out.print(str);
    }

    public static void prntln(String str)
    {
        System.out.println(str);
    }

    public static void prnt(int i)
    {
        System.out.println(i);
    }

    public static void prntln(int i)
    {
        System.out.println(i);
    }

}