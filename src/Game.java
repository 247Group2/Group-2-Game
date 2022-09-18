import java.util.*;

    public class Game {

        public void game() {
            display d = new display();
            characterClass c = new characterClass();
            enemyClass e = new enemyClass();
            potionClass p = new potionClass();
            weaponClass w = new weaponClass();

            Scanner in = new Scanner(System.in);
            Scanner classSelect = new Scanner(System.in);
            Random rand = new Random();


            //CONSTRUCTOR FOR CLASS SELECTION
            classSelector classS1 = new classSelector(c.character[0], 100);
            classSelector classS2 = new classSelector(c.character[1], 75);
            classSelector classS3 = new classSelector(c.character[2], 50);
            classSelector classS4 = new classSelector(c.character[3], 75);
            classSelector classS5 = new classSelector(c.character[4], 125);

            System.out.println("\n\t\t\t" + d.line3 + "\n\t\t\t THE DUNGEON! \n\t\t\t" + d.line3);

            System.out.print("\n\t-> ENTER YOUR NAME: ");
            String playerName = in.nextLine().toUpperCase(Locale.ROOT); // This will capitalize the input

            System.out.println("\t   CHOOSE YOUR CHARACTER: ");
            System.out.println("\t    -> PRESS 1 FOR KNIGHT ");
            System.out.println("\t    -> PRESS 2 FOR MAGE");
            System.out.println("\t    -> PRESS 3 FOR PEASANT");
            System.out.println("\t    -> PRESS 4 FOR WIZARD");
            System.out.println("\t    -> PRESS 5 FOR JEFF");
            String cS = classSelect.nextLine();

//     The switch case is for selecting your character
            int health = 0;
            String character = "default";
            switch (cS) {
                case "1" -> {
                    health = classS1.HP;
                    character = classS1.classCharacter;
                }
                case "2" -> {
                    health = classS2.HP;
                    character = classS2.classCharacter;
                }
                case "3" -> {
                    health = classS3.HP;
                    character = classS3.classCharacter;
                }
                case "4" -> {
                    health = classS4.HP;
                    character = classS4.classCharacter;
                }
                case "5" -> {
                    health = classS5.HP;
                    character = classS5.classCharacter;
                }
                default -> System.out.println("\tINVALID COMMAND!!!");
            }


            System.out.println("\t" + d.line1 + "\n\t  WELCOME " + playerName + " TO THE DUNGEON! YOUR CHARACTER IS A "
                    + character + "!\n");

            int characterHealth = health;

            GAME:
            while (true) {
                System.out.println("\t" + d.line1);

                int enemyHealth = rand.nextInt(e.maxEnemyHealth);

                String enemy = e.enemies[rand.nextInt(e.enemies.length)];
                System.out.println("\n\t\t\t # A WILD " + enemy + " HAS APPEARED! #\n");
                System.out.println("\t" + d.line1);

                label:
                while (enemyHealth > 10) {
                    System.out.println("\n\t    -* YOUR HP: " + characterHealth);
                    System.out.println("\t    -* " + enemy + "'S HP: " + enemyHealth);
                    System.out.println("\n\t   WHAT WOULD YOU LIKE TO DO?");
                    System.out.println("\t    -> PRESS 1 TO USE SWORD");
                    System.out.println("\t    -> PRESS 2 TO USE STAFF");
                    System.out.println("\t    -> PRESS 3 TO USE FISTS");
                    System.out.println("\t    -> PRESS 4 TO USE RUBBER CHICKEN");
                    System.out.println("\t    -> PRESS 5 TO HEAL");
                    System.out.println("\t    -> PRESS 6 TO RUN");

                    String input = in.nextLine();
                    switch (input) {
                        case "1": {
                            int Stab = rand.nextInt(w.SwordDP);
                            int damageTaken = rand.nextInt(e.enemyAttackDamage);

                            enemyHealth -= Stab;
                            characterHealth -= damageTaken;

                            System.out.println("\t> YOU'VE PUNCHED THE " + enemy + " FOR " + Stab + " DAMAGE!");
                            System.out.println("\t> YOU'VE RECEIVE " + damageTaken + " IN RETALIATION!");

                            if (characterHealth < 1) {
                                System.out.println("\t> YOU HAVE TAKEN TOO MUCH DAMAGE!");
                                break label;
                            }
                            break;
                        }
                        case "2": {
                            int Staff = rand.nextInt(w.StaffDP);
                            int damageTaken = rand.nextInt(e.enemyAttackDamage);

                            enemyHealth -= Staff;
                            characterHealth -= damageTaken;

                            System.out.println("\t> YOU'VE STRUCK THE " + enemy + " FOR " + Staff + " DAMAGE!");
                            System.out.println("\t> YOU'VE RECEIVE " + damageTaken + " IN RETALIATION!");

                            if (characterHealth < 1) {
                                System.out.println("\t> YOU HAVE TAKEN TOO MUCH DAMAGE!");
                                break label;
                            }
                            break;
                        }
                        case "3": {
                            int Punch = rand.nextInt(w.FistsDP);
                            int damageTaken = rand.nextInt(e.enemyAttackDamage);

                            enemyHealth -= Punch;
                            characterHealth -= damageTaken;

                            System.out.println("\t> YOU'VE PUNCHED THE " + enemy + " FOR " + Punch + " DAMAGE!");
                            System.out.println("\t> YOU'VE RECEIVE " + damageTaken + " IN RETALIATION!");

                            if (characterHealth < 1) {
                                System.out.println("\t> YOU HAVE TAKEN TOO MUCH DAMAGE!");
                                break label;
                            }
                            break;
                        }
                        case "4": {
                            int Chicken = rand.nextInt(w.Rubberchicken);
                            int damageTaken = rand.nextInt(e.enemyAttackDamage);

                            enemyHealth -= Chicken;
                            characterHealth -= damageTaken;

                            System.out.println("\t> YOU'VE SLAPPED THE " + enemy + " FOR " + Chicken + " DAMAGE!");
                            System.out.println("\t> YOU'VE RECEIVE " + damageTaken + " IN RETALIATION!");

                            if (characterHealth < 1) {
                                System.out.println("\t> YOU HAVE TAKEN TOO MUCH DAMAGE!");
                                break label;
                            }
                            break;
                        }
                        case "5":
                            if (p.numHealthPotions > 0) {
                                characterHealth += p.healthPotionHealAmount;
                                p.numHealthPotions--;
                                System.out.println("\t> YOU'VE DRANK A HEALTH POTION, HEALING YOURSELF FOR " + p.healthPotionHealAmount + "."
                                        + "\n\t> YOU HAVE " + characterHealth + " HP."
                                        + "\n\t> YOU NOW HAVE " + p.numHealthPotions + " HEALTH POTIONS LEFT. \n");
                            } else {
                                System.out.println("\t-> YOU HAVE NO MORE HEALTH LEFT! DEFEAT ENEMIES TO GET ONE! <-\n");
                            }
                            break;
                        case "6":
                            System.out.println("\tYOU RAN AWAY FROM THE " + enemy + "!");
                            continue GAME; //This will loop back to the Game label statement
                        default:
                            System.out.println("\tINVALID COMMAND!!!");
                            break;
                    }
                }


                if (characterHealth < 1) {
                    System.out.println("YOU'RE TOO WEAK TO CONTINUE!");
                    break;
                }

                System.out.println("\n\t " + d.line2);
                System.out.println("\n\t # " + enemy + " WAS DEFEATED! # ");
                System.out.println("\t # YOU HAVE " + characterHealth + " HP LEFT #");
                if (rand.nextInt(100) < p.healthPotionDropChance) {
                    p.numHealthPotions++;
                    System.out.println("\t # A HEALTH POTION WAS DROPPED! # ");
                    System.out.println("\t # YOU NOW HAVE " + p.numHealthPotions + " HEALTH POTION(S) # ");
                }
                System.out.println("\n\t " + d.line2);
                System.out.println("\n\tWOULD YOU LIKE TO CONTINUE?");
                System.out.println("\t -> PRESS 1 FOR YES");
                System.out.println("\t -> PRESS 2 FOR NO");
                String input = in.nextLine();

                while (!input.equals("1") && !input.equals("2")) {
                    System.out.println("INVALID COMMAND");
                    input = in.nextLine();
                }
                if (input.equals("1")) {
                    System.out.println("YOU'VE CONTINUED THE JOURNEY");
                } else {
                    System.out.println("YOU'VE EXITED THE DUNGEON");
                    break;
                }
            }


            System.out.println("\n" + d.line4);
            System.out.println("THANKS FOR PLAYING");
            System.out.println(d.line4);
        }
    }