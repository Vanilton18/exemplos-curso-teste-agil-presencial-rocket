package bdd.glue;

import io.cucumber.java.en.Given;

public class StepDefinitions {

    @Given("Estou no navegador Chrome")
    public void estou_no_navegador_chrome() {
        System.out.println("Vamos começar a abrir o navegador por aqui baby");
    }
}
