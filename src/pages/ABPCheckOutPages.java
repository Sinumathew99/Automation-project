package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ABPCheckOutPages {
	WebDriver cd;
	public static By abpaddtocart=By.xpath("//*[@class='icon icon-cart']");
    By abpcheckout=By.xpath("//*[@id=\"CartPageForm\"]/div/div[2]/div[4]/button");
	By abpaddress=By.xpath("//*[@id=\"address1\"]");
	By abpapartment=By.xpath("//*[@id=\"TextField4\"]");
	By abpcity=By.xpath("//*[@id=\"TextField5\"]");
	By abpstate=By.xpath("//*[@id=\"Select2\"]");
	By abppincode=By.xpath("//*[@id=\"TextField6\"]");
	By abpphone=By.xpath("//*[@id=\"TextField7\"]");
	By abpreturntocart=By.xpath("//*[@id=\"Form1\"]/div[1]/div/div[2]/div[2]/div[2]/a");
	
	By abpremoveearring=By.xpath("//*[@id=\"CartPageForm\"]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/a");
	By abpremovebracelet=By.xpath("//*[@id=\"CartPageForm\"]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/a");
	By abpremovesheebani=By.xpath("//*[@id=\"CartPageForm\"]/div/div[1]/div/div[2]/div[2]/div[1]/div[2]/a");


	

	
	
	public ABPCheckOutPages(WebDriver cd2) {
		// TODO Auto-generated constructor stub
		this.cd=cd2;
	}
	
	

	public void clickaddtocart()
	{
		
		cd.findElement(abpaddtocart).click();
	}
	public void clickcheckout() {
		
		cd.findElement(abpcheckout).click();
	}
	public void details(String address, String apartment, String city, String state, String pincode, String phone ) {
		
		cd.findElement(abpaddress).sendKeys(address);
		
		cd.findElement(abpapartment).sendKeys(apartment);
		
		cd.findElement(abpcity).sendKeys(city);
		
		cd.findElement(abpstate).sendKeys(state);
		
		cd.findElement(abppincode).sendKeys(pincode);
		
		cd.findElement(abpphone).sendKeys(phone);
	}
	public void returntocart() {
		
		cd.findElement(abpreturntocart).click();}
	
	public void removal() {
	
		
		cd.findElement(abpremoveearring).click();
		
		cd.findElement(abpremovebracelet).click();}



	
}
	

		
	
