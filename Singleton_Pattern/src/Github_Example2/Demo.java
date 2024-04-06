/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Github_Example2;

/**
 *
 * @author Basit Malik
 */
public class Demo {
    public static void main(String[] args) {
        // Get the singleton instance of Configuration
        Configuration config = Configuration.getInstance();
        
        // Access and print values from the configuration
        System.out.println("Mode: " + config.getValue("mode"));
        System.out.println("Font Size: " + config.getValue("font-size"));
        System.out.println("Font Type: " + config.getValue("font-type"));
    }
}
