/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbean.abstractfactory;

/**
 *
 * @author basitmalik
 */
public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {
      //get shape factory
      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
      //get an object of Shape Rectangle
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape1.draw();
      //get an object of Shape Square 
      Shape shape2 = shapeFactory.getShape("SQUARE");
      //call draw method of Shape Square
      shape2.draw();
      //get shape factory
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
      //get an object of Shape Rectangle
      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape3.draw();
      //get an object of Shape Square 
      Shape shape4 = shapeFactory1.getShape("SQUARE");
      //call draw method of Shape Square
      shape4.draw();
      Shape shape5 = shapeFactory.getShape("TRIANGLE");
      //call draw method of Triangle Square
      shape5.draw();
      Shape shape6 = shapeFactory1.getShape("SingleBorderTriangle");
      //call draw method of SingleBorderTriangle Square
      shape6.draw();
      Shape shape7 = shapeFactory1.getShape("DoubleRoundedTriangle");
      //call draw method of DoubleRoundedTriangle Square
      shape7.draw();
      Shape shape8 = shapeFactory1.getShape("DoubleRoundedBorderTriangle");
      //call draw method of DoubleRoundedBorderTriangle Square
      shape8.draw();
      
   }
}
