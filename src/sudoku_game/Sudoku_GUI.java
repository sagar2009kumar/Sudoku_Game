package sudoku_game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

class Sudoku_GUI implements ActionListener{
	
	// This is the graphical user interface for the sudoku
	JLabel jlab ;
	
	Sudoku_GUI(){
		
		jlab = new JLabel();
		JFrame jfrm = new JFrame("Sudoku");
		
		JPanel jp = new JPanel();
		
		GridLayout gl = new GridLayout(9,9);
		jp.setLayout(gl);
		
		JTextField jtf[][] = new JTextField[9][9];
		
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				jtf[i][j] = new JTextField();
				jtf[i][j].setBackground(Color.GRAY);
				jtf[i][j].setEditable(false);
				jtf[i][j].setPreferredSize(new Dimension(30,30));
				jp.add(jtf[i][j]);
			}
		}
		
		
		jfrm.setResizable(false);
		jp.setSize(450,450);
		jfrm.setLayout(null);
		
		jfrm.setSize(457,520);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Specify the first bar from the sudoku game
		JMenuBar jmb = new JMenuBar();
		
		// Create the first menu for the item
		JMenu jmFirst = new JMenu("Play");
		
		JMenuItem jmNew = new JMenuItem("New Game");
		JMenuItem jmReset = new JMenuItem("Reset");
		JMenuItem jmExit = new JMenuItem("Exit");
		jmFirst.add(jmNew);
		
		// Creating the menu for the reset of the sudoku
	    jmFirst.add(jmReset);
	    
	    // Creating the jmExit for the exit of the program
		jmFirst.addSeparator();
		jmFirst.add(jmExit);
		
		// Creating the new menu for the menu bar
		JMenu jmSecond = new JMenu("Option");
		
		// Creating the new jmiselectlevel for the selection of the level of the sudoku
		JMenuItem jmiSelectLevel = new JMenuItem("Select Level");
	
		jmSecond.add(jmiSelectLevel);
		
		// Creating the third menu for the menu bar
		JMenu jmHelp = new JMenu("Help");
		
		// Creating the menu for the author of the program
		JMenu jmAbout = new JMenu("About");
		
		jmb.add(jmFirst);
		jmb.add(jmSecond);
		jmb.add(jmHelp);
		jmb.add(jmAbout);
		
		// Adding the actionListener to the buttons
		jmSecond.addActionListener(this);
		jmNew.addActionListener(this);
		jmExit.addActionListener(this);
		jmiSelectLevel.addActionListener(this);
		jmReset.addActionListener(this);
		
		// Making a table for the program
		
		String[][] obj= new String[9][9];
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				obj[i][j] = new String(Integer.toString(i+j));
				
			}
		}
		jmb.setOpaque(true);
		jfrm.add(jlab);
		jfrm.setJMenuBar(jmb);
		jfrm.add(jp,BorderLayout.CENTER);
		jfrm.setVisible(true);
		
		
	}
	
	// Handle the menu item action events.
	
	public void actionPerformed(ActionEvent ae){
		//Get the action command from the menu selection
		String comStr = ae.getActionCommand();
		
		// If the user chooses the exit then exit the program.
		if(comStr.equals("Exit")){
			System.exit(0);
		}
		
		jlab.setText(comStr + " Selected");
	}
}
