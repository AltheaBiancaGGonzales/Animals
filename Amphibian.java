public class Amphibian extends Animal {
    private boolean isAquatic;

    public Amphibian(String name, boolean isAquatic) {
        super(name);
        this.isAquatic = isAquatic;
    }

    @Override
    public String makeSound() {
        return "Amphibians croak or make unique sounds.";
    }

    @Override
    public String move() {
        return isAquatic ? "Amphibians swim in water." : "Amphibians hop or crawl.";
    }

    public boolean isAquatic() {
        return isAquatic;
    }
}
