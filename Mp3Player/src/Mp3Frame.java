

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.sql.Time;
import java.time.Duration;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.media.Media;








public class Mp3Frame extends JFrame implements ActionListener,ChangeListener,Runnable{

	private JButton play, pause, rate, rate2, OpenFileButton;
	private String a, path;
	private JSlider slide, slide2;
	private String uriString,y;
	private MediaPlayer player;
	private JLabel label1,time, k, look, name;
	private JFileChooser filee;
	private JDialog list;
	private Chooser u;
	private double volume;
	private boolean playing, choose;
	 private   double stopTime, startTime,currentTime, realTime, percent;
	 private   int position;
	private Status j;

	private boolean what;
	public Mp3Frame(String i) 
	{
		String j = i;
		
		new javafx.embed.swing.JFXPanel();
		
	    
		setTitle("Mp3 Player");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocation(100, 100);
		setSize(300, 600);
		setLayout(null);
	    setResizable(false);
	    
		 uriString = new File(i).toURI().toString();
		    
		    player = new MediaPlayer(new Media(uriString));
	    
	    OpenFileButton = new JButton ("Open File...");
	    OpenFileButton.setBounds(90, 450, 100, 50);
	    add(OpenFileButton);
	    OpenFileButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 
				u = new Chooser();
				String h = u.File();
				 uriString = new File(h).toURI().toString();
				 player.pause();
				    player = new MediaPlayer(new Media(uriString));
				   String j = u.getName();
				   name = new JLabel();
				   name.setBounds(20, 300, 150, 100);
				   
				   add(name);
				   name.setText(j);
				   name.setVisible(true);
				    player.play();


					volume = slide.getValue();
					volume /=100;
					player.setVolume(volume);
						
						volume *=100;
						String b = String.valueOf(volume);
						label1.setText("Volume " + b + " %");
				    
				
			}
	    	
	    	
	    	
	    });


	   
		    a = "\u25BA";
		    play = new JButton (a);
		    play.setBounds(75, 70, 50, 50);
		    add(play);



		    play.addActionListener(new ActionListener() {
		    	@Override
		    	public void actionPerformed(ActionEvent e) {
		    		
		    		
		    		Object source = e.getSource();
		    		if (source == play)
		    		{
		    		    player.play();
		    		    
		    		    player.setRate(1.0);
		    		}
		    		
		    		what = true;
		    		  
		    		
		    	
		    		


		 	        	   



		    		    
		    		
		    	
		    	
		    	}
		    	});
		    
		    

		    pause = new JButton ("\u23F8");
		    pause.setBounds(125,70,50,50);
		    add(pause);
		    pause.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		
		    		Object source = e.getSource();
		    		
		    		if(source == pause)
		    		{
			    	   

			    	    
		    		    player.pause();  
		    		}
		    	
		    	
		    	}});
		    
			label1 = new JLabel();
			label1.setBounds(200, 40, 100, 50);
			add(label1);
		    slide= new JSlider(0,100,50);
		    slide.setBounds(25,145,100,50);
		    add(slide);
		    slide.setMajorTickSpacing(50);
		    slide.setPaintTicks(true);
		    slide.setForeground(Color.RED);
		    volume();
		    slide2= new JSlider(0,1000000,0);
		    slide2.setBounds(125,140,100,50);

		    slide2.setForeground(Color.RED);
		    add(slide2);



		  
		    


		    
		    rate = new JButton ("\u23ED");
		    rate.setBounds(175,70,50,50);
		    add(rate);
		    rate.addActionListener(new ActionListener() {
		    	public void actionPerformed (ActionEvent e)
		    	{
		    		Object sprawdz = e.getSource();
		    		if (sprawdz == rate)
		    		{
		    		
		    		
		    		javafx.util.Duration t;
					javafx.util.Duration x;
		    		t = player.getCurrentTime();
		    		x = t.divide(0.9);
		    		player.seek(x);
		    		
		    		}
		    	}
		    	
		    	
		    });

		    rate2 = new JButton ("\u23EA");
		    rate2.setBounds(25,70,50,50);
		    add(rate2);
		    rate2.addActionListener(new ActionListener () {
		    	public void actionPerformed (ActionEvent e)
		    	{

		    		
		    		javafx.util.Duration t;
					javafx.util.Duration x;
		    		t = player.getCurrentTime();
		    		x = t.divide(1.1);
		    		player.seek(x);
		    	
		    		

		    	
		    	
		    	}});
		    time = new JLabel ("Time ");
		    time.setBounds(25, 100, 50, 50);
		    javafx.util.Duration g;
		    String h;
		    
		    name = new JLabel();
		    name.setBounds(50, 300, 100, 240);
		    add(name);
		    
		    
		    
		    

	    



		
		setVisible(true);
		
    		}
	
	

public void volume ()
{
    slide.addChangeListener(new ChangeListener() {

		@Override
		public void stateChanged(ChangeEvent e) {
			
			volume = slide.getValue();
			volume /=100;
			player.setVolume(volume);
				
				volume *=100;
				String b = String.valueOf(volume);
				label1.setText("Volume " + b + " %");


				
				
			
			
			
		}
    	
    });
}
		
		public boolean wh()
		{
			return what;
		}
public void slie()
{
    slide2.addChangeListener(new ChangeListener() {

    	

		@Override
		public void stateChanged(ChangeEvent e) {
			JSlider source = (JSlider) e.getSource();
			javafx.util.Duration g;
			if (source.getValueIsAdjusting()==false)return;  
			{
			
			
			

			int a = slide2.getValue();
			double c = a*percent;
			long d = (long) c;
			g = javafx.util.Duration.seconds(c);
			player.seek(g);
		}
			
		}
		
    	
    	
    	
    });
}

	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void run() {
		

		while(slide2.getValue()!=1000000)
			
	{
			String v;
	    stopTime = player.getStopTime().toSeconds();
	    startTime = player.getStartTime().toSeconds();
	    currentTime = player.getCurrentTime().toSeconds();
	    percent = stopTime/1000000;
	    realTime = currentTime/percent;
	    position = slide2.getValue();
	    v = String.valueOf(currentTime);
	    time.setText(v);
	    slide2.setValue((int)realTime);
		try {
			//usypiamy w¹tek na 100 milisekund
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    slie();
	}
		

	}

	







}

