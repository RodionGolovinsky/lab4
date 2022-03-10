public class Goat extends Creature implements inter.Goat_actions{

    Goat(String name, int age, double weight, double height, String genetic_code) {
        super(name, age, weight, height, genetic_code);
    }
    @Override
    public void eat_grass() {
        System.out.println(getName() + " ест травку ам-ням");
    }
    @Override
    public String bleat() {
        return "BAA-A-A-A-A";
    }
    @Override
    public void bash(Creature whom) {
        System.out.println(getName() + " ой как боднул " + whom.getName());
    }
    @Override
    public void grumble(String how) {
        System.out.println(getName() + " поворчал " + how);
    }
}
