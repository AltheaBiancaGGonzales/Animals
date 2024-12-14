public class Invertebrate extends Animal {
    private boolean hasExoskeleton;

    public Invertebrate(String name, boolean hasExoskeleton) {
        super(name);
        this.hasExoskeleton = hasExoskeleton;
    }
    @Override
    public String makeSound() {
        return "Invertebrates are mostly silent.";
    }
    @Override
    public String move() {
        return "Invertebrates crawl, swim, or glide.";
    }
    public boolean hasExoskeleton() {
        return hasExoskeleton;
    }
}
