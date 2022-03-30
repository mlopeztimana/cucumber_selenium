package Runner.browser_manager;

import org.openqa.selenium.WebDriver;

public  abstract class DriverManager {  //clase abtracta, clase que nunca va ser instanciada

    protected WebDriver driver;//variable protegida lo ve la misma clase y la clase hija
    protected abstract void createDriver(); //se tiene q implementar de los distintos navegadores

    public void guitDriver(){
        if (driver != null){
            driver.quit();
            driver=null;
        }
    }

    public WebDriver getDriver(){
        if (driver == null){
            createDriver();
        }
        return driver;
    }
}
