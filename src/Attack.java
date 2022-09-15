/*import java.util.*;

public class Attack {
    public void attacks() {}
    Scanner choice = new Scanner(System.in);
    Random rand = new Random();
    classCharacters c;

    public Attack(classCharacters c) {
        this.c = new classCharacters();
        c.Characters();

        int characterHealth = rand.nextInt(c.maxCharHealth);
        int enemyHealth = rand.nextInt(c.maxEnemyHealth);
        int punch = rand.nextInt(c.punchDamage);
        int kick = rand.nextInt(c.kickDamage);
        int stab = rand.nextInt(c.slashDamage);
        int bite = rand.nextInt(c.biteDamage);

        String enemy = c.enemies[rand.nextInt(c.enemies.length)];

        while (true) {

            System.out.println("\t1. PUNCH");
            System.out.println("\t2. KICK");
            System.out.println("\t3. SLASH");
            System.out.println("\t4. BITE ");

            String input = choice.nextLine();


            if (c.equals("1")) {
                int punchDamage = rand.nextInt();
                int damageTaken = rand.nextInt(c.enemyAttackDamage);

                enemyHealth -= punch;
                characterHealth -= damageTaken;

                System.out.println("\t> YOU PUNCHED  " + enemy + " FOR " + punchDamage + " DAMAGE.");
                System.out.println("\t> YOU RECEIVED " + damageTaken + " DAMAGE IN RETALIATION!");

                if (characterHealth < 1) {
                    System.out.println("\t>YOU HAVE TAKEN TOO MUCH DAMAGE, YOU ARE TOO WEAK TO GO ON!®");
                    break;
                }

            } else if (input.equals("2")) {
                int kickDamage = rand.nextInt(c.kickDamage);
                int damageTaken = rand.nextInt(c.enemyAttackDamage);
                enemyHealth -= kick;
                characterHealth -= damageTaken;

                System.out.println("\t> YOU KICKED  " + enemy + " FOR " + kickDamage + " DAMAGE.");
                System.out.println("\t> YOU RECEIVED " + damageTaken + " DAMAGE IN RETALIATION!");

                if (characterHealth < 1) {
                    System.out.println("\t>YOU HAVE TAKEN TOO MUCH DAMAGE, YOU ARE TOO WEAK TO GO ON!®");
                    break;
                }

            } else if (input.equals("3")) {
                int slashDamage = rand.nextInt(c.slashDamage);
                int damageTaken = rand.nextInt(c.enemyAttackDamage);
                enemyHealth -= stab;
                characterHealth -= damageTaken;

                System.out.println("\t> YOU STABBED  " + enemy + " FOR " + slashDamage + " DAMAGE.");
                System.out.println("\t> YOU RECEIVED " + damageTaken + " DAMAGE IN RETALIATION!");

                if (characterHealth < 1) {
                    System.out.println("\t>YOU HAVE TAKEN TOO MUCH DAMAGE, YOU ARE TOO WEAK TO GO ON!®");
                    break;
                }

            } else if (input.equals("3")) {
                int biteDamage = rand.nextInt(c.biteDamage);
                int damageTaken = rand.nextInt(c.enemyAttackDamage);
                enemyHealth -= bite;
                characterHealth -= damageTaken;

                System.out.println("\t> YOU BIT  " + enemy + " FOR " + biteDamage + " DAMAGE.");
                System.out.println("\t> YOU RECEIVED " + damageTaken + " DAMAGE IN RETALIATION!");

                if (characterHealth < 1) {
                    System.out.println("\t>YOU HAVE TAKEN TOO MUCH DAMAGE, YOU ARE TOO WEAK TO GO ON!®");
                    break;
                }

            } else {
                System.out.println("\tINVALID COMMAND!!!");
            }
        }

    }
}
*/











