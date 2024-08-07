package xpaths;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamic {
@Test
	public void table() {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
driver.get("https://www.flipkart.com/motorola-edge-50-pro-5g-68w-charger-black-beauty-256-gb/p/itmb3f6625c5c896?pid=MOBGXFXYDG8YRZU4&lid=LSTMOBGXFXYDG8YRZU4SAX9WW&marketplace=FLIPKART&store=tyy%2F4io&srno=b_1_1&otracker=browse&fm=organic&iid=1e09d3da-895d-405b-8a5f-2ad24c40bf96.MOBGXFXYDG8YRZU4.SEARCH&ppt=hp&ppn=homepage&ssid=k4w7mqk2nk0000001721478632338");
//		List<WebElement>header = driver.findElements(By.xpath("//table[@id='customers']//tr"));
//		System.out.println(header.size());
//		
//		Assert.assertEquals(header.size(), header.size(),"equals");
//		for(WebElement e : header)
//		{
//			System.out.println(e.getText());
//		}
//		WebElement data=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[4]//td[2]"));
		
//		List<WebElement> dats = driver.findElements(By.xpath("//table[@id='customers']//tbody//th"));
//		
//		boolean flag=false;
//		for(WebElement e:dats)
//		{
//			String value=e.getText();
//			System.out.println(value);
//			if(value.contains("Contact"))
//			{
//				
//				flag=true;
//				//break;
//			}
//		}
//		Assert.assertTrue(flag, "data present");
//		//System.out.println(data.getText());
//		
//		
//		WebElement data1=driver.findElement(By.xpath("//table[@id='customers']//tr[6]//td[2]//following-sibling::td[1]"));
//		System.out.println("the located data is :"+data1.getText());
		
		WebElement data2 = driver.findElement(By.xpath("//span[@class='VU-ZEz']//ancestor::div[2]//div[@class='Nx9bqj CxhGGd']"));
		System.out.println(data2.getText());
		driver.quit();
	}
}
