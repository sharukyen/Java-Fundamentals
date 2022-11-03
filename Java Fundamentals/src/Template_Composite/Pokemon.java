package Template_Composite;

/**
 *Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
 * Define an abstract class named Pokemon which defines a Pokemon. A Pokemon has a set of attributes, such as name, power, attack, and defense.
 * There is a classification of types of Pokemon, such as FightingPokemon, PoisonPokemon, and GroundPokemon, which define a concrete method called showDamage() that prints a numerical value (damage) depending on the attributes and the type of Pokemon.
 * The Pokemon class contains the following:
 * A constructor which takes a name, a power level, an attack level and a defense level as parameters and creates a pokemon.
 * An abstract method named calculateImpact() which returns the impact level as an int.
 * A final method named showDamage() which prints the damage level. The damage level is calculated by the impact level * the power level. The method should also deduct the power level by 1 after this method is invoked.
 * A public method named toString() which return a string representation of the object as shown in the examples below.
 *
 * Continuing on from the previous question, define a concrete subclass named FightingPokemon which extends the abstract Pokemon superclass. The FightingPokemon class contains the following
 * A constructor which takes a name, a power level, attack level, and a defense level as parameters and creates a pokemon object.
 * A method named calculateImpact() which calculates the impact level of a fighting pokemon. The method should return an integer. The impact is calculated by attack + defense.
 *
 * Continuing on from the previous question, define a concrete subclass named PoisonPokemon which extends the abstract Pokemon superclass. The PoisonPokemon class contains the following
 * A constructor which takes a name, a power level, attack level, and a defense level as parameters and creates a pokemon object.
 * A method named calculateImpact() which calculates the impact level of a flighting pokemon. The method should return an integer. The impact is calculated by attack - defense.
 *
 * Continuing on from the previous question, define a concrete subclass named GroundPokemon which extends the abstract Pokemon superclass. The GroundPokemon class contains the following
 * A constructor which takes a name, a power level, attack level, and a defense level as parameters and creates a pokemon object.
 * A method named calculateImpact() which calculates the impact level of a flighting pokemon. The method should return an integer. The impact is calculated by the defense level.
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

class FightingPokemon extends Pokemon {
    public FightingPokemon(String name, int power, int attack, int defense) {
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
            Pokemon passimian = new FightingPokemon("Passimian", 100, 10, 10);
            passimian.showDamage();
            System.out.println(passimian);
            Pokemon poipole = new PoisonPokemon("Poipole", 10, 5, 3);
            poipole.showDamage();
            System.out.println(poipole);
            Pokemon passiman = new GroundPokemon("Passiman", 100, 10, 10);
            passiman.showDamage(); System.out.println(passiman);
    }
}
