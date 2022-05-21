package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {



    WebDriver driver;

    String btnRegistrar = "//*[contains(text(),'Registrar')]"; //cliacar
    String email = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/input[1]"; // Preenche3r
    String nome = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/input[1]"; //Nome
    String senha = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]";  // Confirmação
    String confirmarSenha = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[5]/div[1]/input[1]";  // Confirmação
    String criarComSaldo = "//label[@id='toggleAddBalance']";
    String cadastrar = "//button[contains(text(),'Cadastrar')]";

    String fecharModal = "//*[@id='btnCloseModal']";

    public HomePage(WebDriver driverDoTeste){
        this.driver = driverDoTeste;
    }

    public void clicarRegistrar() {
        driver.findElement(By.xpath(btnRegistrar)).click();
    }

    public void preencherEmail() {
        driver.findElement(By.xpath(email)).sendKeys("teste@teste.com.br");
    }

    public void preencherNome() {
        driver.findElement(By.xpath(nome)).sendKeys("Flavio Dias");

    }

    public void preencherSenha() {
        driver.findElement(By.xpath(senha)).sendKeys("123456789");

    }

    public void preencherConfirmacaoSenha() {
        driver.findElement(By.xpath(confirmarSenha)).sendKeys("123456789");

    }
    public void clicarCriarComSaldo() {
        driver.findElement(By.xpath(criarComSaldo)).click();
    }

    public void clicarCadastrar() {
        driver.findElement(By.xpath(cadastrar)).click();
    }

    public void clicarFecharContaCriada() {
        driver.findElement(By.xpath(fecharModal)).click();
    }


}
