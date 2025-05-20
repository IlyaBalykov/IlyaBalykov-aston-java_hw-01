public abstract class Animal {
    private final String NAME ;
    private final boolean HAS_SPINE;

    protected Animal(String name, boolean hasSpine) {
        NAME = name;
        HAS_SPINE = hasSpine;
    }

    public void spec() {
        System.out.println("This is an animal");
    }

    public void getHasSpine() {
        if(HAS_SPINE) {
            System.out.println("This animal has a spine");
        }
    }

    public static void main(String[] args) {

    }
}
