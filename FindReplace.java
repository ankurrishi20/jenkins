package com.xavient.swing;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class FindReplace extends JFrame implements ItemListener, ActionListener {
	
JFrame f;
	
	public FindReplace(){
		super("Find/Replace");
		
		String[] Find = {};
		
		JLabel find = new JLabel("Find:");
		find.setBounds(10,15,90,18);
		//find.setFont(new Font("Papyrus",Font.ITALIC,100));
		add(find);
		
		JComboBox findcb = new JComboBox(Find);
		findcb.setBounds(110,15,120,20);
		findcb.setEditable(true);
		findcb.addActionListener(this);
		add(findcb);
		
		JLabel replace_With = new JLabel("Replace with:");
		replace_With.setBounds(10,45,90,20);
		//replace_With.setFont(new Font("Verdana", Font.ITALIC,400));
		add(replace_With);
		
		JComboBox replacecb = new JComboBox(Find);
		replacecb.setBounds(110,45,120,20);
		replacecb.setEditable(true);
		replacecb.addActionListener(this);
		add(replacecb);
		
		JRadioButton rb1 = new JRadioButton("Forward");
		rb1.setBounds(10,50,10,0);
		JRadioButton rb2 = new JRadioButton("Backward");
		rb2.setBounds(10,50,10,0);
		JPanel direc = new JPanel();
		direc.setBounds(5,80,110,75);		
		direc.add(rb1);
		direc.add(rb2);
		direc.setBorder(BorderFactory.createTitledBorder("Direction"));
		direc.setLayout(new BoxLayout(direc,BoxLayout.Y_AXIS));
		direc.setAlignmentX(Component.LEFT_ALIGNMENT);
		add(direc);
		
		JRadioButton rb3 = new JRadioButton("All");
		rb3.setBounds(10,50,10,0);
		JRadioButton rb4 = new JRadioButton("Selected lines");
		rb4.setBounds(10,50,10,0);
		JPanel scope = new JPanel();
		scope.setBounds(120,80,120,75);		
		scope.add(rb3);
		scope.add(rb4);
		scope.setBorder(BorderFactory.createTitledBorder("Scope"));
		scope.setLayout(new BoxLayout(scope,BoxLayout.Y_AXIS));
		scope.setAlignmentX(Component.LEFT_ALIGNMENT);
		add(scope);
		
		
		setLayout(null);
		setSize(250,358);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e){
		try {
			Component Frame = null;
			JOptionPane.showMessageDialog(Frame, "This is Working");			
		} catch (Exception e2) {
			e2.printStackTrace();
			System.out.println(e2.toString());
		}
	}
	
	public void itemStateChanged(ItemEvent arg0){
		try {
			Component frame = null;
			JOptionPane.showMessageDialog(frame, "This is also not working");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FindReplace();
	}	
	

}
