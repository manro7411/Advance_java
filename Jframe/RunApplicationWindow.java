package Jframe;
import javax.swing.*;
public class RunApplicationWindow {
    
    public RunApplicationWindow(int w,int h){
        JFrame frame = new JFrame("Composite/Template Method in Java Swing");
        frame.setSize(w,h);
        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );
        frame.add(new MainCanvas(600,400));

        frame.pack();
        frame.setVisible(true);
    }
    public RunApplicationWindow(){
        this(600,600);
    }
    

}
