package Runner.browser_manager;

public class DriverManagerFactory {  //crear los manejadores para los distintos navegadores
    public static DriverManager getManager(DriverType type){  //ese metodo recibira el navegador que se quiera instanciar
        DriverManager driverManager = null;  //variable de tipo DriverManager

        switch (type){
            case CHROME:
                driverManager= new ChromeDriverManager();
                break;

            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;

            case EDGE:
                driverManager = new EdgeDriverManager();
                break;

            default:
                System.out.println("Invalid browser selected");
                break;
        }

        return driverManager;
    }

}
