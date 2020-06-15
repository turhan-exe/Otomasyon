package AramaBot;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class epey 
{
	public static String[] run(String urun, int minfyt)
	{	String url="";
		String adý="";
		String fýyat="";
		String sonuc="";
		String goster[]=new String[2];
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver drv = new ChromeDriver(options);
		drv.navigate().to("https://www.epey.com/");;	
		ara(800);	
		drv.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/input[1]")).sendKeys(urun+Keys.ENTER);				
		Actions actions = new Actions(drv);		
		ara(500);
		try {
			actions.click(drv.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[2]/div[2]/div/div[4]/ul[1]/li[2]"))).perform();
		} catch (Exception e) {
			// TODO: handle exception
			sonuc="Aranan bilgilere göre Uygun ürün Yokrur";
			url="";
			goster[0]=sonuc;
			goster[1]=url;
			drv.quit();
			return goster;
		}
		
		ara(500);
		 fýyat=drv.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[2]/div[2]/div/div[4]/ul[2]/li[2]/a")).getText();
		ara(500);
		drv.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[2]/div[2]/div/div[4]/ul[2]/li[1]/div[2]/a")).click();
		 url=drv.getCurrentUrl();
		ara(500);
		 adý=drv.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[1]/div[2]/div[2]/div[1]/div/h1/a")).getText();
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
				e1.printStackTrace();
		}	
		
	}
	

}
