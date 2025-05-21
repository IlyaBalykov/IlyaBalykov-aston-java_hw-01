public class Bear extends Mammal {
    private static final String ANIMAL_SPEC = "bear";

    public Bear(String name) {
        super(name);
    }

    @Override
    public boolean getHasWool() {
        return true;
    }
}
