package week5.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		System.out.println(driver.getTitle());
		
		WebElement datesort = driver.findElement(By.id("chkSelectDateOnly"));//Uncheck the check box
		if(datesort.isSelected()) {
			datesort.click();
		}
		else {
			System.out.println("Element not selected");
		}
		Thread.sleep(3000);
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("chen", Keys.ENTER);//from
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("sa", Keys.ENTER);//to
		
		System.out.println(driver.getTitle());
		
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		List<WebElement> row = table.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		System.out.println("No. of trains : "+row.size());
		
		for (int i = 1; i <= row.size(); i++) { //to get train names
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
			System.out.println(text);
			
		}
	}
}
