public class Game {
    Player p1;
    Player p2;
    Dice d1;
    Dice d2;

    Game() {
        p1 = new Player();
        p2 = new Player();
        d1 = new Dice();
        d2 = new Dice();
    }

    void start() {
        p1.turn(d1);
        p2.turn(d2);

        System.out.println(d1.me);
        System.out.println(d2.me);

        judge();
    }

    void judge() {
        if(p1.me < p2.me) {
            System.out.println("Player1:勝ち");
        } else if (p2.me < p1.me) {
            System.out.println("Player2:勝ち");
        }else {
            System.out.println("あいこ");
        }
    }
    
}
