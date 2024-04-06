/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Wikipedia_Examples;

/**
 *
 * @author Basit Malik
 */
public class Singleton_Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //        TEST CODE FOR WIKIPEDIA EXAMPLE 1
        Singleton_Example1.getInstance().setValue(42);
        System.out.println("value=" + Singleton_Example1.getInstance().getValue());
        Singleton_Example1.destruct();
        
    //        TEST CODE FOR WIKIPEDIA EXAMPLE 2
        Singleton_Example2.get().setValue(42);
        System.out.println("value=" + Singleton_Example2.get().getValue());
    
    
    
    //        TEST CODE FOR WIKIPEDIA EXAMPLE 3
        Singleton_Example3 ob =Singleton_Example3.getInstance();
        ob.setValue(42);
        Singleton_Example3 ob2 =Singleton_Example3.getInstance();
        ob.setValue(50);
        System.out.println("Are ob and ob2 the same instance? " + (ob == ob2));
        System.out.println("Value ob1 =" + ob.getValue() +"\nValue Ob2 ="+ob2.getValue());
          
    }       
}



