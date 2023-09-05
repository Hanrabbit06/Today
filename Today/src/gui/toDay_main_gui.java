package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class toDay_main_gui extends JFrame{
	public startP startP = null;
	public void startframe() {
		getContentPane().add(startP);
	}
	
	public static void main(String[] args) {
		toDay_main_gui main = new toDay_main_gui();
		
		main.startP = new startP(null);
		
		main.add(main.startP);
		
		main.setResizable(false);
		main.setVisible(true);
		main.setPreferredSize(new Dimension(840,840/12*9));
		main.setSize(840,840/12*9);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setLocationRelativeTo(null);
		main.setTitle("오늘 뭐 먹지?");
	}

}

class startP extends JPanel{
	private JButton btnStart;
	private JButton  btnchange;
	private toDay_main_gui main;
	
	ImageIcon startbtn1 = new ImageIcon("./Button_Image/start_button_ver.1.png");
	ImageIcon startbtn1_1 = new ImageIcon("./Button_Image/start_button_check_ver.1.png");
	ImageIcon startbtn2 = new ImageIcon("./Button_Image/change_theme_ver.1.png");
	ImageIcon startbtn2_1 = new ImageIcon("./Button_Image/change_theme_check_ver.1.png");
	
	public startP(JPanel win) {
		this.main=main;
		setLayout(null);
		
		btnStart = new JButton(startbtn1);
		btnStart.setRolloverIcon(startbtn1_1);
		btnStart.setBorderPainted(false);
		btnStart.setSize(130, 57);
		btnStart.setLocation(350, 420);
		btnStart.setContentAreaFilled(false);
		add(btnStart);
		
		btnchange = new JButton(startbtn2);
		btnchange.setRolloverIcon(startbtn2_1);
		btnchange.setBorderPainted(false);
		btnchange.setSize(130, 57);
		btnchange.setLocation(670, 515);
		btnchange.setContentAreaFilled(false);
		add(btnchange);
		
	}
}
