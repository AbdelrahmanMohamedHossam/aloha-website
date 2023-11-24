package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.webaudio.WebAudio;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class registrationForm {

	static WebElement getRegistrationForm() {
		return baseClass.getDriver().findElement(By.id("register"));
	}

	public static void close() throws InterruptedException {
		Thread.sleep(2500);
		getRegistrationForm().findElement(By.cssSelector("button[class=\"btn-close\"]")).click();

	}

	public static void setRegistrationData(clientData newClinet) {
		WebElement fullName = getRegistrationForm().findElement(By.xpath(
				"/html/body/div[3]/div/div/div/div[3]/div/div[2]/div/div/div/div/div/section/form/div[1]/div[1]/input"));
		WebElement email = getRegistrationForm().findElement(By.xpath(
				"/html/body/div[3]/div/div/div/div[3]/div/div[2]/div/div/div/div/div/section/form/div[1]/div[2]/input"));
		WebElement phoneNumber = getRegistrationForm().findElement(By.xpath(
				"/html/body/div[3]/div/div/div/div[3]/div/div[2]/div/div/div/div/div/section/form/div[1]/div[3]/input"));
		WebElement password = getRegistrationForm().findElement(By.xpath(
				"/html/body/div[3]/div/div/div/div[3]/div/div[2]/div/div/div/div/div/section/form/div[1]/div[4]/input"));
		WebElement passwordConfirmatiom = getRegistrationForm().findElement(By.xpath(
				"/html/body/div[3]/div/div/div/div[3]/div/div[2]/div/div/div/div/div/section/form/div[1]/div[5]/input"));

		fullName.sendKeys(newClinet.fullName);
		email.sendKeys(newClinet.email);
		phoneNumber.sendKeys(newClinet.phoneNumber);
		password.sendKeys(newClinet.password);
		passwordConfirmatiom.sendKeys(newClinet.passwordConfirmatiom);

	}

	public static void agreeTerms() {
		getRegistrationForm().findElement(By.xpath(
				"/html/body/div[3]/div/div/div/div[3]/div/div[2]/div/div/div/div/div/section/form/div[1]/div[6]/input"))
				.click();
	}
	public static void clickRegister() {
		getRegistrationForm().findElement(By.cssSelector("button[class=\"register-button\"]")).click();
	}

}
