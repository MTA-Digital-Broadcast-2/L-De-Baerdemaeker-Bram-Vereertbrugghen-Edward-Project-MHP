package hellotvxlet;

import javax.tv.xlet.*;
import org.dvb.ui.*;
import java.awt.*;
import java.awt.event.*;

import org.havi.ui.*;
import org.havi.ui.event.*;


public class HelloTVXlet implements Xlet, HActionListener {
       
    

    public void initXlet(XletContext ctx) throws XletStateChangeException {
       
         
        HScene scene = HSceneFactory.getInstance().getDefaultHScene();
        
        MijnComponent mc= new MijnComponent(250,250,300,300);
        
        scene.add(mc);
        scene.validate();
        scene.setVisible(true);
        
    }

    public void pauseXlet() {
    }

    public void startXlet() throws XletStateChangeException {
      
       
    }

    public void actionPerformed(ActionEvent arg0) {
    }
    
    public void destroyXlet(boolean unconditional) throws XletStateChangeException {
    }
    
}
