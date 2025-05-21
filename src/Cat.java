public class Cat extends Mammal {
    private static final String ANIMAL_SPEC= "cat";
    private final boolean hasWool;

    public Cat(String name, boolean hasWool) {
        super(name);
        this.hasWool = hasWool;
    }

    @Override
    public boolean getHasWool() {
        return hasWool;
    }
}
