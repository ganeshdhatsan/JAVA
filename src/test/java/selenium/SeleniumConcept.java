package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumConcept {
	
	WebDriver driver ;

	private void method1() {
     for (int i =0; i<10; i++) {
    	 driver = new EdgeDriver();
 		driver.get("https://www.facebook.com/");
 		driver.close();
 		}
		
	}
	
	public static void main(String[] args) {
		SeleniumConcept s = new SeleniumConcept();
		s.method1();

	}

}
