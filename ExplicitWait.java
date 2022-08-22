package learningTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Visible = driver.findElement(By.xpath("(//button/span[@class='ui-button-text ui-c'])[1]"));
		Visible.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(Visible));
		
		WebElement inVisible = driver.findElement(By.xpath("(//button/span[@class='ui-button-text ui-c'])[2]"));
		inVisible.click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOf(inVisible));
		
		WebElement clickAble1 = driver.findElement(By.xpath("//button/span[text()='Click First Button']"));
		clickAble1.click();
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.elementToBeClickable(clickAble1));
		
		WebElement clickAble2 = driver.findElement(By.xpath("//button/span[text()='Click Second']"));
		clickAble2.click();
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait3.until(ExpectedConditions.elementToBeClickable(clickAble2));
		
		
		WebElement textChange = driver.findElement(By.xpath("(//button/span[text()='Click'])[3]"));
		textChange.click(); WebDriverWait wait4 = new WebDriverWait(driver,
		Duration.ofSeconds(10));
		wait4.until(ExpectedConditions.visibilityOf(textChange));
		 
		
		
		
	}

}
