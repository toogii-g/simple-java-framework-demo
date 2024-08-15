package asd;

import framework.annotation.Profile;
import framework.annotation.Service;

@Service
@Profile("dev")
public class DevService implements IService{

    @Override
    public void print() {
        System.out.println("Development Service");
    }
}
