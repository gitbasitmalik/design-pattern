/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wikipedia_Examples;

/**
 *
 * @author Basit Malik
 */

    
    public class Singleton_Example3{
    private int value;
    
    private static volatile Singleton_Example3 instance;
    
    private Singleton_Example3() {
    //        EMPTY CONSTRUCTOR
    }

    public static Singleton_Example3 getInstance() {
         if (instance == null) {
            synchronized (Singleton_Example3.class) {
                if (instance == null) {
                    instance = new Singleton_Example3();
                }
            }
        }
        return instance;
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
  
    }
    
  

