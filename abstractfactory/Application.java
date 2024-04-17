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
public class Application {
    private GUIFactory factory;
    private Buttons buttons;
    private Checkbox checkbox;
    public Application(GUIFactory factory)
    {
        this.factory = factory;
    }
    public void createUI()
    {
        this.buttons = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }
    public void buttonPaint()
    {
        buttons.paint();
    }
    public void checkboxPaint()
    {
        checkbox.paint();
    }
}
