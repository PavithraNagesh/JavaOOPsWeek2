package week5.day2;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

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
			
			driver.findElement(By.id("txtStationFrom")).clear();
			driver.findElement(By.id("txtStationFrom")).sendKeys("chen", Keys.ENTER);//from
			driver.findElement(By.id("txtStationTo")).clear();
			driver.findElement(By.id("txtStationTo")).sendKeys("sa", Keys.ENTER);//to
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			
			WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
			List<WebElement> row = table.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
			System.out.println("No. of trains : "+row.size());
			
			for (int i = 1; i <= row.size(); i++) { //to get train names
				String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
				System.out.println(text);
			}
			// list to set 
			Set<WebElement> set = new HashSet<WebElement>(row);
			System.out.println("Size of set : "+set.size());
			
			for (WebElement s : set) {
				System.out.println(s.getText());
			}

	}

}
