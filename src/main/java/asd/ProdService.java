package asd;

import framework.annotation.Profile;
import framework.annotation.Service;

@Service
@Profile("prod")
public class ProdService implements IService {
    @Override
    public void print() {
        System.out.println("Production Service");
    }
}