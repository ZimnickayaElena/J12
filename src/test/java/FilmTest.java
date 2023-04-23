import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {

    @Test
    public void addFilmTest() {
        FilmManager manager = new FilmManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");


        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addZeroFilmTest() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastMoreLimitTest() {
        FilmManager manager = new FilmManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");


        String[] expected = {"film7", "film6", "film5", "film4", "film3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastLimitTest() {
        FilmManager manager = new FilmManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");

        String[] expected = {"film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastBeforeLimitTest() {
        FilmManager manager = new FilmManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");

        String[] expected = {"film3", "film2", "film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }


}
