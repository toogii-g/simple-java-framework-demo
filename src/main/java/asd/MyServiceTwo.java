package asd;

import framework.annotations.Autowired;
import framework.annotations.Service;

@Service
public class MyServiceTwo {

    @Autowired
    private MyServiceOne myServiceOne;

    public void print(){
        myServiceOne.print();
    }
}
