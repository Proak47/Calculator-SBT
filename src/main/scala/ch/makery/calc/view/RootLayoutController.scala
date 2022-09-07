package ch.makery.calc.view
import scalafxml.core.macros.sfxml
import scalafx.application.Platform
import ch.makery.calc.MainApp
import scalafx.event.ActionEvent
import scalafx.scene.control.Alert.AlertType
import scalafx.scene.control.Alert

@sfxml
class RootLayoutController() {
    def handleClose(){
        Platform.exit()
    }
    def Close(ac: ActionEvent){
        Platform.exit()
    }
}