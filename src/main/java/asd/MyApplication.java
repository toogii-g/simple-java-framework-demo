package asd;

import framework.*;
import framework.Runnable;

/**
 * 
 */
@Service
public class MyApplication implements Runnable {

	@Autowired
	private MyServiceOne myServiceOne;
	public static void main(String[] args) throws Exception{
		SimpleJavaFramework.run(MyApplication.class, args);
	}

	@Override
	public void run(String... args) {
		myServiceOne.print();
	}
}
