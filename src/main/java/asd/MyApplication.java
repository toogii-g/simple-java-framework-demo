package asd;

import framework.*;
import framework.annotations.Autowired;
import framework.interfaces.Runnable;

import java.util.Arrays;

/**
 *
 */

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
