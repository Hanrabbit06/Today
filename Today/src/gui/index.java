package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class index {
	static Random random = new Random();
	static int random_data = 0;
	static Scanner menu = new Scanner(System.in);
	static String cate;
	static int lport;
	static String rhost;
	static int rport;
	static String changed;
	static ArrayList<UserBean> menu_list = new ArrayList<UserBean>();
	static String cate_name;
	
	public static void main_Frame() {
		JFrame main =  new JFrame();
		main.setResizable(false);
		main.setVisible(true);
		main.setPreferredSize(new Dimension(840,840/12*9));
		main.setSize(840,840/12*9);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setLocationRelativeTo(null);
		main.setTitle("오늘 뭐 먹지?");
		main.getContentPane().setLayout(null);
		
		JButton start = new JButton("");
		ImageIcon startbtn1 = new ImageIcon("./Button_Image/start_button_ver.1.png");
		ImageIcon startbtn1_1 = new ImageIcon("./Button_Image/start_button_check_ver.1.png");
		start = new JButton(startbtn1);
		start.setRolloverIcon(startbtn1_1);
		start.setBorderPainted(false);
		start.setSize(130, 57);
		start.setLocation(350, 420);
		start.setContentAreaFilled(false);
		
		Container contentPane = main.getContentPane();
		contentPane.setBackground(Color.black);
		
		main.getContentPane().add(start);
		
		main.setVisible(true);
		
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				if(btn.getText().equals("한식")) {
					cate = "한식";
					sub_Frame(cate);
					main.disable();
				}
			}
		});
	}
	public static void sub_Frame(String cate) {
		JFrame selectp = new JFrame("오늘의 "+cate+"추천 메뉴는?");
		JPanel p2 = new JPanel();
		selectp.setSize(840,840/12*9);
		selectp.setLocationRelativeTo(null);
		selectp.getContentPane().setLayout(null);
		
		Container contentPane = selectp.getContentPane();
		contentPane.setBackground(Color.blue);
		
		contentPane.setLayout(new BorderLayout());
		
		if(cate == "한식") {
			changed = "Korea";
			cate_name = "한식";
			
			JLabel label = new JLabel(menu_list.get(random_data).getname()+" 입니다!");
			selectp.add(label);
		}
		selectp.add(p2);
		selectp.setVisible(true);
	}
	
	public static void main(String[] args) {
	}
}