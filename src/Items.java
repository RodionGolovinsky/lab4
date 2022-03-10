public abstract class Items {
    public String getName() {
        return name;
    }

    public double getWeightOfSmth() {
        return weightOfSmth;
    }

    public boolean isMoveable() {
        return moveable;
    }

    public static Items.material getMaterial() {
        return material;
    }

    public int getArtical_number() {
        return artical_number;
    }

    private String name;
    private double weightOfSmth;
    private boolean moveable;
    private static material material;
    int artical_number;
Items(String name, boolean moveable, double weightOfSmth, material material, int artical_number){
    this.name=name;
    this.moveable=moveable;
    this.weightOfSmth = weightOfSmth;
    this.material = material;
    this.artical_number = artical_number;
}
    public void describe(){}
    public void lie(){}
    public void breaken(){
        System.out.println(name + " - этот предмет сломался");
    }
    public void fallDown(){
        System.out.println(name + " - этот предмет упал");
    }
    public static void disappear(Items item){
        System.out.println( item.name + " - этот объект исчез");
    }
    public int hashCode(Items items){
        if (items.artical_number == artical_number){return items.artical_number;}
        return 0;
    }
    public enum material {
        gold,
        iron,
        wood,
        liquidCrystals,
        fantasy,
        strangeMaterial,
        plastic,
        photons }
}
