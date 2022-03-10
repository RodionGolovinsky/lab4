public class Frame extends Items{

    Frame(String name, boolean moveable, double weightOfSmth, Items.material material, int artical_number) {
        super(name, moveable, weightOfSmth, material, artical_number);
    }

    public static void flicker(String film){
        System.out.println("Замелькали кадры" + film);
    }
    public int hashCode(Items items){
        if (items.artical_number == artical_number){return items.artical_number;}
        return 0;
    }
}
