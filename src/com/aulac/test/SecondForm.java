package com.aulac.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class SecondForm extends JDialog{
	SecondForm(Frame parent){
		super(parent, "Sencond Form", true);
	
		final JButton save = new JButton("Save Fingerprint Template");
	    save.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {  }});
	
		final JButton load = new JButton("Read Fingerprint Template");
	    load.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {  }});
	
		final JButton quit = new JButton("Close Form");
	    quit.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) { dispose(); }});
			
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(4, 1, 0, 5));
		center.setBorder(BorderFactory.createEmptyBorder(20, 20, 5, 20));
		center.add(save);
		center.add(load);
		
		setLayout(new BorderLayout());
		add(center, BorderLayout.CENTER);
		
		pack();
		setSize((int)(getSize().width*1.6), getSize().height);
        setLocationRelativeTo(null);
		setVisible(true);
		
	}

}
