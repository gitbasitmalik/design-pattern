/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wikipedia_Examples;

/**
 *
 * @author Basit Malik
 */

    
    public class Singleton_Example1{
     
    private static Singleton_Example1 instance;
    private int value;

    private Singleton_Example1() {
        // Private constructor to prevent instantiation from outside
    }

    public static synchronized Singleton_Example1 getInstance() {
        
        if (instance == null) {
            instance = new Singleton_Example1();
        }
        return instance;
    }
    

    public static void destruct() {
       
        instance = null;
    }

    // Existing interface methods go here
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
        
    }
    
  

