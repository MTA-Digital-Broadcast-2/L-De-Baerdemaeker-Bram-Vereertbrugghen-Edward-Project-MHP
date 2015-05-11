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
    
    
    if(e.getActionCommand().equals("knop1_actioned")){
    
      
      tekstLabel1.setLocation(300, 300);
      tekstLabel1.setSize(200, 50);
      tekstLabel1.setBackground(new DVBColor(255,0,0,255));
      tekstLabel1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      scene.add(tekstLabel1);
      System.out.println("fout");
    }
    
    if(e.getActionCommand().equals("knop2_actioned")){
    
     
      tekstLabel2.setLocation(300, 300);
      tekstLabel2.setSize(200, 50);
      tekstLabel2.setBackground(new DVBColor(255,0,0,255));
      tekstLabel2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      scene.add(tekstLabel2);
      System.out.println("fout");
    }
    
    if(e.getActionCommand().equals("knop3_actioned")){
    
      
      tekstLabel3.setLocation(300, 300);
      tekstLabel3.setSize(200, 50);
      tekstLabel3.setBackground(new DVBColor(0,255,0,255));
      tekstLabel3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      scene.add(tekstLabel3);
      scene.setVisible(true);
      scene.show();
      scene.requestFocus();
      System.out.println("correct");
    }
    
    
    if(e.getActionCommand().equals("knop4_actioned")){
    
     
      tekstLabel4.setLocation(300, 300);
      tekstLabel4.setSize(200, 50);
      tekstLabel4.setBackground(new DVBColor(255,0,0,255));
      tekstLabel4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      scene.add(tekstLabel4);
      System.out.println("fout");
    }
    
    if(e.getActionCommand().equals("volgendevraag_actioned")){
    
     
      scene.removeAll();
      WelkeVraag = 2;
            
      
      
      System.out.println("volgende vraag klikt");
    }
   
    
    }
    public HelloTVXlet() {
        
    }
    
   
    private XletContext actueleXletContext;
    private HScene scene;
    
    private boolean debug=true;
    
    private HStaticText tekstLabel, tekstLabel3,tekstLabel1, tekstLabel2 ,tekstLabel4;
    private int WelkeVraag = 1;
    private HTextButton knop1,knop2,knop3,knop4,volgendevraag;
    
    
    public void initXlet(XletContext context) throws XletStateChangeException {
      if(debug) System.out.println("Xlet Initialiseren");
      this.actueleXletContext = context;
      
      HSceneTemplate sceneTemplate = new HSceneTemplate();
      
      sceneTemplate.setPreference (HSceneTemplate.SCENE_SCREEN_DIMENSION, 
              new HScreenDimension(1.0f, 1.0f), HSceneTemplate.REQUIRED);
      
      sceneTemplate.setPreference (HSceneTemplate.SCENE_SCREEN_LOCATION, 
              new HScreenPoint(0.0f, 0.0f), HSceneTemplate.REQUIRED);
      
      scene = HSceneFactory.getInstance().getBestScene(sceneTemplate);
      //WelkeVraag = 1;
      switch(WelkeVraag) {
          case 1:
              tekstLabel1 = new HStaticText("Fout");
              tekstLabel2 = new HStaticText("Fout");
              tekstLabel3 = new HStaticText("Correct");
              tekstLabel4 = new HStaticText("Fout");
              //Vraag:
              tekstLabel = new HStaticText("Hier komt een vraag (antwoord 3is juist)");
              //antwoorden
              knop1 = new HTextButton("Heh");
              knop2 = new HTextButton("antwoord 2");
              knop3 = new HTextButton("antwoord 3");
              knop4 = new HTextButton("Hoer 4");
              break;
          case 2:
              tekstLabel1 = new HStaticText("Fout");
              tekstLabel2 = new HStaticText("Fout");
              tekstLabel3 = new HStaticText("Correct");
              tekstLabel4 = new HStaticText("Fout");
              //Vraag:
              tekstLabel = new HStaticText("Dit is Vraag 2");
              //antwoorden
              knop1 = new HTextButton("nieuw antwoord");
              knop2 = new HTextButton("goh  2");
              knop3 = new HTextButton("juiste antwoord 3");
              knop4 = new HTextButton("letterlijk hitler");
              break;
      }
      
      
      tekstLabel.setLocation(300, 100);
      tekstLabel.setSize(400, 50);
      tekstLabel.setBackground(new DVBColor(255,0,127,255));
      tekstLabel.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(tekstLabel);
      
      
      knop1.setLocation(100, 200);
      knop1.setSize(150, 50);
      knop1.setBackground(new DVBColor(0,0,0,179));
      knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(knop1);
      
      
      
      knop2.setLocation(100, 300);
      knop2.setSize(150, 50);
      knop2.setBackground(new DVBColor(0,0,0,179));
      knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(knop2);
      
      
      knop3.setLocation(100, 400);
      knop3.setSize(150, 50);
      knop3.setBackground(new DVBColor(0,0,0,179));
      knop3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(knop3);
      
      
      knop4.setLocation(100, 500);
      knop4.setSize(150, 50);
      knop4.setBackground(new DVBColor(0,0,0,179));
      knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(knop4);
      
      volgendevraag = new HTextButton("Volgende Vraag");
      volgendevraag.setLocation(400, 500);
      volgendevraag.setSize(200, 50);
      volgendevraag.setBackground(new DVBColor(0,0,0,179));
      volgendevraag.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(volgendevraag);
      
      knop1.setFocusTraversal(volgendevraag, knop2, null, null);
      knop2.setFocusTraversal(knop1, knop3, null, null);
      knop3.setFocusTraversal(knop2, knop4, null, null);
      knop4.setFocusTraversal(knop3, volgendevraag, null, null);
      volgendevraag.setFocusTraversal(knop4, knop1, null, null);
      
      knop1.requestFocus();
      
      knop1.setActionCommand("knop1_actioned");
      knop2.setActionCommand("knop2_actioned");
      knop3.setActionCommand("knop3_actioned");
      knop4.setActionCommand("knop4_actioned");
      volgendevraag.setActionCommand("volgendevraag_actioned");
      
      knop1.addHActionListener(this);
      knop2.addHActionListener(this);
      knop3.addHActionListener(this);
      knop4.addHActionListener(this);
      volgendevraag.addHActionListener(this);
      
      
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
