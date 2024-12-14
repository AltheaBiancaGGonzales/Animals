public class Mammal extends Animal {
    private boolean hasFur;
  
    public Mammal(String name, boolean hasFur) {
        super(name);
        this.hasFur = hasFur;
    }

    @Override
    public String makeSound() {
        return "Some mammals bark, meow, or roar.";
    }

    @Override
    public String move() {
        return "Mammals usually walk or run on legs.";
    }

    public boolean hasFur() {
        return hasFur;
    }
}
