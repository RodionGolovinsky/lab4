public class Perp extends Creature{

    Perp(String name, int age, double weight, double height, String genetic_code) {
        super(name, age, weight, height, genetic_code);
    }

    public static void steal(Items item){
        System.out.println( "Банда преступников украла " + item.getName());
    }
    public static void cheat(){
        System.out.println("Банда преступников обманула целую ораву полицейских");
    }
    public static void kill(Creature whom){
        System.out.println("Банда преступников убила " + whom);
    }
    public static void go_away_from_cops() {
        System.out.println("Банда преступников убежала от копов");
    }
    public static String celebrate(String event){
        return  "Банда преступников сегодня празднует " + event;
    }
}
