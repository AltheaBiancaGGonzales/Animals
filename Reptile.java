public class Reptile extends Animal {
    private boolean hasScales;

    public Reptile(String name, boolean hasScales) {
        super(name);
        this.hasScales = hasScales;
    }

    @Override
    public String makeSound() {
        return "Reptiles hiss or are silent.";
    }

    @Override
    public String move() {
        return "Reptiles slither or crawl.";
    }

    public boolean hasScales() {
        return hasScales;
    }
}
