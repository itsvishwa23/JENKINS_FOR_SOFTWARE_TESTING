
package jenkins_demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Jenkins_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
