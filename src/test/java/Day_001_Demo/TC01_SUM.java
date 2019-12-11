package Day_001_Demo;

import org.testng.annotations.Test;

import CommonUtil.Calculation;

public class TC01_SUM {
	
	@Test
	public void Hello() throws Exception
	{
		int p=200,q=100;
		
		int Sum=Calculation.sum(p, q);
		System.out.println("Sum of p and q is : " +Sum);
		
	}

}






