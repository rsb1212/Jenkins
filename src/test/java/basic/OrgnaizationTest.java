package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrgnaizationTest {
	@Test
	public void CreationOrgnaizationTeest() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");}
}
