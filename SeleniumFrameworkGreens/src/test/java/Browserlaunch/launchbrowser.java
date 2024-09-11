package Browserlaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public  class launchbrowser extends BaseClass  {
 
	public static void main(String[] args)  {
                   
		launchbrowser("chrome");
		
		//get
		//launchbrowser("Chrome");
		
		urllaunch("https://www.facebook.com/");
		implicitlyWait(10);
		
		LoginPage l =new LoginPage();
		sendkeys(l.gettxtuser(),"pavithran");
		sendkeys(l.gettxtpass(),"77hdg");
		click(l.getbtn());
		
		
			
		
	}


		
	}


