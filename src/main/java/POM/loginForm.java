package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginForm {

	static WebElement getLoginForm() {
		return baseClass.getDriver().findElement(By.cssSelector("div[class=\"modal-dialog card\"]"));
	}

	public static void close() throws InterruptedException {
		Thread.sleep(2500);
		getLoginForm().findElement(By.cssSelector("button[class=\"btn-close\"]")).click();
	}

	public static void setLoginData(String email, String password) {
		WebElement emailField = getLoginForm().findElement(By.xpath(
				"/html/body/div[3]/div/div/div/div[3]/div/div[3]/section/div/div/div/div/div[2]/div/form/div/div[1]/input"));
		WebElement passwordField = getLoginForm().findElement(By.xpath("//*[@id=\"password-field\"]"));

		emailField.sendKeys(email);
		passwordField.sendKeys(password);

	}

	public static void clickLogin() {

		getLoginForm().findElement(By.xpath(
				"/html/body/div[3]/div/div/div/div[3]/div/div[3]/section/div/div/div/div/div[2]/div/form/div/div[3]/button"))
				.click();
	}
}
