package asd;

import framework.interfaces.Autowired;
import framework.interfaces.Service;

@Service
public class MyServiceTwo {

    @Autowired
    private MyServiceOne myServiceOne;

    public void print(){
        myServiceOne.print();
    }
}
