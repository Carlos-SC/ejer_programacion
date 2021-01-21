
import org.junit.Test;
import static org.junit.Assert.*;

public class TestDNI {

    public TestDNI() {
    }

    @Test
    public void testLongitudCorrecta() {
        String dni = "12345678Z";
        assertTrue(DNI.esValido(dni));
    }

    @Test
    public void testLongitudInferior() {
        String dni = "1234567Z";
        assertFalse(DNI.esValido(dni));
    }

    @Test
    public void testLongitudSuperior() {
        String dni = "123456789Z";
        assertFalse(DNI.esValido(dni));
    }

    @Test
    public void testComienzoNumerosValido() {
        String dni = "12345678Z";
        assertTrue(DNI.esValido(dni));
    }

    @Test
    public void testComienzoLetrasInvalido() {
        String dni = "ABC45678Z";
        assertFalse(DNI.esValido(dni));
    }

    @Test
    public void testUltimaLetraValida() {
        String dni = "12345678Z";
        assertTrue(DNI.esValido(dni));

        dni = "88888888Y";
        assertTrue(DNI.esValido(dni));
    }

    @Test
    public void testUltimaLetraInvalida() {
        String dni = "12345678U";
        assertFalse(DNI.esValido(dni));

        dni = "88888888I";
        assertFalse(DNI.esValido(dni));

        dni = "88888888O";
        assertFalse(DNI.esValido(dni));

        dni = "88888888Ñ";
        assertFalse(DNI.esValido(dni));
    }

    @Test
    public void testUltimaLetraMinusculaValida() {
        String dni = "12345678z";
        assertTrue(DNI.esValido(dni));

        dni = "88888888y";
        assertTrue(DNI.esValido(dni));
    }

    @Test
    public void testPrimerLetraValida() {
        String nie = "X1234567L";
        assertTrue(DNI.esValido(nie));

        nie = "Y1234567X";
        assertTrue(DNI.esValido(nie));

        nie = "Z1234567R";
        assertTrue(DNI.esValido(nie));
    }

    @Test
    public void testUltimaLetraCorrecta() {
        String dni = "12345678Z";
        assertTrue(DNI.esValido(dni));

        dni = "88888888Y";
        assertTrue(DNI.esValido(dni));
    }

    @Test
    public void testUltimaLetraIncorrecta() {
        String dni = "12345678A";
        assertFalse(DNI.esValido(dni));

        dni = "8888888B";
        assertFalse(DNI.esValido(dni));
    }
}
