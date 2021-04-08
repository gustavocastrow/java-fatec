package carros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.HashSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

public class Form extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnButton = new JButton("New button");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"\n MARCA: " +txtMarca.getText() + "\n MODELO: " +txtModelo.getText());
				
				HashSet conjunto = new HashSet();
				
				conjunto.add("Honda");
				conjunto.add("Toyota");
				conjunto.add("Chevrolet");
				conjunto.add("Fiat");
				conjunto.add("Cherry");
				conjunto.add("Renault");

				System.out.println(conjunto.toString());
				
				conjunto.remove("Fiat");
				System.out.println(conjunto.toString());
				
				//map: Relação chave valor, primeiro elemento é chave o segundo valor
				HashMap mp = new HashMap();
				mp.put("Honda", "Civic");
				mp.put("Honda", "Fit");
				mp.put("Toyota", "Corolla");
				mp.put("Cherry", "Arizzo");
				mp.put("Renault", "Sandero RS");
				
				
				System.out.println(mp.get("Honda"));
				System.out.println(mp.get("Toyota"));
				System.out.println(mp.get("Cherry"));
				System.out.println(mp.get("Renault"));
				
				//list: Coleção ordenada, elemento permanece na ordem que foi inserido
				
			}
		});
		btnButton.setBounds(169, 168, 89, 23);
		contentPane.add(btnButton);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Carro");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(150, 11, 181, 38);
		contentPane.add(lblNewLabel);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(32, 82, 86, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("MARCA");
		lblNewLabel_1.setBounds(32, 62, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(32, 132, 86, 20);
		contentPane.add(txtModelo);
		
		JLabel lblNewLabel_1_1 = new JLabel("MODELO");
		lblNewLabel_1_1.setBounds(32, 113, 86, 14);
		contentPane.add(lblNewLabel_1_1);
	}
}
