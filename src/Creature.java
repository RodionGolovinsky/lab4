public abstract class Creature {
     private String name;
     private int age;
     private double weight;
     private double height;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getGenetic_code() {
        return genetic_code;
    }

    private String genetic_code;
    Creature(String name, int age, double weight, double height, String genetic_code){
        this.name =name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.genetic_code = genetic_code;
    }
    public void makeBed(Creature whom){
        System.out.println( name + " заправил кровать, принадлежащую существу с именем "+ whom.name);
            }
    public boolean wantSleep(boolean wantToSleep){
return wantToSleep;
    }
   public void goTo(String where){
       System.out.println(name + " направился " + where);
       }
    public void turnHandle(){
            System.out.println(name + " повернул рукоятку");
        }
    public void put(Items item, String where){
        System.out.println(name + "положил " + item + " теперь он находится: " + where) ; }
    public void put(Currency currency, Items item){
        System.out.println(name + " положил "+ currency.amount + " " +currency.name + " на " + item.getName());
    }
    public void watchTV(String film){
        System.out.println(name + " решил посмотреть фильм под названием " + film);
    }
    public String see(String what){
        return  name + " увидел " + what;
    }
    public String say (String what){
        return name + " сказал " + what;
    }
    public String decide(String what){
       return name + " решил " + what;
    }
    public void take_out (Items item){
        System.out.println(name + " вынул " + item.getName());
    }
    public void take_out(Currency currency){
        System.out.println(name + " вынул " + currency.amount + " " + currency.name);
    }
    @Override
    public boolean equals(Object o){
        Creature creature = (Creature) o;
        return creature.genetic_code == genetic_code;
    }
    @Override
    public String toString(){
        return "Перед вами существо, имя которого " + name + "\n Вес: " + weight  + "\n Рост: " + height +  "\n Возраст: " + age;
    }
}
