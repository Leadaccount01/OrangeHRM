package BasePage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.util.CommonUtils;

public class BasePage {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		CommonUtils.readPropertiesfile();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
