public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public String makeSound() {
        return "Birds chirp, sing, or squawk.";
    }

    @Override
    public String move() {
        return canFly ? "Birds fly using their wings." : "Some birds walk or run.";
    }

    public boolean canFly() {
        return canFly;
    }
}
