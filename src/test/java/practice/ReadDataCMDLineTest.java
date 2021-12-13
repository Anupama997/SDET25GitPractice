package practice;

import org.testng.annotations.Test;

public class ReadDataCMDLineTest {
	@Test
public void read() {
	System.out.println("reading data from command line");
	String url=System.getProperty("url");
	String browser=System.getProperty("browser");
	String username=System.getProperty("username");
	String password=System.getProperty("password");
	System.out.println(url);
	System.out.println(browser);
	System.out.println(username);
	System.out.println(password);
 
}
}
