package hellotvxlet;

import javax.tv.xlet.*;
import org.dvb.ui.*;
import java.awt.*;
import java.awt.event.*;

import org.havi.ui.*;
import org.havi.ui.event.*;


public class HelloTVXlet implements Xlet, HActionListener {
    
    public void actionPerformed(ActionEvent e) {
    System.out.println(e.getActionCommand());
    
    if(e.getActionCommand().equals("knop3_actioned")){
    
      tekstLabelCorrect = new HStaticText("SLIMME");
      tekstLabelCorrect.setLocation(300, 300);
      tekstLabelCorrect.setSize(200, 50);
      tekstLabelCorrect.setBackground(new DVBColor(0,255,0,255));
      tekstLabelCorrect.setBackgroundMode(HVisible.BACKGROUND_FILL);
      scene.add(tekstLabelCorrect);
      System.out.println("correct");
    }
    
    if(e.getActionCommand().equals("knop1_actioned")){
    
      tekstLabelFout = new HStaticText("DOMDOM");
      tekstLabelFout.setLocation(300, 300);
      tekstLabelFout.setSize(200, 50);
      tekstLabelFout.setBackground(new DVBColor(255,0,0,255));
      tekstLabelFout.setBackgroundMode(HVisible.BACKGROUND_FILL);
      scene.add(tekstLabelFout);
      System.out.println("fout");
    }
    
    if(e.getActionCommand().equals("knop2_actioned")){
    
     tekstLabelFout = new HStaticText("DOMDOM");
      tekstLabelFout.setLocation(300, 300);
      tekstLabelFout.setSize(200, 50);
      tekstLabelFout.setBackground(new DVBColor(255,0,0,255));
      tekstLabelFout.setBackgroundMode(HVisible.BACKGROUND_FILL);
      scene.add(tekstLabelFout);
      System.out.println("fout");
    }
    
    if(e.getActionCommand().equals("knop4_actioned")){
    
     tekstLabelFout = new HStaticText("DOMDOM");
      tekstLabelFout.setLocation(300, 300);
      tekstLabelFout.setSize(200, 50);
      tekstLabelFout.setBackground(new DVBColor(255,0,0,255));
      tekstLabelFout.setBackgroundMode(HVisible.BACKGROUND_FILL);
      scene.add(tekstLabelFout);
      System.out.println("fout");
    }
   
    
    }
    public HelloTVXlet() {
        
    }
    
   
    private XletContext actueleXletContext;
    private HScene scene;
    
    private boolean debug=true;
    
    private HStaticText tekstLabel, tekstLabelCorrect,tekstLabelFout;
    private HTextButton knop1,knop2,knop3,knop4;
    
    
    public void initXlet(XletContext context) throws XletStateChangeException {
      if(debug) System.out.println("Xlet Initialiseren");
      this.actueleXletContext = context;
      
      HSceneTemplate sceneTemplate = new HSceneTemplate();
      
      sceneTemplate.setPreference (HSceneTemplate.SCENE_SCREEN_DIMENSION, 
              new HScreenDimension(1.0f, 1.0f), HSceneTemplate.REQUIRED);
      
      sceneTemplate.setPreference (HSceneTemplate.SCENE_SCREEN_LOCATION, 
              new HScreenPoint(0.0f, 0.0f), HSceneTemplate.REQUIRED);
      
      scene = HSceneFactory.getInstance().getBestScene(sceneTemplate);
      
      tekstLabel = new HStaticText("Wie wordt FRED?");
      tekstLabel.setLocation(300, 100);
      tekstLabel.setSize(200, 50);
      tekstLabel.setBackground(new DVBColor(255,0,127,255));
      tekstLabel.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(tekstLabel);
      
      knop1 = new HTextButton(" IK");
      knop1.setLocation(100, 200);
      knop1.setSize(150, 50);
      knop1.setBackground(new DVBColor(0,0,0,179));
      knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(knop1);
      
      knop2 = new HTextButton("HIJ");
      knop2.setLocation(100, 300);
      knop2.setSize(150, 50);
      knop2.setBackground(new DVBColor(0,0,0,179));
      knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(knop2);
      
      knop3 = new HTextButton("Fred");
      knop3.setLocation(100, 400);
      knop3.setSize(150, 50);
      knop3.setBackground(new DVBColor(0,0,0,179));
      knop3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(knop3);
      
      knop4 = new HTextButton("Niemand");
      knop4.setLocation(100, 500);
      knop4.setSize(150, 50);
      knop4.setBackground(new DVBColor(0,0,0,179));
      knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(knop4);
      
      knop1.setFocusTraversal(null, knop2, null, null);
      knop2.setFocusTraversal(knop1, knop3, null, null);
      knop3.setFocusTraversal(knop2, knop4, null, null);
      knop4.setFocusTraversal(knop3, null, null, null);
      
      knop1.requestFocus();
      
      knop1.setActionCommand("knop1_actioned");
      knop2.setActionCommand("knop2_actioned");
      knop3.setActionCommand("knop3_actioned");
      knop4.setActionCommand("knop4_actioned");
      
      knop1.addHActionListener(this);
      knop2.addHActionListener(this);
      knop3.addHActionListener(this);
      knop4.addHActionListener(this);
    }

    public void startXlet() throws XletStateChangeException {
        
        if(debug) System.out.println("XLet Starten");
        
        scene.validate();
        scene.setVisible(true);
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional)
            throws XletStateChangeException {
     
    }
}
