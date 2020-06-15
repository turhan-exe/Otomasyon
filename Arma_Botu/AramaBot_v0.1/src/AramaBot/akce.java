package AramaBot;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class akce
{
	public static String[] run(String urun,int minfyt)
	{	String sonuc="";
		String url="";
		String goster[]=new String[2];
		String mnf=String.valueOf(minfyt);
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver drv = new ChromeDriver(options);	
		drv.navigate().to("https://www.akakce.com/");;	
		ara(1000);	
		drv.findElement(By.xpath("/html/body/div[1]/div/div[3]/form/span/input")).sendKeys(urun+Keys.ENTER);				
		Actions actions = new Actions(drv);
		ara(500);
		try {
			drv.findElement(By.xpath("/html/body/div[2]/ul/li[2]/div/form/span/label[1]/span/input")).click();
		} catch (Exception e) {
			sonuc="Aranan bilgilere göre Uygun ürün Yokrur";
			url="";
			goster[0]=sonuc;
			goster[1]=url;
			drv.quit();
			return goster;
			// TODO: handle exception
		}
		
		ara(500);
		drv.findElement(By.xpath("/html/body/div[2]/ul/li[2]/div/form/span/label[1]/span/input")).sendKeys(mnf);
		ara(500);
		try {
			drv.findElement(By.xpath("/html/body/div[2]/ul/li[2]/div/form/span/button")).click();
		} catch (Exception e) {
			sonuc="Aranan bilgilere göre Uygun ürün Yokrur";
			url="";
			goster[0]=sonuc;
			goster[1]=url;
			drv.quit();
			return goster;
		}
		
		
		
		try {
			actions.click(drv.findElement(By.xpath("/html/body/div[2]/ul/li[1]/p[2]/a[2]"))).perform();
			ara(500);
			String fýyat=drv.findElement(By.xpath("/html/body/div[2]/ul/li[3]/a/span/span[1]/span")).getText();
			ara(500);
			actions.click(drv.findElement(By.xpath("//html/body/div[2]/ul/li[3]/a/span[1]/img"))).perform();
			ara(500);
		 url=drv.getCurrentUrl();	
			String adý=drv.findElement(By.xpath("/html/body/div[2]/div/div[1]/h1")).getText();			
			 sonuc=adý+"  "+ "  "+fýyat;
		} catch (Exception e) {
		// TODO: handle exception
			sonuc="Aranan bilgilere göre Uygun ürün Yokrur";
		}
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
