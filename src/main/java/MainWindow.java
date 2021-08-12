import javax.swing.*;

public class MainWindow extends JFrame {

	public MainWindow() {
		JMenuBar menuBar = new JMenuBar();

		//Création des menus
		JMenu menuFile = new JMenu("Fichier");

		setSize(500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Freebox Config Saver");

	}

}
