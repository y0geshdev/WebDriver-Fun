package com.farzi;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Farzi_Hits {

	public static void main(String[] args) throws InterruptedException {
		Driver driver = new Driver();
		driver.FMS();
		/*for(int i=0;i<1000;i++){
		driver.HiltonDashboard();
		//driver.AKN();
		driver.MARS();
		System.out.println("executed "+i);
		}*/
		
		/*byte[] encode=Base64.getEncoder().encode("Yogesh".getBytes());
		System.out.println(encode);
		byte[] decode = Base64.getDecoder().decode(encode);
		System.out.println(new String(decode));*/

	}

}

class Driver {

	WebElement element;
	
	//{System.setProperty("webdriver.chrome.driver","C:\\Users\\yogesh.f.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");}
	//{System.setProperty("webdriver.ie.driver", "C://Users//yogesh.f.kumar//Downloads//IEDriverServer//IEDriverServer.exe");}
	{System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");}
	
	//WebDriver driver = new InternetExplorerDriver();
	void HiltonDashboard() {
		try{
			//WebDriver driver = null;
		
			WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://localhost/DashBoard/Dashboard.aspx");
		element = driver.findElement(By.id("loginControl_UserName"));
		element.sendKeys("username");
		
		element = driver.findElement(By.id("loginControl_Password"));
		element.sendKeys("password");
		
		driver.findElement(By.id("loginControl_LoginButton")).click();
		
		/*element= driver.findElement(By.id("txtSearchProperty"));
				
		element.clear();
		element.sendKeys("LRDES".toLowerCase());
		
		element= driver.findElement(By.id("txtIncidentNumber"));
		element.sendKeys("**********".toLowerCase());
		//Thread.sleep(5000);
		driver.findElement(By.id("btnSearch")).click();
		String mainWindow= driver.getWindowHandle();
		
		
		for(String newWind : driver.getWindowHandles()){
			if(!newWind.equals(mainWindow)){
				driver.switchTo().window(newWind);
				driver.close();
			}
		}
		
		driver.switchTo().window(mainWindow);*/
		//driver.close();
		driver.findElement(By.id("btnLogout")).click();
		}catch(Exception e){
			System.out.println("Execption Occured");
		}
		
	}

	void AKN(){
		try{
			WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogesh.f.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("************************************************");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);      
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());     
		//alert.authenticateUsing(new UserAndPassword("username","password"));
		
		//driver.
		//driver.close();
		}catch(Exception e){
			System.out.println("Fass gya");
		}
	}
	
	void MARS(){
		
		try{
			
			WebDriver driver = new InternetExplorerDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yogesh.f.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		driver.get("http://localhost/MARS/Account/Login.aspx");
		element = driver.findElement(By.id("UserName"));
		element.sendKeys("username");
		element= driver.findElement(By.id("Password"));
		element.sendKeys("password");
		element= driver.findElement(By.id("LoginButton"));
		element.click();
		
		element= driver.findElement(By.id("HeaderC_TopMenuControl_btnLogOut"));
		element.click();
		//driver.close();
		
		
	}catch(Exception e){
		System.out.println("fass gya");}
	}

	void FMS(){
		ArrayList<WebElement> ele;
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("http://localhost/status/");
		int i=0;
		driver.switchTo().frame(0);
		ele= (ArrayList<WebElement>) driver.findElements(By.cssSelector("td[class='clsTableCell clsRight']"));
		for(;i<9;i++){
		System.out.println(i+" : "+ ele.get(i).getText());
		}
		driver.quit();
	}
	
}