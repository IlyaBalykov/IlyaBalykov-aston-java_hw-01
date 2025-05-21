public class Fish extends Animal implements LivesInWater, Vertebrate {
    protected static final String ANIMAL_SPEC = "fish";

    public Fish(String name) {
        super(name);
    }

    @Override
    public String getLivesInWater() {
        return "The " + ANIMAL_SPEC + "lives in water";
    }

    @Override
    public boolean hasSpine() {
        return true;
    }
}
