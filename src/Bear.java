public class Bear extends Mammal {
    private static final String ANIMAL_SPEC = "bear";

    public Bear(String name, boolean hasWool) {
        super(name);
    }

    @Override
    public boolean hasWool() {
        return true;
    }
}
