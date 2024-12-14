public class Main {
    public static void main(String[] args) {
      
        // Creates objects of different animal types
        Animal mammal = new Mammal("Dog", true);
        Animal bird = new Bird("Parrot", true);
        Animal reptile = new Reptile("Snake", true);
        Animal amphibian = new Amphibian("Frog", true);
        Animal invertebrate = new Invertebrate("Spider", true);
        Animal fish = new Fish("Goldfish", true);

        // Demonstrate polymorphism
        Animal[] animals = {mammal, bird, reptile, amphibian, invertebrate, fish};
        for (Animal animal : animals) {
            System.out.println(animal.getName() + ":");
            System.out.println("Sound: " + animal.makeSound());
            System.out.println("Movement: " + animal.move());
            System.out.println();
        }
    }
}
