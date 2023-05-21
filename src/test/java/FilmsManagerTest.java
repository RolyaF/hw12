import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmsManagerTest {

    @Test
    public void testAddFilm() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентльмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        String[] actual = manager.findAll();
        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентльмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер один"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void testLastFilm() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентльмены");
        manager.addFilm("Человек-невидимка");

        String[] actual = manager.findLast();
        String[] expected = {"Человек-невидимка", "Джентльмены", "Отель Белград", "Вперед", "Бладшот"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void testLastFilm2() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентльмены");

        String[] actual = manager.findLast();
        String[] expected = {"Джентльмены", "Отель Белград", "Вперед", "Бладшот"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void testLastFilm3() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентльмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        String[] actual = manager.findLast();
        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград"};
        Assertions.assertArrayEquals(actual, expected);
    }
}