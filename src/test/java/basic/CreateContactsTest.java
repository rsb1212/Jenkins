package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateContactsTest {
	@Test
	public void CreationOrgnaizationTeest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");}
}
