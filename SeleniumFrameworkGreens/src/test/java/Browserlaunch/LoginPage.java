package Browserlaunch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
     
	
	//public void loginPage() {
	//	PageFactory.initElements(driver, this);
	//}
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="email")
	private WebElement txtuser; 
	
	@FindBy(id="pass")
	private WebElement txtpass;
	
	@FindBy(name="login")
	private WebElement btn;
  
	public WebElement gettxtuser() {
		return txtuser;
	}
	
	public WebElement gettxtpass() {
		return txtpass;
	}
	
	public WebElement getbtn() {
		return btn;
		
	}
}
