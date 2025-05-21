public class Whale extends Mammal implements LivesInWater{
    private static final String ANIMAL_SPEC = "whale";

    public Whale(String name) {
        super(name);
    }

    @Override
    public void water() {
        System.out.printf("The %s lives in water\n", ANIMAL_SPEC);
    }

    @Override
    public boolean getHasWool() {
        return false;
    }
}
