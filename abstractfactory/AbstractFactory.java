
package abstractfactory;

import java.awt.Window;

public class AbstractFactory {
    public static String getOSName()
    {
        String os = System.getProperty("os.name");
        return os;
    }

    public static void main(String[] args) {
       GUIFactory factory = null;
       String osname = getOSName();
       if(osname.equals("Window"))
       {
          factory = new WinFactory();
       }
       else if(osname.equals("Mac"))
       {
          factory = new MacFactory();
       }
       
       Application app = new Application(factory);
       app.createUI();
       app.buttonPaint();
       app.checkboxPaint();
    }
    
}
