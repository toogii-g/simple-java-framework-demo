package asd;

import framework.annotation.Autowired;
import framework.annotation.Service;

@Service
public class MyServiceTwo {

    @Autowired
    private MyServiceOne myServiceOne;

    public void print(){
        myServiceOne.print();
    }
}
