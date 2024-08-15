package asd;

import framework.annotation.Service;
import framework.annotation.Value;

@Service
public class AdvertisementService {

    @Value("service-name")
    private String serviceName;

    public void print(){
        System.out.println(serviceName);
        //iService.print();
    }

}
