import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class GoogleTest {
static WebDriver driver;
	
@BeforeClass
public void setUp()
{
	System.setProperty("webdriver.chrome.driver","G:\\GIT_Hub_Demo\\GitHubDemo\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
}

@Test
public void googleTest() throws InterruptedException
{	
	driver.get("http://google.com");
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("GitHub Wiki");
	Thread.sleep(5000);
}

@AfterClass
public void tearDown()
{
	driver.quit();
}
}
