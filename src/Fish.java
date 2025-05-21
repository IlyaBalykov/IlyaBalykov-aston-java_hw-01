public class Fish extends Animal implements LivesInWater {
    protected static final String ANIMAL_SPEC = "fish";

    public Fish(String name) {
        super(name, true);
    }

    @Override
    public String getLivesInWater() {
        return "The " + ANIMAL_SPEC + "lives in water";
    }
}
