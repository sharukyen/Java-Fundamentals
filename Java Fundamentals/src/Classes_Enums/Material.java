package Classes_Enums;
/*
Consider the following enum:
enum Material { WOOD, GRASS; }
Define a static method named getFireRisk(double rainfall, Material item) which takes a double and an enum as parameters.
The first parameter defines the amount of rainfall and the second parameter defines the type of material (i.e. either wood or grass).
The method returns a fire risk level "LOW", "MEDIUM" or "HIGH" according to the values in the following table.
This method should return a String object.
 */

public enum Material { WOOD, GRASS;

    public static String getFireRisk(double rainfall, Material item) {
        if (item == Material.WOOD)
            if (rainfall < 20)
                return "MEDIUM";
            else return "LOW";
        else
        if (rainfall < 20)
            return "HIGH";
        else return "MEDIUM";
    }

    public static void main(String[] args) {
        System.out.println(getFireRisk(80, Material.WOOD));
        System.out.println(getFireRisk(8, Material.WOOD));
        System.out.println(getFireRisk(28, Material.GRASS));
        System.out.println(getFireRisk(12, Material.GRASS));
        System.out.println(getFireRisk(4, Material.WOOD));

    }
}
