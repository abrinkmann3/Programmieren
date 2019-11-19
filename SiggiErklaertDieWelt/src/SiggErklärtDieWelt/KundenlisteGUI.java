package SiggErklärtDieWelt;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class KundenlisteGUI extends JFrame{
	
	private JTable table;
	private KundenTableModel kundenTableModel;
	private ArrayList<Kunde> kundenliste = new ArrayList<Kunde>();
	private JButton btnBeenden;
	private JButton btnLschen;
	private JButton btnHinzufgen;
	
	
	
	public KundenlisteGUI() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblKundenbersicht = new JLabel("Kundenübersicht");
		panel.add(lblKundenbersicht);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnLschen = new JButton("Löschen");
		panel_1.add(btnLschen);
		btnLschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeKunde();
			}
		});
		
		JButton btnHinzufgen = new JButton("Hinzufügen");
		panel_1.add(btnHinzufgen);
		btnHinzufgen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addKunde(1, "Paul", false);
			}
		});
		
		JButton btnBeenden = new JButton("Beenden");
		panel_1.add(btnBeenden);
		
//		btnBeenden.addActionListener(new ActionListener() { //Anonyme Klasse Varriante 1
//			@Override										//manchmal spinnt er wegen @Override rum
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//				System.exit(0);
//			}
//		}); 
		
//		btnBeenden.addActionListener(new ActionListener() { //Anonyme Klasse Varriante 1.5
//		@Override										
//		public void actionPerformed(ActionEvent e) {
//			beenden();
//		}
//	}); 
		
		// Methode 2 Missbrauch des JFrames implementieren des Actionlisteners in unsere GUI klasse
//		btnBeenden.addActionListener(this); //Brauch man für die Auslagerung eines Buttons Methode 2
		
		btnBeenden.addActionListener(new beendenListener()); // Methode 3 Ruft die Klasse beendenListener auf
		
		
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		
		kundenTableModel = new KundenTableModel(kundenliste);
		table = new JTable(kundenTableModel);
		scrollPane.setViewportView(table);
		
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("About");
		menubar.add(menu);
		
		JMenuItem item = new JMenuItem("Über");
		item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(panel, "© <Tim>", "Über", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		menu.add(item);
		setJMenuBar(menubar);
		
		pack();
		setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public class beendenListener implements ActionListener { //Methode 3 Auslagerrung des Actionlistener in eine Eigene Klasse
		public void actionPerformed (ActionEvent e) {
			dispose();
			System.exit(0);
		}
		
	}
	
//	public void actionPerformed(ActionEvent e) { //Ausgelagerter Actionlistener von Methode 2
//		if(e.getSource() == btnBeenden) {
//		dispose();
//		System.exit(0);
//		}
//	}
	
	
	
	
	public void beenden() { //Ausgelagerte Methode Varriante 1.5
		dispose();
		System.exit(0);
	}
	
	public void removeKunde() {
		kundenliste.remove(0);
		kundenTableModel.fireTableDataChanged();
	}
	
	
	
	
	public void addKunde(int kdnr, String name, boolean isAktiv) {
		kundenliste.add(new Kunde(kdnr, name, isAktiv));
		kundenTableModel.fireTableDataChanged();
	}
	

	public static void main(String[] args) {
		
		KundenlisteGUI kundenListeGUI = new KundenlisteGUI();
		kundenListeGUI.addKunde(123, "Hans", true);
		
		
		
	}
	
}
