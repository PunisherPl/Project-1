import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Chooser extends JFrame {
	private JOptionPane okno;
	private JFileChooser filee;
	private String path, name;
	private File plik;
	private boolean czy;
	
	
	
	public Chooser()
	{
		okno = new JOptionPane("Wybierz plik");
		add(okno);
		okno.setVisible(true);
		filee = new JFileChooser();
		if (filee.showOpenDialog(null)== JFileChooser.APPROVE_OPTION)
		{
			plik = filee.getSelectedFile();
		path = plik.getAbsolutePath();
		czy = true;
		name = plik.getName();
		}
	}
	
	public String File()
	{
		return path;
		
	}
	public String getName()
	{
		
		return name;
	}
	

}
