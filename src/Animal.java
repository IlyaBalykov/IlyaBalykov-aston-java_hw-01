public abstract class Animal {
    private String name ;
    private final boolean HAS_SPINE;

    protected Animal(String name, boolean hasSpine) {
        HAS_SPINE = hasSpine;
        this.name = name;
    }

    public String spec() {
        return "This is an animal";
    }

    public String getHasSpine() {
        if(HAS_SPINE) {
            return "This animal has a spine";
        }
        return "This animal does not have a spine";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Mammal polarBear = new Bear("Misha");
        polarBear.getName();
        polarBear.getHasSpine();
        polarBear.hasWool();

        Mammal persianCat = new Cat("Barsik", true);
        persianCat.getName();
        persianCat.getHasSpine();
        persianCat.getHasWool();

        Mammal blueWhale = new Whale("Whale");
        blueWhale.getName();
        blueWhale.getHasSpine();
        blueWhale.getHasWool();

        Fish goldenFish = new Fish("Gold");
        goldenFish.getName();
        goldenFish.getHasSpine();
        goldenFish.getLivesInWater();
    }
}
