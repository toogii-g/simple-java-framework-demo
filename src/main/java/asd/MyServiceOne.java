package asd;

import framework.annotations.Service;
import framework.annotations.Value;

@Service
public class MyServiceOne {

    @Value("service-name")
    private String name;

    public void print(){
        System.out.println(name);
    }

}
