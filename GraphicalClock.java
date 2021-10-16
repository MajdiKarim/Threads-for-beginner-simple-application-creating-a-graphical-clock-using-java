package ex3;


import javax.swing.JFrame;
import javax.swing.JLabel;



public class GraphicalClock extends JLabel {
    public GraphicalClock() {
    	Time t = new Time(00,00,00);
        Timeincrementor tm = new Timeincrementor(t,this);
        Thread thr = new Thread(tm);
        thr.start();
        
    	
    }
	public static void main(String[] args) {
		JFrame frame = new JFrame("GraphicalClock");
		frame.setSize(400, 400);
		frame.setContentPane(new GraphicalClock());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setTitle("Clock");
		frame.setVisible(true);
		
	}
        




}
