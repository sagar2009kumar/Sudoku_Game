package sudoku_game;

import javax.swing.SwingUtilities;

class DriverProgram{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				 new Sudoku_GUI();
			}
		});
	}
}
