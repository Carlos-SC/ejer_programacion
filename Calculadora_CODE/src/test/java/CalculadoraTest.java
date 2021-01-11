
import com.cifpcarballeira.dam127.calculadora_code.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @Test
    public void testSumar() {
        int a = 2;
        int b = 3;
        
        assertEquals(5, Calculadora.sumar(a, b));
    }
}
