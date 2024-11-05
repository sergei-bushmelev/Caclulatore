package pro.sky.calculatorbushmelev;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String answerHello() {
        return "Добро пожаловать в калькулятор";
    }

    public int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    public int calculateSubstraction(int num1, int num2) {
        return num1 - num2;
    }

    public int calculateMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    public int calculateDivision(int num1, int num2) {
        return num1 / num2;
    }
}