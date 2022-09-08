import java.util.*;
public class classWeapons {

    public static void classWeapon() {

        String[] classArray = new String[4];
        classArray[0] = "Knight";
        classArray[1] = "Mage";
        classArray[2] = "Bard";
        classArray[3] = "Jeff";

        System.out.println("Choose Your Weapon (Enter Number) ");
        System.out.println("1. " + classArray[0]);
        System.out.println("2. " + classArray[1]);
        System.out.println("3. " + classArray[2]);
        System.out.println("4. " + classArray[3]);
        System.out.println("-------------------");

        Scanner classSelector = new Scanner(System.in);
        String chooseClass = classSelector.nextLine();
        if (chooseClass.equals("1")) {
            System.out.println("-------------------");
            System.out.println("You have selected " + classArray[0]);
            System.out.println("-------------------");
        }else if (chooseClass.equals("2")) {
            System.out.println("-------------------");
            System.out.println("You have selected " + classArray[1]);
            System.out.println("-------------------");
        }else if (chooseClass.equals("3")) {
            System.out.println("-------------------");
            System.out.println("You have selected " + classArray[2]);
            System.out.println("-------------------");
        }else if (chooseClass.equals("4")){
            System.out.println("-------------------");
            System.out.println("You have selected " + classArray[3]);
            System.out.println("-------------------");

        }

    }

}
