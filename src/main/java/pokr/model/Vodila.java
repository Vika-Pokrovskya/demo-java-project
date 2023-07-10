package pokr.model;

import org.springframework.stereotype.Component;

import java.sql.Driver;
@Component
public class Vodila {
    private  String name;
    public Vodila(){
        this.name = "Маша";

    }
    public String vodila(){
        return this.name;
    }
}
