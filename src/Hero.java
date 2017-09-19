import java.util.Random;

enum HeroClass {
    FIGHTER, WIZARD, ROGUE;
}

public enum Hero {
    CONAN( 50, HeroClass.FIGHTER ),
    ALBUS( 50, HeroClass.WIZARD),
    KVOTHE( 50, HeroClass.ROGUE);

    private  int health;
    private  final HeroClass heroClass;

    Hero(int health, HeroClass heroClass) {
        this.health = health;
        this.heroClass = heroClass;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public static void fight(Hero attacker, Hero defender) {
        Random random = new Random();
        if( random.nextInt(100) > 50 ) {
            attacker.setHealth( attacker.getHealth() - 10 );
        } else {
            defender.setHealth( defender.getHealth() - 10 );
        }
    }
}

