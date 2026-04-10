package Classes_Objects;

public class AnimalDriver {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.species = "dog";
        dog.name = "Fahmida";
        dog.age = 27;
        dog.gender = "female";
        dog.height = 5.1F;
        dog.weight = 56.5F;

        dog.activities();
    }
}
