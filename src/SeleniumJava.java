import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://www.google.com";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println("Sample testing Git)");
		driver.quit();
	}

}
