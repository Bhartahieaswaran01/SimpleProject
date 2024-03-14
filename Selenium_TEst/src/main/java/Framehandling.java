import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
//driver.get("https://the-internet.herokuapp.com/iframe");
driver.get("https://stqatools.com/demo/Windows.php");
driver.manage().window().maximize();
String parentWin=driver.getWindowHandle();
System.out.print(parentWin);
WebElement tabButton=driver.findElement(By.xpath("//button[contains(text(), 'new Tab')]"));
tabButton.click();
System.out.println("title of the page is"+driver.getTitle());
Set<String> tabs=driver.getWindowHandles();
System.out.println("Numnber of windows"+ tabs.size());
for( String ch:tabs)
{
	System.out.println("Windows"+ ch);
	if(!ch.equalsIgnoreCase(parentWin))
	{
		driver.switchTo().window(ch);
		driver.manage().window().maximize();
		System.out.println("Child window is "+driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[3]/a/span/span")).click();
	
	
	}
	
}
driver.close();
driver.switchTo().window(parentWin);
System.out.println("title of the page is"+driver.getTitle());

}
	

}
