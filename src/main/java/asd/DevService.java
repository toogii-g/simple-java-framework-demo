package asd;

import framework.annotation.Profile;
import framework.annotation.Service;

@Service
@Profile("dev")
public class DevService {

    public void print() {
        System.out.println("Development Service");
    }
}
