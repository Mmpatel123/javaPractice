package Class5Hw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bikes {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
     WebDriver driver  = new ChromeDriver();
     driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();

}}
/*echo "# javaPractice" >> README.md
        //   git init
        git add README.md
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/falguni001/javaPractice.git
        git push -u origin main
        git config --global user.email "sweetmegs2604"
        git config --global user.name "falguni001"*/
