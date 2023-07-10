package pokr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pokr.service.Calculator;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final Calculator calculator;


    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }
    @GetMapping("/sum")
    public String sum(@RequestParam("num1")Integer num1,@RequestParam("num2")Integer num2) {
        return num1 + "+" + num2 + "="+ calculator.sum(num1,num2);
    }

    @GetMapping("/vic")
    public String vic(@RequestParam("num1")Integer num1,@RequestParam("num2")Integer num2) {
        return num1 + "-" + num2 + "="+ calculator.vic(num1,num2);
    }
    @GetMapping("/del")
    public String del(@RequestParam("num1")Integer num1,@RequestParam("num2")Integer num2) {
        try {
            return num1 + "/" + num2 + "="+ calculator.del(num1,num2);
        }
        catch (ArithmeticException exception){
            return "Ошибка 404";
        }
    }
}
