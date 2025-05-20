public abstract class Animal {
    private String name;
    private boolean hasSpine;

    protected Animal(String name, boolean hasSpine) {
        this.name = name;
        this.hasSpine = hasSpine;
    }

    public void spec() {
        System.out.println("This is an animal");
    }

    public void getHasSpine() {
        if(hasSpine) {
            System.out.println("This animal has a spine");
        }
    }

    public static void main(String[] args) {

    }
}
