package GUI;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUI extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	
	public GUI() {
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblWert = new JLabel("Wert1");
		getContentPane().add(lblWert);
		
		textField = new JTextField();
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblWert_1 = new JLabel("Wert2");
		getContentPane().add(lblWert_1);
		
		textField_1 = new JTextField();
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnBerechne = new JButton("Berechne");
		getContentPane().add(btnBerechne);
		
		pack();
		setVisible(true);
		super.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		GUI GUI = new GUI();

	}

}
