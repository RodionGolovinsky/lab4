public class TV extends Items{
    TV(String name, boolean moveable, double weightOfSmth, Items.material material, int artical_number) {
        super(name, moveable, weightOfSmth, material, artical_number);
    }

    public class Screen extends Items{

        Screen(String name, boolean moveable, double weightOfSmth, Items.material material, int artical_number) {
            super(name, moveable, weightOfSmth, material, artical_number);
        }
        public void light_up(){
            System.out.println(getName() + " засветился");
        }
        public int hashCode(Items items){
            if (items.artical_number == artical_number){return items.artical_number;}
            return 0;
        }
    }

    public static void show(){
        System.out.println("В фильме показывалось: ");
    }public int hashCode(Items items){
        if (items.artical_number == artical_number){return items.artical_number;}
        return 0;
    }

    public void on_off(boolean ind){
        if (ind) {
            System.out.println( getName() + " включился");
        }
        System.out.println(getName() + " не включился");
    }
}
