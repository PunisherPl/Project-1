



public class MyMp3Player {

	public static void main(String[] args) {
		Chooser a = new Chooser();
		String pathh;
		pathh = a.File();
			
		Mp3Frame w1 = new Mp3Frame(pathh);
		
		
		if(w1.wh()==true);
		{
		(new Thread(w1)).start();
		}
		
		
		
		

	}

}
