package pokr.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceLog implements Calculator {
    @Override
    public Integer sum(Integer num1, Integer num2) {
        return num1+num2;
    }
    @Override
    public Integer vic(Integer num1,Integer num2){
        return num1-num2;
    }

    @Override
    public Integer del(Integer num1, Integer num2) {
        String s="Ошибочка вышла";
       return num1/num2;

    }

}
