package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	
private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//*[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
	
	@FindBy(xpath="//*[@class='parent']")
	WebElement Catelogicon; 
	
	
	
	@FindBy(xpath="//*[@id='catalog']/ul/li[1]/a")
	WebElement categorieslink; 
	
	

	
	@FindBy(xpath="//*[@class='btn btn-primary']")
	 WebElement addicon ;
	
	
	@FindBy(xpath="//*[@id='input-name1']")
	private WebElement categoryname;
	
	@FindBy(xpath="//*[@class='note-editable panel-body']")
	private WebElement categorydesc;
	
	
	@FindBy(xpath="//*[@id='input-meta-title1']")
	private WebElement metatag;
	

	@FindBy(xpath="//*[@id='input-meta-description1']")
	private WebElement metatagdesc;
	

	@FindBy(xpath="//*[@id='input-meta-keyword1']")
	private WebElement metatagkeywords;
	
	//*[@form='form-category']/i
	
	@FindBy(xpath="//*[@form='form-category']/i")
	private WebElement save;
	

	@FindBy(xpath="//tbody/tr[1]/td[4]/a")
	 WebElement addicon1 ;
	

	
	public void sendUserName(String name) {
		this.userName.clear();
		this.userName.sendKeys(name);
	}
	
	public void sendPassword(String passwd) {
		this.password.clear(); 
		this.password.sendKeys(passwd); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}

	public void clickCatelogicon() throws InterruptedException {
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		 action.moveToElement(Catelogicon).moveToElement(categorieslink).click().build().perform();
		 Thread.sleep(3000);
	action.moveToElement(addicon).click().build().perform();
	
    }
	public void clickcategoryname() throws InterruptedException {
		Thread.sleep(2000);
	
		this.categoryname.sendKeys("Blazers(3-5)");
		
	
	}
	
	public void clickcategorydesc() throws InterruptedException {
		Thread.sleep(2000);
	
		this.categorydesc.sendKeys("Blazers for students");
		
	
	}
 
	
	public void clickmetatag() throws InterruptedException {
		Thread.sleep(2000);
	
		this.metatag.sendKeys("BLZ 03");
		}
	
	public void clickmetatagdesc() throws InterruptedException {
		Thread.sleep(2000);
	
		this.metatagdesc.sendKeys("Blazers for primary class students");
		}
	
	public void clickmetatagkeywords() throws InterruptedException {
		Thread.sleep(2000);
	
		this.metatagkeywords.sendKeys("Blazers key");
		}
	
	public void clicksavetag() throws InterruptedException {
		Thread.sleep(2000);
	
		this.save.click();
		}
	
	public void clickCatelogicon1() throws InterruptedException {
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		 action.moveToElement(Catelogicon).moveToElement(categorieslink).click().build().perform();
		 Thread.sleep(3000);
	action.moveToElement(addicon1).click().build().perform();
	
    }
	
	
	
	public void clickmetatag1() throws InterruptedException {
		Thread.sleep(2000);
		this.metatag.clear();
		this.metatag.sendKeys("BLZ 05");
		}
	
	public void clickmetatagdesc1() throws InterruptedException {
		Thread.sleep(2000);
		this.metatagdesc.clear();
		this.metatagdesc.sendKeys("Uniform for students");
		}
	
	
	
	public void clicksavetag1() throws InterruptedException {
		Thread.sleep(2000);
	
		this.save.click();
		}
}
