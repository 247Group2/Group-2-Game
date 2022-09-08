import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);



        System.out.println("-------------------");
        System.out.print("Enter Your Player Name: ");
        String playerName = input.nextLine();
        System.out.println("--------------------");

        classSelection classselection = new classSelection();
        classselection.classSelector();

        classWeapons classweapon = new classWeapons();
        classweapon.classWeapon();



    }
}