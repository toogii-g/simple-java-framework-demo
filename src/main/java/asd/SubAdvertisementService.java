package asd;

import framework.annotation.Autowired;
import framework.annotation.Service;

@Service
public class SubAdvertisementService {

    @Autowired
    private AdvertisementService advertisementService;

    public void print(){
        advertisementService.print();
    }
}
