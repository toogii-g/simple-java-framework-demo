package asd;

import framework.Autowired;
import framework.Service;

@Service
public class MyServiceTwo {

    @Autowired
    private MyServiceOne myServiceOne;

    public void print(){
        myServiceOne.print();
    }
}
