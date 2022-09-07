package ch.makery.calc.view
import ch.makery.calc.model._
import ch.makery.calc.MainApp
import scalafx.scene.control.{Label, Alert, Button}
import scalafxml.core.macros.sfxml
import scalafx.beans.property.{StringProperty}
import scalafx.event.ActionEvent



@sfxml 
class CalculatorController(var output : Label) extends Calculator{
    var op = ""
    output.text = ""
    var result = ""
    
    def del (ac: ActionEvent){
        output.text = (output.getText()).substring(0, (output.getText()).length - 1)
    }
    def cancel(ac: ActionEvent){
        output.text = ""
        num1 = 0.0
        num2 = 0.0
    }

    def one(ac: ActionEvent){
        output.text = output.getText() + "1"
        
    }
    def two(ac: ActionEvent){
        output.text = output.getText() + "2"
        
    }
    def three(ac: ActionEvent){
        output.text = output.getText() + "3"
        
    }
    def four(ac: ActionEvent){
        output.text = output.getText() + "4"
        
    }
    def five(ac: ActionEvent){
        output.text = output.getText() + "5"
        
    }
    def six(ac: ActionEvent){
        output.text = output.getText() + "6"
        
    }
    def seven(ac: ActionEvent){
        output.text = output.getText() + "7"
        
    }
    def eight(ac: ActionEvent){
        output.text = output.getText() + "8"  
    }
    def nine(ac: ActionEvent){
        output.text = output.getText() + "9"
    }
    def zero(ac: ActionEvent){
        output.text = output.getText() + "0"
    }

    def dot(ac: ActionEvent){
        if (output.getText().indexOf(".") == -1){
             output.text = output.getText() + "."
        }
    }
    
    //Operations
    def div(ac: ActionEvent){
        num1 = output.getText().toDouble 
        output.text =""
        op = "div"
    }
    def mult(ac: ActionEvent){
        num1 = output.getText().toDouble 
        output.text =""
        op = "mult"
    }
    def sub(ac: ActionEvent){
        num1 = output.getText().toDouble 
        output.text =""
        op = "sub"
    }
    def add(ac: ActionEvent){
        num1 = output.getText().toDouble 
        output.text =""
        op = "add"
    }
    
    def equal(ac: ActionEvent){
        num2 = output.getText().toDouble
        if (op == "div"){
            result = (div(num1, num2)).toString
            output.text = result
            num2 = result.toDouble
            num1 = 0.0
        }
        else if (op == "mult"){
            output.text = (mult(num1, num2)).toString
            num1 = result.toDouble
            num2 = 0.0
        }
        else if (op == "sub"){
            output.text = (sub(num1, num2)).toString
            num1 = result.toDouble
            num2 = 0.0
        }
        else if (op == "add"){
            output.text = (add(num1, num2)).toString
            num1 = result.toDouble
            num2 = 0.0
        }
        
    }
    println("test")
    
}