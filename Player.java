public class Player {
    int me;

    void turn(Dice d) {
        d.roll();
        me = d.me;
    }
}
