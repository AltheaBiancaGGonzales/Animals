public class Fish extends Animal {
    private boolean hasFins;

    public Fish(String name, boolean hasFins) {
        super(name);
        this.hasFins = hasFins;
    }

    @Override
    public String makeSound() {
        return "Fish make bubbling or no sounds.";
    }

    @Override
    public String move() {
        return "Fish swim using their fins.";
    }
  
    public boolean hasFins() {
        return hasFins;
    }
}
