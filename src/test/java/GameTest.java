import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void testFightWhenFirstPlayerStronger() {
        Game game = new Game();
        Player jin = new Player(1, "Jin", 60);
        Player kazuya = new Player(2, "Kazuya", 50);
        game.register(jin);
        game.register(kazuya);

        int actual = game.round("Jin", "Kazuya");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFightWhenSecondPlayerStronger() {
        Game game = new Game();
        Player jin = new Player(1, "Jin", 50);
        Player kazuya = new Player(2, "Kazuya", 60);
        game.register(jin);
        game.register(kazuya);

        int actual = game.round("Jin", "Kazuya");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testFightWhenDraw() {
        Game game = new Game();
        Player jin = new Player(1, "Jin", 50);
        Player kazuya = new Player(2, "Kazuya", 50);
        game.register(jin);
        game.register(kazuya);

        int actual = game.round("Jin", "Kazuya");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testFightWhenFirstPlayerIsNotRegister() {
//        Game game = new Game();
//        Player jin = new Player(1, "Jin", 60);
//        Player kazuya = new Player(2, "Kazuya", 50);
//
//        game.register(kazuya);
//
//        int actual = game.round("Jin", "Kazuya");
//
//
//        Assertions.assertThrows(NotRegisteredException.class,
//                () -> game.round("Jin","Kazuya"));
//    }
}