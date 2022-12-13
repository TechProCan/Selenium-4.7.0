package day01;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getTitle());
        Assert.isTrue(driver.getTitle().contains("Techpro"),"Baslik techpro icermiyor");
        System.out.println(driver.getCurrentUrl());
    }
}
