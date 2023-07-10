package pokr.model;


import org.springframework.stereotype.Component;
import pokr.model.Vodila;

@Component
public class Car {
    private Vodila vodila;
    public Car(Vodila vodila){
        this.vodila= vodila;
    }
    public void zv(){
        System.out.println("Машина завелась " + vodila.vodila());
    }
}
