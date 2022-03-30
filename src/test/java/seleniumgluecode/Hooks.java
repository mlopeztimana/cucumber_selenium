package seleniumgluecode;

import Runner.browser_manager.DriverManager;
import Runner.browser_manager.DriverManagerFactory;
import Runner.browser_manager.DriverType;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private static WebDriver driver; //Variable que se llama WebDriver que pertenece a la clase y no al objeto
    private static int numberofcase = 0; //Se crea la variable numbercase de tipo int
    private DriverManager driverManager;
    //driver= nombre de la variable

    @Before //se ejecuta antes de cada escenario
    public void setUp(){  //void= no devuelve nada
        numberofcase++; //Se suma 1
        System.out.println("Ejecutando el escenario nro: " + numberofcase);
        driverManager = DriverManagerFactory.getManager(DriverType.EDGE) ;
        driver = driverManager.getDriver();
        driver.get("https://imalittletester.com/");  //llama a la instancia del navegador
        driver.manage().window().maximize();  //maximiza la pantalla
    }

    @After //se ejecuta despues de cada escenario
    public void tearDown(){
        System.out.println("El escenario nro: " + numberofcase + " se ejecuto correctamente");
        driverManager.guitDriver();
    }


    public static WebDriver getDriver(){
        return driver;
    }



}
