package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class cartSideBar {
	static WebElement getCartSideBar()
	{
		return baseClass.getDriver().findElement(By.id("cartSideBar"));
	}
	
	public static void close()

	{
		getCartSideBar().findElement(By.cssSelector("button[class='closebtn-sidebar']")).click();
	}
	
}
