
import org.junit.Test;
import static org.junit.Assert.*;

public class testISBN {

    public testISBN() {
    }

    @Test
    public void longitudCorrecta() {
        String isbn = "978-84-473-5602-7";
        assertTrue(ISBN.esValido(isbn));
    }

    @Test
    public void longitudIncorrecta() {
        String isbn = "978-845-573-5602-7";
        assertFalse(ISBN.esValido(isbn));

        isbn = "978-5-573-5602-7";
        assertFalse(ISBN.esValido(isbn));
    }

    @Test
    public void guionesValidos() {
        String isbn = "978-84-473-5602-7";
        assertTrue(ISBN.esValido(isbn));
    }

    @Test
    public void guionesInvalidos() {
        String isbn = "978-84-473-56-2-7";
        assertFalse(ISBN.esValido(isbn));

        isbn = "978-849473-5602-7";
        assertFalse(ISBN.esValido(isbn));
    }

    @Test
    public void guionesSeguidos() {
        String isbn = "978-84--735602-7";
        assertFalse(ISBN.esValido(isbn));
    }

    @Test
    public void digitosValidos() {
        String isbn = "978-84-473-5602-7";
        assertTrue(ISBN.esValido(isbn));
    }

    @Test
    public void digitosInvalidos() {
        String isbn = "978-84-4A3-5602-7";
        assertFalse(ISBN.esValido(isbn));
    }

    @Test
    public void ultimoGuionValido() {
        String isbn = "978-84-473-5602-7";
        assertTrue(ISBN.esValido(isbn));
    }

    @Test
    public void ultimoGuionInvalido() {
        String isbn = "978-84-473-560-27";
        assertFalse(ISBN.esValido(isbn));
    }

    @Test
    public void ultimoDigitoValido() {
        String isbn = "978-84-473-5602-7";
        assertTrue(ISBN.esValido(isbn));
    }

    @Test
    public void ultimoDigitoNoValido() {
        String isbn = "978-84-473-5602-4";
        assertFalse(ISBN.esValido(isbn));
    }
}
