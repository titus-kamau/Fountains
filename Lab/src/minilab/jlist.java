package minilab;

// Imports
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

class ListExample extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	// Instance attributes used in this example
	private JPanel topPanel;
	private JList<String> listbox;

	// Constructor of main frame
	public ListExample() {
		// Set the frame characteristics
		setTitle("Simple ListBox Application");
		setSize(300, 100);
		setBackground(Color.gray);

		// Create a panel to hold all other components
		topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		getContentPane().add(topPanel);

		// Create some items to add to the list
		String listData[] = { "Item 1", "Item 2", "Item 3", "Item 4" };

		// Create a new listbox control
		listbox = new JList<String>(listData);
		
		listbox.addMouseListener(new MouseListener() {
		
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		topPanel.add(listbox, BorderLayout.CENTER);
		
	}

	// Main entry point for this example
	public static void main(String args[]) {
		// Create an instance of the test application
		ListExample mainFrame = new ListExample();
		mainFrame.setVisible(true);
	}

}
