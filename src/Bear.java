public class Bear extends Mammal implements Wool {
    private static final String ANIMAL_SPEC = "bear";

    public Bear(String name) {
        super(name);
    }

    @Override
    public void wool() {
        System.out.printf("The %s has fur\n", ANIMAL_SPEC);
    }
    public String getName() {
        return name;
    }
}
