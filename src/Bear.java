public class Bear extends Mammal implements Wool {
    private static final String ANIMAL_SPEC = "bear";
    private String animalName;

    public Bear(String name) {
        this.animalName = name;
    }

    @Override
    public void wool() {
        System.out.printf("The %s has fur\n", ANIMAL_SPEC);
    }

    public String getName() {
        return animalName;
    }
}
