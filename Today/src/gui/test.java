package gui;

import java.awt.Frame;

import javax.swing.JFrame;


public class test extends JFrame{
	public test() {
		Frame startFrame =  new Frame();
		startFrame.setTitle("오늘 뭐 먹지?");
		startFrame.setBounds(100,100,300,300);
		startFrame.setVisible(true);
	}
	public static void main(String args[]) {
		test frame = new test();
	}
}
