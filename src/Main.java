public class Main {

    public static void main(String[] args) {
	// write your code here
        Hero attacker = Hero.CONAN;
        Hero defender = Hero.ALBUS;

        while( attacker.getHealth() > 0 && defender.getHealth() > 0 ) {
            Hero.fight( attacker, defender );
            System.out.println("Attacker: " + attacker.getHealth());
            System.out.println("Defender: " + defender.getHealth());
        }

        if( attacker.getHealth() > defender.getHealth() ) {
            System.out.println("Attacker won!");
        } else {
            System.out.println("Defender won!");
        }


    }
}
