import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.io.IOException.*;

public class Dunno extends Creature implements inter.Dunno_actions {

    Dunno(String name, int age, double weight, double hieght, String genetic_code) {
        super(name, age, weight, hieght, genetic_code);
    }

    @Override
    public String joke() throws EmptyJokeException {
        int chance = (int) (Math.random() * 10 - 8);
        if (chance == 2) {
            return "— Чем отличается программист от политика?\n" + " — Программисту платят деньги за работающие программы";
        }
        if (chance == 1) {
            return "Пьют химики-аналитики.\n" +
                    "- Вась, давай еще налью.\n" +
                    "- Нее, я в точке эквивалентности...еще одна -и перетитруюсь.";
        }
        throw new EmptyJokeException("!А, нет, штуки не будет, у персонажа " + getName() + " нет настроения");
    }

    @Override
    public void dont_know() {
        System.out.println(getName() + " не знает:(");
    }

    @Override
    public void dance() {
        System.out.println(getName() + " решил немного потанцевать под современную музыку");
    }

    @Override
    public void make_trouble() {
        class problems {
            String meaning;

            problems(String meaning) {
                this.meaning = meaning;
            }
        }
        problems problems = new problems("разлил кислоту");
        System.out.println("Кажется, " + getName() + " снова натворил делов \n" + "В этот раз персонаж " + problems.meaning);
    }
}





