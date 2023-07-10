package pokr;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pokr.model.Car;

import java.lang.annotation.Annotation;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
       /* AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("pokr");
                Car car = context.getBean(Car.class);
                car.zv();// для масштаба*/
        SpringApplication.run(Main.class,args);
    }
}
