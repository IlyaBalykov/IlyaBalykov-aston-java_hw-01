public class Cat extends Mammal implements Wool {
    private static final String ANIMAL_SPEC= "cat";

    public Cat(String name) {
        super(name);
    }
    @Override
    public void wool() {
        System.out.printf("The %s has fur\n", ANIMAL_SPEC);
    }
    public String getName() {
        return this.name;
    }
}
