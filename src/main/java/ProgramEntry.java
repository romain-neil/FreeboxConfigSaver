import java.util.logging.Level;
import java.util.logging.Logger;

public class ProgramEntry {

	public static void main(String[] args) {
		MainWindow fen;

		try {
			fen = new MainWindow();

			fen.setLocationByPlatform(true);
			fen.setVisible(true);
		} catch(Exception ex) {
			Logger.getLogger(ProgramEntry.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
