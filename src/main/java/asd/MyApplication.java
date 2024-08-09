package asd;

import framework.*;
import framework.interfaces.Autowired;
import framework.interfaces.Runnable;
import framework.interfaces.Service;

import java.util.Arrays;

/**
 *
 */
@Service
public class MyApplication implements Runnable {

	@Autowired
	private MyServiceOne myServiceOne;
	public static void main(String[] args) throws Exception{
		SimpleJavaFrameworkContext s= SimpleJavaFramework.run(MyApplication.class, args);
		MyServiceOne s1= s.getBean(MyServiceOne.class);
		s1.print();
	}

	@Override
	public void run(String... args) {
		myServiceOne.print();
		System.out.println(Arrays.toString(args));
	}
}
