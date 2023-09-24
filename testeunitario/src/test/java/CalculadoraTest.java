import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    Calculadora c = new Calculadora();

    @Test
    public void somarC1(){
        assertEquals(2, c.somar(1,1));
        assertEquals(1000, c.somar(500,500));
    }

    @Test
    public void somarC2(){
        assertEquals(14, c.somar(7,7));
        assertEquals(500, c.somar(250,250));
    }

    @Test
    public void helloWorld(){
        assertEquals("Hello World", c.helloWorld());
    }

}
