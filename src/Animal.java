public abstract class Animal {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Mammal polarBear = new Bear("Misha", "white");
        polarBear.getName();
        polarBear.getFurColor();
        polarBear.hasSpine();

        Mammal persianCat = new Cat("Barsik", "black");
        persianCat.getName();
        persianCat.getFurColor();
        persianCat.hasSpine();

        Mammal blueWhale = new Whale("Whale");
        blueWhale.getName();
        blueWhale.getFurColor();
        blueWhale.hasSpine();

        Fish goldenFish = new Fish("Gold");
        goldenFish.getName();
        goldenFish.getLivesInWater();
        goldenFish.hasSpine();
    }
}