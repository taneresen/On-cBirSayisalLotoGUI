package com.bilisimegitim.onucbirsayisallotogui.sayisalloto.ekran;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.bilisimegitim.onucbirsayisallotogui.sayisalloto.SayisalLoto;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SayisalLotoEkran extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SayisalLotoEkran frame = new SayisalLotoEkran();
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
	public SayisalLotoEkran() {
		setTitle("Sayisal Loto V2.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SAYISAL LOTO");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 13, 444, 37);
		contentPane.add(lblNewLabel);
		
		tf1 = new JTextField();
		tf1.setBounds(12, 76, 64, 22);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(88, 76, 64, 22);
		contentPane.add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(164, 76, 64, 22);
		contentPane.add(tf3);
		
		tf4 = new JTextField();
		tf4.setColumns(10);
		tf4.setBounds(240, 76, 64, 22);
		contentPane.add(tf4);
		
		tf5 = new JTextField();
		tf5.setColumns(10);
		tf5.setBounds(316, 76, 64, 22);
		contentPane.add(tf5);
		
		tf6 = new JTextField();
		tf6.setColumns(10);
		tf6.setBounds(392, 76, 64, 22);
		contentPane.add(tf6);
		
		JButton btnNewButton = new JButton("CEVIR");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SayisalLoto loto = new SayisalLoto();
				
				int[] sayilar = loto.arrayOlustur();
				tf1.setText(String.valueOf(sayilar[0]));
				tf2.setText(String.valueOf(sayilar[1]));
				tf3.setText(String.valueOf(sayilar[2]));
				tf4.setText(String.valueOf(sayilar[3]));
				tf5.setText(String.valueOf(sayilar[4]));
				tf6.setText(String.valueOf(sayilar[5]));
				
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(189, 165, 97, 25);
		contentPane.add(btnNewButton);
	}
}
