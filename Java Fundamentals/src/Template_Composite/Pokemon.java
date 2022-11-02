package Template_Composite;

/**
 *
 */

abstract class Pokemon {
    protected String name;
    protected int power;
    protected int attack;
    protected int defense;

    public Pokemon(String name, int power, int attack, int defense) {
        this.name = name;
        this.power = power;
        this.attack = attack;
        this.defense = defense;
    }

    public String toString() {
        return String.format("%s,power=%d,attack=%d,defense=%d", name, power, attack, defense);
    }

    public final void showDamage() { //template method, final so subclasses can't override
        int damage = calculateImpact() * power;
        power -= 1;
        System.out.printf("%s's damage is : %d\n", name, damage);
    }

    public abstract int calculateImpact();

}

class FlightingPokemon extends Pokemon {
    public FlightingPokemon(String name, int power, int attack, int defense) {
        super(name, power, attack, defense);
    }

    public int calculateImpact() {
        return attack + defense;
    }
}
class PoisonPokemon extends Pokemon {
    public PoisonPokemon(String name, int power, int attack, int defense) {
        super(name, power, attack, defense);
    }
    public int calculateImpact() {
        return (attack-defense);
    }
}

class GroundPokemon extends Pokemon {
    public GroundPokemon(String name, int power, int attack, int defense) {
        super(name, power, attack, defense);
    }
    public int calculateImpact () {
        return defense;
    }
}

class tests{
        public static void main(String[] args) {
            Pokemon passimian = new FlightingPokemon("Passimian", 100, 10, 10);
            passimian.showDamage();
            System.out.println(passimian);
            Pokemon poipole = new PoisonPokemon("Poipole", 10, 5, 3);
            poipole.showDamage();
            System.out.println(poipole);
            Pokemon passiman = new GroundPokemon("Passiman", 100, 10, 10);
            passiman.showDamage(); System.out.println(passiman);
    }
}
