import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AuthenticateApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "RR8N605KJGA");
		dc.setCapability(MobileCapabilityType.APP, "D:\\Other\\Pre_Test_Bukalapak\\Bukapak_Mobile_Automation\\Apk_Test_Bukalapak.apk");
		dc.setCapability("appPackage", "com.loginmodule.learning");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		Thread.sleep(5000);
		
		driver.findElement(By.id("com.loginmodule.learning:id/textViewLinkRegister")).click();
		
		/*Registration Negative Case
		 *1. Input empty data on registration form
		 **/
		Thread.sleep(2000);
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonRegister")).click();
		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.support.v7.widget.LinearLayoutCompat[1]/TextInputLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")).isDisplayed();
		
		/*2. Input all data with empty fullname
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).sendKeys("");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test9802@test.com");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonRegister")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).clear();
		Thread.sleep(2000);
		
		/*3. Input all data with fullname only a space
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).sendKeys(" ");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test9802@test.com");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonRegister")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).clear();
		Thread.sleep(2000);
		
		/*4. Input all data with empty email
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).sendKeys("Test");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonRegister")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).clear();
		Thread.sleep(2000);
		
		/*5. Input all data with email invalid format
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).sendKeys("Test");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test23421");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonRegister")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).clear();
		Thread.sleep(2000);
		
		/*6. Input all data with email only a space
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).sendKeys("Test");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys(" ");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonRegister")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).clear();
		Thread.sleep(2000);
		
		/*7. Input all data with exist email
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).sendKeys("Test");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test@test.com");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonRegister")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).clear();
		Thread.sleep(2000);
		
		/*8. Input all data with empty password
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).sendKeys("Test");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test9802@test.com");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonRegister")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).clear();
		Thread.sleep(2000);
		
		/*9. Input all data with invalid password
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).sendKeys("Test");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test9802@test.com");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys(" ");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonRegister")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).clear();
		Thread.sleep(2000);
		
		/*10. Input all data with empty confirm password
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).sendKeys("Test");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test9802@test.com");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).sendKeys("");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonRegister")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).clear();
		Thread.sleep(2000);
		
		/*11. Input all data with confirm password not match with password
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).sendKeys("Test");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test9802@test.com");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).sendKeys("test54321");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonRegister")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).clear();
		Thread.sleep(2000);
		
		/*12. Input all data with invalid confirm password
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).sendKeys("Test");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test9802@test.com");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).sendKeys(" ");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonRegister")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).clear();
		Thread.sleep(2000);
		
		/*Registration Positive Case
		 *1. Input empty data on registration form
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).sendKeys("Test");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test9802@test.com");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonRegister")).click();
		Thread.sleep(5000);
		
		/*Login Negative Case
		 *1. Input empty email and empty password
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatTextViewLoginLink")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonLogin")).click();
		Thread.sleep(2000);
		
		/*2. Input empty email and valid password
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonLogin")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		Thread.sleep(2000);
		
		/*3. Input valid email and empty password
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test9801@test.com");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonLogin")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		Thread.sleep(2000);
		
		/*4. Input not exist email and valid password
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test1801@test.com");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonLogin")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		
		/*5. Input valid email and invalid password
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test9802@test.com");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys(" ");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonLogin")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		Thread.sleep(2000);
		
		/*6. Input email invalid format and valid password
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test9802");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonLogin")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		
		/*7. Input email invalid format and invalid password
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test9801");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys(" ");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonLogin")).click();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).clear();
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).clear();
		Thread.sleep(2000);
		
		/*Login Positive Case
		 *1. Input all valid data in login form
		 **/
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("test9802@test.com");
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("test12345");
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonLogin")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("com.loginmodule.learning:id/textViewName")).getText().equals("test9802@test.com");
		driver.quit();
	}

}
