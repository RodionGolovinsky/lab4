public class Shelf extends Items {
    Shelf(String name, boolean moveable, double weightOfSmth, Items.material material, int artical_number) {
        super(name, moveable, weightOfSmth, material, artical_number);
    }

    public int hashCode(Items items) {
        if (items.artical_number == artical_number) {
            return items.artical_number;
        }
        return 0;
    }
}
