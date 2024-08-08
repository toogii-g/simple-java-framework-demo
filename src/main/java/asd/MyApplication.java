package asd;

import framework.SimpleJavaFrameworkContext;

/**
 * TODO Delete it later
 */
public class MyApplication {

	public static void main(String[] args) throws Exception{
		SimpleJavaFrameworkContext fWContext = new SimpleJavaFrameworkContext();
		fWContext.start(MyApplication.class);

		MyServiceOne one = fWContext.getBean(MyServiceOne.class);
		MyServiceTwo two = fWContext.getBean(MyServiceTwo.class);
		one.print();
		two.print();



	}

}
