public class Policeman extends Creature{

    Policeman(String name, int age, double weight, double height, String genetic_code) {
        super(name, age, weight, height, genetic_code);
    }
    public static void trap(Perp [] perp){
            System.out.println( "Орава полицейских ловит шайку из " + perp.length + " преступников" );
        }
    public static void organizeEvents(Events event1, Events event2, Events event3){
        System.out.println("Орава полицейских устраивает " + event1 + ", и " + event2+ ", и " + event3);
    }
    public static void organizeEvents(Events event1, Events event2){
        System.out.println( "Орава полицейских устраивает " + event1 + " и " + event2);
    }
    public void organizeEvents(Events event){
        System.out.println(getName() + " устраивает " + event );
    }
        public void eat_Donuts() {
            System.out.println(getName() + " решил устроить перекус. Он есть понички ");
        }
        public String ignore_Important_Problem(){
        return " Важная проблема? Случилось что-то серьезное? НЕ, не слышали!";
        }

    enum Events{
        RAID,
        AMBUSH,
        SURPRISE_ATTACK,
        NEW_YEAR_PARTY
    }


}
