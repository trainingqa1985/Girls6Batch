package testngconcepts;
import org.testng.annotations.Test;

public class GroupsDemo {
	
	@Test(groups = {"sanity","regression"},priority = 1)
	public void login()
	{
		System.out.println("This is login");
	}
	
	@Test(groups = {"regression"}, priority = 0)
	public void message()
	{
		System.out.println("message is already existing feature");
	}
	
	@Test(groups = {"feature"})
	public void createGroup()
	{
		System.out.println("this is new developed feature");
	}

}
