import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.afisha.AfishaManager;

public class AfishaManagerTest {

    @Test
    public void noAddMovieTitle() {
        AfishaManager manager = new AfishaManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovieTitle() {
        AfishaManager manager = new AfishaManager();
        manager.addMovieTitle("Title 1");

        String[] expected = {"Title 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addSomeMovieTitle() {
        AfishaManager manager = new AfishaManager();
        manager.addMovieTitle("Title 1");
        manager.addMovieTitle("Title 2");
        manager.addMovieTitle("Title 3");

        String[] expected = {"Title 1", "Title 2", "Title 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovieTitle() {
        AfishaManager manager = new AfishaManager();
        manager.addMovieTitle("Title 1");
        manager.addMovieTitle("Title 2");
        manager.addMovieTitle("Title 3");

        String[] expected = {"Title 3", "Title 2", "Title 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast1MovieTitle() {
        AfishaManager manager = new AfishaManager();
        manager.addMovieTitle("Title 1");
        manager.addMovieTitle("Title 2");
        manager.addMovieTitle("Title 3");
        manager.addMovieTitle("Title 4");
        manager.addMovieTitle("Title 5");
        manager.addMovieTitle("Title 6");
        manager.addMovieTitle("Title 7");

        String[] expected = {"Title 7", "Title 6", "Title 5", "Title 4", "Title 3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast2MovieTitle() {
        AfishaManager manager = new AfishaManager();
        manager.addMovieTitle("Title 1");
        manager.addMovieTitle("Title 2");
        manager.addMovieTitle("Title 3");
        manager.addMovieTitle("Title 4");
        manager.addMovieTitle("Title 5");


        String[] expected = {"Title 5", "Title 4", "Title 3", "Title 2", "Title 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
