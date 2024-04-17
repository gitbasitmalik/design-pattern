/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author sp21-bse-054
 */
public class WinCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("Window's Checkbox");
    }
    
}