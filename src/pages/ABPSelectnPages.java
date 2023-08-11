package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ABPSelectnPages {
	WebDriver cd;
	By abphamburger=By.xpath("//*[@class=\"icon icon-hamburger\"]");
	By abphomebtn=By.xpath("//*[@id=\"NavDrawer\"]/div/div[2]/ul[1]/li[1]/a");
	By abpselection=By.xpath("//*[@id=\"shopify-section-template--15113253158973__featured-collections\"]/div/div[2]/div[1]/a/div/img");
	By abpearring=By.xpath("//*[@id=\"CollectionAjaxContent\"]/div/div/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[1]/a/div[1]/div[3]/img");
	By abpaddtocart=By.xpath("//*[@id=\"AddToCartForm-template--15113253519421__main-7062902079549\"]/div[1]/button");
	By abphamburger2=By.xpath("//*[@class=\"icon icon-hamburger\"]");
	By abpselection2=By.xpath("//*[@id=\"NavDrawer\"]/div/div[2]/ul[1]/li[3]/a");
	By abpearring2=By.xpath("//*[@id=\"CollectionAjaxContent\"]/div/div/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[1]/a/div[1]/div[2]/img");
	By abpaddtocart2=By.xpath("//*[@id=\"AddToCartForm-template--15113253519421__main-7063216291901\"]/div[1]/button");
   
	

public ABPSelectnPages(WebDriver cd2) {
		// TODO Auto-generated constructor stub
	this.cd=cd2;
	}


public void selectn() throws InterruptedException
{
	cd.findElement(abphamburger).click();
	cd.findElement(abphomebtn).click();
	cd.findElement(abpselection).click();
	cd.findElement(abpearring).click();
	cd.findElement(abpaddtocart).click();	
	cd.findElement(abphamburger2).click();
	cd.findElement(abpselection2).click();
	cd.findElement(abpearring2).click();
	cd.findElement(abpaddtocart2).click();
	
}}
