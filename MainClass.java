package demogame;

import javax.swing.JFrame;

public class MainClass {
	
	public static void main(String agrs[]) {
		JFrame f = new JFrame();
		f.setTitle("Brick Breaker");
		f.setSize(700,600);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(false);
		
		
		GamePLay gameplay = new GamePLay();
		f.add(gameplay);
		
	}

}
