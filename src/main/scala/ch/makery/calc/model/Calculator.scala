package ch.makery.calc.model
import scalafx.beans.property.{StringProperty, IntegerProperty, ObjectProperty}
//import scala.util.{ Try, Success, Failure }
import scalafx.collections.ObservableBuffer
import ch.makery.calc.view.CalculatorController
class Calculator() {
    var num1 = 0.0
    var num2 = 0.0
    var d1 = 0.0
    var d2 = 0.0
    
    def div (d1: Double, d2: Double) : Double = {
        var result = d1 / d2
        return result
    }
    def mult(d1: Double, d2: Double) : Double = {
        var result = d1 * d2
        return result
    }
    def sub(d1: Double, d2: Double) : Double = {
        var result = d1 - d2
        return result
    }
    def add(d1: Double, d2: Double) : Double = {
        var result = d1 + d2
        return result
    }
    
    

}