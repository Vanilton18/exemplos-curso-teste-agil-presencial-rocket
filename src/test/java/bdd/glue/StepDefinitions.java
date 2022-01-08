package bdd.glue;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Map;

public class StepDefinitions {

    WebDriver driver;

    @Given("Estou no navegador Chrome")
    public void estou_no_navegador_chrome() {
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
    }

    @Given("Estou na url {string}")
    public void estou_na_url(String string) {
        driver.get(string);
    }

    @When("Preencho o vertice {string} com {string}")
    public void preencho_o_vertice_com(String vertice, String valor) {
        driver.findElement(By.name("V"+vertice)).sendKeys(valor);
    }

    @When("Preencho triângulo")
    public void preencho_triângulo(io.cucumber.datatable.DataTable dataTable) {
        for(Map<String, String> linha : dataTable.asMaps()){
            String vertice = linha.get("vertice");
            String valor = linha.get("valor");
            driver.findElement(By.name("V"+vertice)).sendKeys(valor);
        }
    }

    @When("Clico no botão {string}")
    public void clico_no_botão(String nomeBotao) {
        driver.findElement(By.xpath("//input[@value='"+nomeBotao+"']")).click();
    }
    @Then("É Exibido o triângulo {string}")
    public void é_exibido_o_triângulo(String tipoTriangulo) {
        Assert.assertTrue(driver.findElement(
                By.xpath("//div[contains(.,'"+tipoTriangulo+"')]")).isDisplayed());
    }

    @After
    public void tearDown(){
        driver.close();
    }


}
