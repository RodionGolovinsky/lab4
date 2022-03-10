public class Tonuge extends Items{
    Tonuge(String name, boolean moveable, double weightOfSmth, Items.material material, int artical_number) {
        super(name, moveable, weightOfSmth, material, artical_number);
    }

    public void leanOut(){
        System.out.println(getName() + " высунулся ");
    }
    public void require(Santik santik){
        System.out.println( getName() + " требует плату в размере " +santik.amount + " " + santik.name );
    }public int hashCode(Items items){
        if (items.artical_number == artical_number){return items.artical_number;}
        return 0;
    }
}
