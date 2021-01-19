
import com.cifpcarballeira.dam127.calculadora_code.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    public CalculadoraTest() {
    }
    
    private static int a;
    private static int b;
    
    @Test
    public void testSumar() {
        assertEquals(5, Calculadora.sumar(a, b));
    }

    @Test
    public void testRestar() {
        assertEquals(-1, Calculadora.restar(a, b));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, Calculadora.multiplicar(a, b));
    }

   @Test
    public void testDividir() {
        assertEquals(0, Calculadora.dividir(a, b));
    }

    @Test
    public void testResto() {
        assertEquals(2, Calculadora.resto(a, b));
    }
    
    @BeforeClass
    public static void setUpClass() {
        a = 2;
        b = 3;
    }
}
