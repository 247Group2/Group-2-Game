import java.util.*;
public class classSelection {

    public static void classSelector() {

        String[] characters = {"Knight", "Mage", "Bard", "Jeff"};

        System.out.println("Choose Your Class (Enter Number) ");
        System.out.println("1. " + characters[0]);
        System.out.println("2. " + characters[1]);
        System.out.println("3. " + characters[2]);
        System.out.println("4. " + characters[3]);
        System.out.println("-------------------");

        Scanner classSelector = new Scanner(System.in);
        String chooseClass = classSelector.nextLine();
        if (chooseClass.equals("1")) {
            System.out.println("-------------------");
            System.out.println("You have selected " + characters[0]);
            System.out.println("-------------------");
        }else if (chooseClass.equals("2")) {
            System.out.println("-------------------");
            System.out.println("You have selected " + characters[1]);
            System.out.println("-------------------");
        }else if (chooseClass.equals("3")) {
            System.out.println("-------------------");
            System.out.println("You have selected " + characters[2]);
            System.out.println("-------------------");
        }else if (chooseClass.equals("4")){
            System.out.println("-------------------");
            System.out.println("You have selected " + characters[3]);
            System.out.println("-------------------");

        }

    }

}
