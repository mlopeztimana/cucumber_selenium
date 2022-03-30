//eL PUNTO DE PARTIDA DONDE SE EMPEZARÁ A EJECUTAR NUESTRAS AUTOMATIZACIONES
package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //En esta linea se solicita que se corra con Cucumber

@CucumberOptions(
        features = "src/test/java/feature",  //Ruta donde se encuentra nuestros casos de prueba
        glue = ("seleniumgluecode") //Nombre de la carpeta donde se ha implementado los casos de prueba
)

public class TestRunner {
}
