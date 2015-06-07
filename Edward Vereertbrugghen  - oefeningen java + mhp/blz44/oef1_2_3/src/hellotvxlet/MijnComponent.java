/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.awt.Graphics;
import org.dvb.ui.DVBColor;
import org.havi.ui.HComponent;

/**
 *
 * @author student
 */
public class MijnComponent extends HComponent {
    
    public MijnComponent(int x1,int y1,int w,int h) {
    
     this.setBounds(x1, y1, w, h);   
     //this.setBounds(250, 250, 300, 300); //X1,y1,Width,Height
     
    
    }
    
    public void paint(Graphics g) { 
      //Schaduw
      g.setColor(new DVBColor(0,0,0,150));
    g.fillRoundRect(20, 20, 200, 100, 15, 15);
        //Blauwe Rechthoek
      g.setColor(new DVBColor(0,0,255,150)); //RGB Alpha
    //g.drawLine(0, 0, 200, 200);
    //g.drawLine(0, 100, 100, 0);
    //g.drawLine(0, 44, 44, 44);
    //g.drawString("My name Jeff", 30, 30);
    g.fillRoundRect(0, 0, 200, 100, 15, 15);
    
    //Tekst
    g.setColor(new DVBColor(255,255,0,255));
    g.drawString("My name is Jeff", 30, 30);
    
    
    }
    
    
    
    

}
