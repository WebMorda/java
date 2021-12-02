package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.calculator.services.CalculatorServiceImpl;

@SpringBootTest
class CalculatorApplicationTests {

    int num1;
    int num2;
    int num3;
    int num4;
    int zero;
    CalculatorServiceImpl calculatorService;

    @BeforeEach
    public void setUp(){
        num1 = 4;
        num2 = 2;
        num3 = 6;
        num4 = 8;
        zero = 0;
        calculatorService = new CalculatorServiceImpl();
    }

    @Test
    public void plus() {
        Assertions.assertEquals(num1 + num2, calculatorService.plus(num1, num2));
        Assertions.assertEquals(num3 + num4, calculatorService.plus(num3, num4));
    }

    @Test
    public void minus(){
        Assertions.assertEquals(num1 - num2, calculatorService.minus(num1, num2));
        Assertions.assertEquals(num3 - num4, calculatorService.minus(num3, num4));
    }

    @Test
    public void multiply(){
        Assertions.assertEquals(num1 * num2, calculatorService.multiply(num1, num2));
        Assertions.assertEquals(num3 * num4, calculatorService.multiply(num3, num4));
    }

    @Test
    public void divide(){
        Assertions.assertEquals((float) num1 / num2, calculatorService.divide(num1, num2));
        Assertions.assertEquals((float) num3 / num4, calculatorService.divide(num3, num4));
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () ->
                calculatorService.divide(num1, zero));
        Assertions.assertTrue(thrown.getMessage().contains("Деление на ноль невозможно"));
    }
}
