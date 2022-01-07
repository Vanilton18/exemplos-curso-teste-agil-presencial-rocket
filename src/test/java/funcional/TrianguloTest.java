package funcional;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrianguloTest {

    WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://vanilton.net/triangulo");
    }

    @Test
    public void verificarTrianguloEquilatero(){
        driver.findElement(By.name("V1")).click();
        driver.findElement(By.name("V1")).sendKeys("3");
        driver.findElement(By.name("V2")).sendKeys("3");
        driver.findElement(By.name("V3")).sendKeys("3");
        driver.findElement(By.xpath("//input[@value='Identificar']")).click();
        Assert.assertTrue(driver.findElement(
                By.xpath("//div[contains(.,'Equilátero')]")).isDisplayed());
    }

    @After
    public void tearDown(){
        driver.close();
    }

}
