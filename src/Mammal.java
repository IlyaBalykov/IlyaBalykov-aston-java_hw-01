public abstract class Mammal extends Animal implements Vertebrate, Fur {

    private final String furColor;

    public Mammal(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    @Override
    public boolean hasSpine() {
        return true;
    };

    @Override
    public boolean hasFur() {
        return furColor != null;
    };
}
