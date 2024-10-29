package testngconcepts;
import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority = 1)
	public void p1()
	{
		System.out.println("p1 Test");
	}
	
	@Test(priority = 0)
	public void p2()
	{
		System.out.println("P2 test ");
	}

}
