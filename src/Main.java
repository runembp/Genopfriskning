import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        doesArrayListContainString("hej");
//        Bibliotek bib = new Bibliotek();
//
//        bib.doesContain(new Bog("8132974891273","Hitchhikers Guide To The Galaxy", 1992));

//        squareSymbol(5, 'Ø');

//        Bog jeansJournal = new Bog("18293126312897", "Dagbog", 2020);
//      System.out.println(jeansJournal);

        Scanner scan = new Scanner(System.in);
//
//        double grassHeightNow = 0;
//        double grassHeightMax = 0;
//
//        while(true)
//        {
//            System.out.println("Enter 0 in both questions to quit");
//            System.out.print("Enter current grass height (cm): ");
//            grassHeightNow = scan.nextDouble();
//
//            System.out.print("Enter maximum grass height (cm): ");
//            grassHeightMax = scan.nextDouble();
//
//            cutGrass(grassHeightNow,grassHeightMax);
//
//            if(grassHeightMax == 0 && grassHeightNow == 0)
//            {
//                break;
//            }
//        }


//        cutGrass(10, 25);

//        sentenceCheck("Hej med dig");
//        ArrayList<String> strings = new ArrayList<>();
//        for(int i = 0; i < 5; i++)
//        {
//            strings.add(scan.nextLine());
//        }
//
//        sortString(strings);

        String[] strings = {"æble", "rov", "tyv", "hest", "sommer", "test"};
        search(strings, "Fjolletobak");
    }

    private static boolean doesArrayListContainString(String searchString) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Test");
        strings.add("Test1");
        strings.add("Test2");
        strings.add("Test3");
        strings.add("hej");
        strings.add("Test5");

        if (strings.contains(searchString)) {
            System.out.println("The String has been found!");
            return true;
        } else {
            strings.add(searchString);
            return false;
        }
    }

    private static boolean cutGrass(double grassHeightNow, double grassMaxHeight) {
        if (grassHeightNow >= grassMaxHeight) {
            System.out.println("Grass needs to be cut!");
            return true;
        }

        int days = 0;

        while (grassHeightNow < grassMaxHeight) {
            grassHeightNow += 0.8;
            days++;
        }
        return false;

    }

    public static void squareSymbol(int size, char symbol) {
        for (int i = 0; i < size; i++) {
            for (int y = 0; y < size; y++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    public static void sentenceCheck(String sentence) {
        String[] parts = sentence.split(" ");

        for (String string : parts) {
            if (string.toUpperCase().equals(string))
                continue;

            if (string.length() > 3) {
                String newString = string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
                string = newString;
            }
            if (string.length() <= 3) {
                String newString = string.toLowerCase();
                string = newString;
            }
        }
    }

    public static void sortString(ArrayList<String> strings) {
        Collections.sort(strings);
        Collections.reverse(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static int search(String[] strings, String searchedString) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(searchedString))
                return i;
            else {
                try {
                    throw (new Exception("String was not found"));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

        return -1;
    }
}



