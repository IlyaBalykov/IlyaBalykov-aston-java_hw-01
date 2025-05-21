public class Whale extends Mammal implements LivesInWater{
    private static final String ANIMAL_SPEC = "whale";

    public Whale(String name) {
        super(name);
    }

    @Override
    public String getLivesInWater() {
        return "The " + ANIMAL_SPEC + " lives in water";
    }

    @Override
    public boolean getHasWool() {
        return false;
    }
}
