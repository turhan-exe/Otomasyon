package AramaBot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class trendyol 
{
	
	
	public static String[] run(String urun, int minfyt)
	{
		String url="";
		String adý="";
		String fýyat="";
		String sonuc="";
		String goster[]=new String[2];
		String mnf=String.valueOf(minfyt);
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver drv = new ChromeDriver(options);
		drv.navigate().to("https://www.trendyol.com/");
		
		drv.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div/input")).sendKeys(urun+Keys.ENTER);
		ara(800);
		try {
			drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div[4]/div[2]/div/input[1]")).sendKeys(mnf);
		} catch (Exception e) {
			// TODO: handle exception
			
			try {
				drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div/input[1]")).sendKeys(mnf);
			} catch (Exception e2) {
				// TODO: handle exception
				try {
						drv.findElement(By.xpath("//html/body/div[3]/div/div/div/div[1]/div/div/div[2]/div[2]/div/input[1]")).sendKeys(mnf);
					} 
				catch (Exception e3) {
								// TODO: handle exception
							
							try {
								drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div[5]/div[2]/div/input[1]")).sendKeys(mnf);
							} 
							catch (Exception e4) {
								// TODO: handle exception
								
							try {
								drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div[6]/div[2]/div/input[1]")).sendKeys(mnf);
							} catch (Exception e5) {
								// TODO: handle exception
								
							try {
								drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div[8]/div[2]/div/input[1]")).sendKeys(mnf);
							} catch (Exception e6) {
								// TODO: handle exception
								try {
									drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div[7]/div[2]/div/input[1]")).sendKeys(mnf);
								} catch (Exception e7) {
									// TODO: handle exception
									sonuc="Aranan bilgilere göre Uygun ürün Yokrur";
									url="";
									goster[0]=sonuc;
									goster[1]=url;
									drv.quit();
									return goster;
								}
								
							}
							
							}
							}
						}
				
			}
		}	
		ara(500);
		try {
			drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div/button")).click();
		} catch (Exception e) {
			// TODO: handle exception
			try {
				drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div[4]/div[2]/div/button")).click();
			} catch (Exception e2) {
				// TODO: handle exception
				try {
					drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div[2]/div[2]/div/button")).click();
				} catch (Exception e3) {
					// TODO: handle exception
					
					try {
						drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div[5]/div[2]/div/button")).click();
					} catch (Exception e4) {
						// TODO: handle exception
						
						try {
							drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div[6]/div[2]/div/button")).click();
						} catch (Exception e5) {
							// TODO: handle exception
							
							try {
								drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div[8]/div[2]/div/button")).click();
							} catch (Exception e6) {
								// TODO: handle exception
								drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div[7]/div[2]/div/button")).click();
							}
						}
					}
				}
			}
			
			}
		ara(500);
		try {
			Select sec=new Select(drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/div[2]/select")));	
			sec.selectByVisibleText("En düþük fiyat");
		} catch (Exception e) {
			
			sonuc="Aranan bilgilere göre Uygun ürün Yokrur";
			url="";
			goster[0]=sonuc;
			goster[1]=url;
			drv.quit();
			return goster;
		}
		ara(500);
		try {
			drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/a/div[1]/div/img")).click();
		} catch (Exception e) {
			// TODO: handle exception
			drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[3]/div/div[1]/div[1]/a/div[1]/div/img")).click();
		}		
		 url=drv.getCurrentUrl();		
		 adý=drv.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/h1/div/span")).getText();	
		
		try {
			fýyat=drv.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/span[2]")).getText();
		} catch (Exception e) {
			// TODO: handle exception
			fýyat=drv.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/span")).getText();
		}
		
		 sonuc=adý+"  "+ "  "+fýyat;
		drv.quit();
		
		goster[0]=sonuc;
		goster[1]=url;
		return goster;
	}
	public static void ara(int sure)
	{
		
		try 
		{
			Thread.sleep(sure);
		} 
		catch (InterruptedException e1) 
		{
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}	
		
	}

}
