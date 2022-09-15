

import java.util.*;
public class Main {

    public static void main(String[] args) {

        String line1 = new String(new char[44]).replace('\0', '-');
        String line2 = new String(new char[22]).replace('\0', '#');
        String line3 = new String(new char[10]).replace('\0', '*');

        // System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // Game Variables
        String[] enemies = {"GOBLIN", "SHREK", "DRAGON", "BOB THE BUILDER", "FERAL PEASANT", "CLIFFORD THE BIG RED DOG", "FERAL GIANT", "MICKEY MOUSE", "SEPHIROTH", "EUSTICE"};
        int maxEnemyHealth = 15;
        int enemyAttackDamage = 5;

        //Player Variables
        String[] characters = {"KNIGHT", "MAGE", "PEASANT", "JEFF", "WIZARD", "MR HANKEY", "COURAGE THE COWARDLY DOG"};
        int maxCharHealth = 100;
        int punchDamage = 50;
        int kickDamage = 50;
        int slashDamage = 50;
        int biteDamage = 50;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50;

        System.out.println(line3 + "\nDUNGEON !!!\n" + line3);

        boolean running = true;

        System.out.print("Enter Your Name: ");
        String playerName = in.nextLine();
        String character = characters[rand.nextInt(characters.length)];
        System.out.println("Welcome to the Dungeon " + playerName + ", Your character is a " + character);

        int characterHealth = rand.nextInt(maxCharHealth);


        GAME:
        while (running) {
            System.out.println(line1);


            int enemyHealth = rand.nextInt(maxEnemyHealth);

            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\n\t# A WILD " + enemy + " HAS APPEARED! #\n");
            System.out.println(line1);

            while (enemyHealth > 0) {
                System.out.println("\tYour HP: " + characterHealth);
                System.out.println("\t" + enemy + "'s HP " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Punch");
                System.out.println("\t2. Kick");
                System.out.println("\t3. Slash");
                System.out.println("\t4. Bite");
                System.out.println("\t5. Drink Health Potion");
                System.out.println("\t6. Run!");

                String input = in.nextLine();
                if (input.equals("1")) {
                    int Punch = rand.nextInt(punchDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= Punch;
                    characterHealth -= damageTaken;

                    System.out.println("\t> You PUNCHED the " + enemy + " for " + Punch + " damage.");
                    System.out.println("\t> You received " + damageTaken + " in retaliation!");

                    if (characterHealth < 1) {
                        System.out.println("\t> You have taken too much damage, you are too weak to go on!");
                        break;
                    }
                }
                else if (input.equals("2")) {
                    int Kick = rand.nextInt(kickDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= Kick;
                    characterHealth -= damageTaken;

                    System.out.println("\t> You KICKED the " + enemy + " for " + Kick + " damage.");
                    System.out.println("\t> You received " + damageTaken + " in retaliation!");

                    if (characterHealth < 1) {
                        System.out.println("\t> You have taken too much damage, you are too weak to go on!");
                        break;
                    }
                }
                else if (input.equals("3")) {
                    int Slash = rand.nextInt(slashDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= Slash;
                    characterHealth -= damageTaken;

                    System.out.println("\t> You STABBED the " + enemy + " for " + Slash + " damage.");
                    System.out.println("\t> You received " + damageTaken + " in retaliation!");

                    if (characterHealth < 1) {
                        System.out.println("\t> You have taken too much damage, you are too weak to go on!");
                        break;
                    }
                }
                else if (input.equals("4")) {
                    int Bite = rand.nextInt(biteDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= Bite;
                    characterHealth -= damageTaken;

                    System.out.println("\t> YOU BIT THE " + enemy + " FOR " + Bite + " DAMAGE.");
                    System.out.println("\t> You received " + damageTaken + " in retaliation!");

                    if (characterHealth < 1) {
                        System.out.println("\t> You have taken too much damage, you are too weak to go on!");
                        break;
                    }
                }
                else if (input.equals("5")) {
                    if(numHealthPotions > 0) {
                        characterHealth += healthPotionHealAmount;
                        numHealthPotions--;
                        System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + " . "
                                + "\n|t> You now have " + characterHealth + " HP."
                                + "\n\t> You have " + numHealthPotions + " health potions left. \n");
                    }
                    else{
                        System.out.println("\t> You have no health potions left! Defeat enemies for a chance to get one!\n");
                    }
                }
                else if (input.equals("6")) {
                    System.out.println("\tYou run away from the " + enemy + "!");
                    continue GAME;
                }
                else {
                    System.out.println("\tINVALID COMMAND!!!");
                }
            }

            if (characterHealth < 1){
                System.out.println("You limp out of the dungeon, weak from battle.");
                break;
            }

            System.out.println(line1);
            System.out.println(" # " + enemy + " was defeated! # ");
            System.out.println(" # You have " + characterHealth + " HP left #");
            if(rand.nextInt(100) < healthPotionDropChance) {
                numHealthPotions++;
                System.out.println(" # The " + enemy + " dropped a health potion! # ");
                System.out.println(" # You now have " + numHealthPotions + " health potion(s). # ");
            }
            System.out.println(line1);
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue Fighting");
            System.out.println("2. Exit Dungeon");

            String input = in.nextLine();

            while (!input.equals("1") && !input.equals("2")){
                System.out.println("Invalid Command!");
                input = in.nextLine();
            }

            if(input.equals("1")) {
                System.out.println("You Continue on your Adventure");
            }
            else if(input.equals("2")){
                System.out.println("You Exit the Dungeon, from your adventures");
                break;
            }
        }

        System.out.println("\n" + line2);
        System.out.println("THANKS FOR PLAYING");
        System.out.println(line2);

    }
}

