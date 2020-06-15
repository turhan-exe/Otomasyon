package AramaBot;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class n11
{public static String[] run(String urun, int minfyt)
{	String url="";
String adý="";
String fýyat="";
String sonuc="";
String goster[]=new String[2];
	String mnf=String.valueOf(minfyt);
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
	WebDriver drv = new ChromeDriver(options);	
	drv.navigate().to("https://www.n11.com/");;	
	ara(1000);	
	drv.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/div[1]/div/form/input[1]")).sendKeys(urun);	
	drv.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/div[1]/div/form/input[1]")).sendKeys(Keys.ENTER);	
	ara(1000);
	try {
		drv.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[1]/section[15]/div/div[1]/input")).sendKeys(mnf);
	} catch (Exception e) {
		// TODO: handle exception
		
		try {
			drv.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[1]/section[16]/div/div[1]/input")).sendKeys(mnf);
		} catch (Exception e2) {
			// TODO: handle exception
			sonuc="Aranan bilgilere göre Uygun ürün Yokrur";
			url="";
			goster[0]=sonuc;
			goster[1]=url;
			return goster;
		}
	}
	ara(1000);
	try {
		drv.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[1]/section[15]/div/span[2]")).click();
	} catch (Exception e) {
		// TODO: handle exception
		drv.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[1]/section[16]/div/span[2]")).click();
	}
	//System.out.println("1");
	Actions actions = new Actions(drv);
	ara(1000);
	Select sec=new Select(drv.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/section/div[1]/div[4]/div[6]/select")));	
	sec.selectByVisibleText("Artan fiyat");
	ara(1000);	
	try {
		drv.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/section/div[2]/ul/li[1]/div/div[1]/a/h3")).click();
	} catch (Exception e) {
		// TODO: handle exception
		sonuc="Aranan bilgilere göre Uygun ürün Yokrur";
		url="";
		goster[0]=sonuc;
		goster[1]=url;
		return goster;
	}
	
	 url=drv.getCurrentUrl();
	ara(1000);
	 
	try {
		adý=drv.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/div[1]/div/h1")).getText();
	} catch (Exception e) {
		// TODO: handle exception
		adý=drv.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section[1]/div[3]/div[1]/h1")).getText();
	}
	 
	try {
		fýyat=drv.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/div/ins")).getText();
	} catch (Exception e) {
		// TODO: handle exception
		fýyat=drv.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section[1]/div[3]/div[5]/div[1]/div/div[1]/div/div/p/ins/span[1]")).getText();
	}
	drv.quit();
	 sonuc=adý+"  "+ "  "+fýyat;
	
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
		
			e1.printStackTrace();
	}	
	
}
	
	

}
