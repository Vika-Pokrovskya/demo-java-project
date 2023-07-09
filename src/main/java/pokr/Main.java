package pokr;

import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("pokr");
                Car car = context.getBean(Car.class);
                car.zv();// для масштаба
    }
}
