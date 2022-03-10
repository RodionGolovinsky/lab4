public class Prog extends inter {
    public static void main(String[] args) throws EmptyJokeException, NeedSleepException {
        Dunno dunno = new Dunno("Незнайка", 12, 40, 120, "TGCCCATG");
        Goat goat = new Goat("Козлик", 5, 27, 100, "GTAAATGT");
        Policeman[] policemans = new Policeman[10];
        Policeman policeman = new Policeman(" ", 35, 130, 150, "GTTAGGGA");
        Perp[] perps = new Perp[10];
        TV tv = new TV("Телевизор", true, 5, Items.material.plastic, 334567);
        Tonuge tonuge = new Tonuge("Язычок ", false, 0.8, Items.material.wood, 122788);
        Santik santik5 = new Santik(" сантиков", 5);
        TV.Screen screen = tv.new Screen("Экран", false, 0.1, Items.material.liquidCrystals, 45678932);
        Values values = new Values("драгоценности дорогие очень сильно", true, 0.5, Items.material.gold, 58558511);
        film film = new film() {
            @Override
            public void show() {
                System.out.println("В фильме показывалось следующее: ");
            }
        };
        goat.makeBed(goat);
        goat.goTo(" к кровати Незнайки");
        goat.makeBed(dunno);
// if ((dunno.wantSleep(false))
//     & (goat.wantSleep(false))) {
//  System.out.println( "Друзья хотят спать");
// } System.out.println("Друзья ещё не хотят спать, поэтому " +
//             "они решают смотреть телевизор");
        if ((dunno.wantSleep(true)) & (goat.wantSleep(true))) {
            System.out.println("Друзья ещё не хотят спать, поэтому они решают смотреть телевизор");
        } else {
            try {
                throw new NeedSleepException("Как минимум один из друзей хочет спать, поэтому просмотр телевизора отменяется");
            } catch (NeedSleepException e) {
                e.printStackTrace();
            }
        }
        Creature[] friends = {dunno, goat};
        goat.goTo("к TV");
        goat.turnHandle();
        tv.on_off(false);
        tonuge.leanOut();
        tonuge.require(santik5);
        goat.grumble("немного");
        goat.take_out(santik5);
        goat.put(santik5, tonuge);
        Currency.disappear(santik5, " в утробе телевизора");
        screen.light_up();
        Frame.flicker(" незнакомого фильма");
        film.show();
        Perp.steal(values);
        Policeman.trap(perps);
        Policeman.organizeEvents(Policeman.Events.RAID, Policeman.Events.AMBUSH, Policeman.Events.SURPRISE_ATTACK);
        Perp.cheat();
        Perp.go_away_from_cops();
        System.out.println("\nНа этом моменте остается только применить локальный класс)");
        dunno.make_trouble();
//     System.out.println("А теперь время для шутки!");
//     System.out.println(dunno.name + " рассказывает анекдот: "+ dunno.joke());
    }
}
