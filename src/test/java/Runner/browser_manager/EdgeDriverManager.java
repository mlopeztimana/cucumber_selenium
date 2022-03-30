package Runner.browser_manager;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager{
    @Override
    public void createDriver(){
        System.setProperty("webdriver.edge.driver","./src/test/resources/EdgeDriver/msedgedriver.exe");
        driver= new EdgeDriver();   //crea un objeto ChromeDriver
    }
}
