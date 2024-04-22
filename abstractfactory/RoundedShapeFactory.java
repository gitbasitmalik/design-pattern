/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbean.abstractfactory;

/**
 *
 * @author basitmalik
 */
public class RoundedShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new RoundedRectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new RoundedSquare();
       
      }else if(shapeType.equalsIgnoreCase("SINGLEBORDERTRIANGLE"))
      {
         return new SingleBorderTriangle();
      }
      else if(shapeType.equalsIgnoreCase("DoubleRoundedTriangle"))
      {
         return new DoubleBorderTriangle();
      }
      else if(shapeType.equalsIgnoreCase("DoubleRoundedBorderTriangle"))
      {
         return new DoubleBorderRoundedTriangle();
      }
      return null;
   }
}