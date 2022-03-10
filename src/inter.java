public class inter {
    interface Dunno_actions {
        String joke() throws EmptyJokeException;

        void dont_know();

        void dance();

        void make_trouble();
    }

    interface Goat_actions {
        void eat_grass();

        String bleat();

        void bash(Creature whom);

        void grumble(String how);
    }

    interface Tongue_action {
        void fee_claim();
    }

    interface film {
        void show();
    }


}

