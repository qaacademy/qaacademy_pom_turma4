package scenarios;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class TesteCadastro {
    WebDriver driver;
    HomePage homePage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        homePage = new HomePage(driver);

        driver.get("http://localhost:3000");
    }

    @Test
    public void testeCadastro() {

        homePage.clicarRegistrar();
        homePage.preencherEmail();
        homePage.preencherNome();
        homePage.preencherSenha();
        homePage.preencherConfirmacaoSenha();
        homePage.clicarCriarComSaldo();
        homePage.clicarCadastrar();
        homePage.clicarFecharContaCriada();
        homePage.preencheEmailLogin();
        homePage.preencheSenhaLogin();
        homePage.clicarAcessar();
        Assert.assertTrue(homePage.validaMsgBoasVindas());

    }

    @After
    public void finaliza() {
        driver.quit();
    }
}
