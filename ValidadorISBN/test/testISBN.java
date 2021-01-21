
import org.junit.Test;
import static org.junit.Assert.*;

public class testISBN {
    
    public testISBN() {
    }

    @Test
    public void longitudCorrecta() {
        String isbn = "84-226-1586-X";
        assertTrue(ISBN.esValido(isbn));
    }
    
    @Test
    public void longitudIncorrecta() {
        String isbn = "12345-456-789-X";
        assertFalse(ISBN.esValido(isbn));
        
        isbn = "12-12-12-X";
        assertFalse(ISBN.esValido(isbn));
    }
    
    @Test
    public void guionesValidos() {
        String isbn = "84-226-1586-X";
        assertTrue(ISBN.esValido(isbn));
    }
    
    @Test 
    public void guionesInvalidos() {
        String isbn = "84-2-6-1586-X";
        assertFalse(ISBN.esValido(isbn));
        
        isbn = "84-22671586-X";
        assertFalse(ISBN.esValido(isbn));
    }
    
    @Test
    public void guionesSeguidos() {
        String isbn = "8422--61586-X";
        assertFalse(ISBN.esValido(isbn));
    }
    
    @Test
    public void digitosValidos() {
        String isbn = "84-226-1586-X";
        assertTrue(ISBN.esValido(isbn));
    }
    
    @Test 
    public void digitosInvalidos() {
        String isbn = "84-2A6-1586-X";
        assertFalse(ISBN.esValido(isbn));
    }
    
    @Test
    public void ultimoGuionValido() {
        String isbn = "84-226-1586-X";
        assertTrue(ISBN.esValido(isbn));
    }
    
    @Test
    public void ultimoGuionInvalido() {
        String isbn = "84-226-158-6X";
        assertFalse(ISBN.esValido(isbn));
    }
    
    @Test
    public void ultimaLetraValida() {
        String isbn = "84-226-1586-X";
        assertTrue(ISBN.esValido(isbn));
        
        isbn = "2-1234-5680-2";
        assertTrue(ISBN.esValido(isbn));
    }
    
    @Test
    public void ultimaLetraNoValida() {
        String isbn = "84-226-1586-P";
        assertFalse(ISBN.esValido(isbn));
    }
}
