import java.util.*;
public class classWeapons {

    public static void classWeapon() {

        /*Display weaponDisplay = new Display();
        weaponDisplay.lineClass();*/

        String[] classArray = new String[4];
        classArray[0] = "Sword";
        classArray[1] = "Staff";
        classArray[2] = "Guitar";
        classArray[3] = "Spork";

        System.out.println("Choose Your Weapon (Enter Number) ");
        System.out.println("1. " + classArray[0]);
        System.out.println("2. " + classArray[1]);
        System.out.println("3. " + classArray[2]);
        System.out.println("4. " + classArray[3]);
       // System.out.println(Display.lineClass());

        Scanner classSelector = new Scanner(System.in);
        String chooseClass = classSelector.nextLine();
        if (chooseClass.equals("1")) {
            System.out.println("\nYou have selected " + classArray[0] + "\n");
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
