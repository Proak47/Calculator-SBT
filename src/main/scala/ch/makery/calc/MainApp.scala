package ch.makery.calc
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene 
import scalafx.Includes._
import scalafxml.core.{NoDependencyResolver, FXMLView, FXMLLoader}
import javafx.{scene => jfxs}
import ch.makery.{calc => cma}
import scalafx.scene.image.Image
//import scalafx.stage.Stage 
import ch.makery.calc.view.CalculatorController
import ch.makery.calc.model.Calculator


object MainApp extends JFXApp {
    
    val rootResource = getClass.getResourceAsStream("view/RootLayout.fxml")
    val loader = new FXMLLoader(null, NoDependencyResolver)
    loader.load(rootResource);
    val roots = loader.getRoot[jfxs.layout.BorderPane]

    stage = new PrimaryStage {
        title = "Calculator"
        scene = new Scene(500, 600) {
            root = roots
            stylesheets += getClass.getResource("view/Theme.css").toString()
        }
        alwaysOnTop = true
        icons += new Image(getClass.getResourceAsStream("/images/calc.png"))
    }


    def showCalculator() = {
        val resource = getClass.getResourceAsStream("view/Calculator.fxml")
        val loader = new FXMLLoader(null, NoDependencyResolver)
        loader.load(resource);
        val roots1 = loader.getRoot[jfxs.layout.AnchorPane]
        roots.setCenter(roots1)
        }
    showCalculator()
    
    
}