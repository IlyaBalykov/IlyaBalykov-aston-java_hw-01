public class Fish extends Animal implements LivesInWater {
    protected static final String ANIMAL_SPEC = "fish";

    public Fish(String name) {
        super(name, true);
    }

    @Override
    public void water() {
        System.out.printf("The %s lives in water\n", ANIMAL_SPEC);
    }
}
