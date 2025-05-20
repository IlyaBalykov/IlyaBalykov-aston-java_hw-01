public abstract class Animal {
    private String name ;
    private final boolean HAS_SPINE;

    protected Animal(String name, boolean hasSpine) {
        HAS_SPINE = hasSpine;
        this.name = name;
    }

    public void spec() {
        System.out.println("This is an animal");
    }

    public void getHasSpine() {
        if(HAS_SPINE) {
            System.out.println("This animal has a spine");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
