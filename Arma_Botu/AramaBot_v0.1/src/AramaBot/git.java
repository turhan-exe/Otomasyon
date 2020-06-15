package AramaBot;
import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class git {
	public static void run(String url)
	{
		if (url!="") {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			WebDriver drv1 = new ChromeDriver();
			drv1.navigate().to(url);;	
		}
		else {
			JOptionPane.showMessageDialog(null,"Aranan Kriterler Uygun Ürun yoktur!");
		}
		
	}
	
}
