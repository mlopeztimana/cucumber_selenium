//Implementación de todos los pasos implementados

package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {

    private WebDriver driver = Hooks.getDriver() ;
    //se crea la variable driver de tipo webdriver

    @Given("^El usuario se encuentre en la pagina HOME de imalittletester$")
    public void el_usuario_se_encuentre_en_la_pagina_HOME_de_imalittletester() throws Throwable {
        String titteHomePage ="imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";  //Se crea la variable titteHomePage
        //Se valida que realmente se encuentre en el nombre de la página
        Assert.assertEquals(titteHomePage,driver.getTitle());

        /*System.setProperty("webdriver.chrome.driver","./src/test/resources/ChromeDriver/chromedriver.exe")
        driver= new ChromeDriver();   //crea un objeto ChromeDriver
        driver.get("https://imalittletester.com/");  //Abre el navegador y redirige a las URL
        driver.manage().window().maximize();  //maximiza la pantalla */

    }

    @When("^hace clic sobre el boton THE LITTLE TESTER COMICS$")
    public void hace_clic_sobre_el_boton_THE_LITTLE_TESTER_COMICS() throws Throwable {
        WebElement titleComicsLocator = driver.findElement(By.id("menu-item-2008"));
        /*Se crea una variable titleComicsLocator de tipo WebElement
        Se llama al elemento con su ID, esto se optiene del DOM */
        titleComicsLocator.click(); //Se hace clic al elemento
    }

    @Then("^Se debe redirigir a la pantalla comics$")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Throwable {
        WebElement pagetittleLocator = driver.findElement(By.className("page-title"));
        Assert.assertTrue("No se redirecciono correctamente a la pagina de comics", pagetittleLocator.isDisplayed());
        Assert.assertEquals("Category: comics", pagetittleLocator.getText());
    }

}
