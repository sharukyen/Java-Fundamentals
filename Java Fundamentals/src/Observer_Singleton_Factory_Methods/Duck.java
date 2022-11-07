package Observer_Singleton_Factory_Methods;

/**
 *Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
 *
 * Consider the following definitions:
 *
 * interface Animal {
 *     public String getAnimal();
 *     public String getSound();
 * }
 * enum AnimalType { DUCK, CAT, DOG }
 * 1. Define a class named Duck which implements the Animal interface. The Duck class contains the following:
 *
 * A method named getAnimal() which returns "Duck".
 * A method named getSound() which returns "Squeaks".
 * 2. Define a class named Cat which implements the Animal interface. The Cat class contains the following:
 *
 * A method named getAnimal() which returns "Cat".
 * A method named getSound() which returns "Meow".
 * 3. Define a class named Dog which implements the Animal interface. The Dog class contains the following:
 *
 * A method named getAnimal() which returns "Dog".
 * A method named getSound() which returns "Woof".
 * 4. Define a class named AnimalFactory which represents the factory pattern and create an object based on the types. The AnimalFactory class contains the following:
 *
 * A method named createAnimal(AnimalType animalType) which takes an animal type enum as a parameter returns an object of the given type.
 */
interface Animal {
    public String getAnimal();
    public String getSound();
}
enum AnimalType { DUCK, CAT, DOG }

public class Duck implements Animal {
    @Override
    public String getAnimal() { return "Duck";}
    @Override
    public String getSound() {return "Squeaks";}
}
class Cat implements Animal {
    @Override
    public String getAnimal() { return "Cat";}
    @Override
    public String getSound() {return "Meow";}
}
class Dog implements Animal {
    @Override
    public String getAnimal() { return "Dog";}
    @Override
    public String getSound() {return "Woof";}
}
class AnimalFactory {
    public Animal createAnimal(AnimalType animalType) {
        if (animalType == AnimalType.DUCK) {
            return new Duck();
        } else if (animalType == AnimalType.CAT) {
            return new Cat();
        } else if (animalType == AnimalType.DOG) {
            return new Dog();
        }
        return null;
    }

    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal a1 = factory.createAnimal(AnimalType.DOG);
        System.out.println(a1.getSound());
        Animal a2 = factory.createAnimal(AnimalType.CAT);
        System.out.println(a2.getSound());
    }
}
