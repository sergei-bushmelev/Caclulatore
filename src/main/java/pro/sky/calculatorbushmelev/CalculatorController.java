package pro.sky.calculatorbushmelev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String answerHello() {
        return calculatorService.answerHello();
    }

    @GetMapping(path = "/plus")
    public String calculateSum(@RequestParam("num1") Integer num1,
                               @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Нет параметра";
        }
        return String.format(num1 + "+" + num2 + " = %s", calculatorService.calculateSum(num1, num2));
    }

    @GetMapping(path = "/minus")
    public String calculateSubstraction(@RequestParam("num1") Integer num1,
                                        @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Нет параметра";
        }
        return String.format(num1 + "-" + num2 + " = %s", calculatorService.calculateSubstraction(num1, num2));
    }

    @GetMapping(path = "/multiply")
    public String calculateMultiplication(@RequestParam("num1") Integer num1,
                                          @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Нет параметра";
        }
        return String.format(num1 + "*" + num2 + " = %s", calculatorService.calculateMultiplication(num1, num2));
    }

    @GetMapping(path = "/divide")
    public String calculateDivision(@RequestParam("num1") Integer num1,
                                    @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Нет параметра";
        }
        if (num2 == 0) {
            return "Нельзя делить на 0";
        }
        return String.format(num1 + "/" + num2 + " = %s", calculatorService.calculateDivision(num1, num2));
    }
}