package laporan9;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class cobagui {
	
	public static void main(String args[]) throws Exception {
		JFrame frame = new JFrame("Halo swing");
		JLabel label = new JLabel("Tes Label");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}

}
