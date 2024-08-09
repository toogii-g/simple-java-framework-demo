package asd;

import framework.annotation.Service;
import framework.annotation.Value;

@Service
public class MyServiceOne {

    @Value("service-name")
    private String name;

    public void print(){
        System.out.println(name);
    }

}
