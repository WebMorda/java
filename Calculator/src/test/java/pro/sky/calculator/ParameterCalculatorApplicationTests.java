package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.services.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

public class ParameterCalculatorApplicationTests {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    static Stream<Arguments> dataProvider() {
        return Stream.of(arguments(5, 3), arguments(10, 15));
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void plus(int num1, int num2) {
        assertEquals(num1 + num2, calculatorService.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void minus(int num1, int num2) {
        assertEquals(num1 - num2, calculatorService.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void multiply(int num1, int num2) {
        assertEquals(num1 * num2, calculatorService.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void divide(int num1, int num2) {
        assertEquals((float) num1 / num2, calculatorService.divide(num1, num2));
    }
}
