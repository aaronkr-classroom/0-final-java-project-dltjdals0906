package com.market.page;

import javax.swing.*;
import java.awt.*;
import com.market.member.UserInIt;

public class GuestInfoPage extends JPanel {
	
	public GuestInfoPage(JPanel panel) {
		Font ft;
		ft = new Font("함초롬돋움", FONT.BOLD, 15);
		
		setLayout(null);
		
		Rectangle rect = panel.getBounds();
		System.out.println(rect);
		setPreferredSize(rect.getSize());
		
		JPanel namePanel = new JPanel();
		namePanel.setBounds(0, 100, 1000, 50);
		add(namePanel);
		JLabel nameLabel = new JLabel("이  름 : ");
		nameLabel.setFont(ft);
		nameLabel.setBackGround(Color.BLUE);
		
		JLabel nameField = new JLanbel();
		// nameField.setText("입력된 고객 이름");
		nameField.setText(UserInIt.getmUser().getName());
		nameField.setFont(ft);
		
		namePanel.add(nameLabel);
		namePanel.add(nameField);
		
		JPanel phonePanel = new JPanel();
		phonePanel.setBounds(0, 150, 1000, 100);
		add(phonePanel);
		JLabel phoneLabel = new JLabel("연락처 : ");
		phoneLabel.setFont(ft);
		JLabel phoneField = new JLabel();
		// phoneField.setText("입력된 고객 연락처");
		phoneField.setText(String.valueOf(UserInIt.getmUser().getPhone));
		phoneField.setFont(ft);
		
		phonePanel.add(phoneLabel);
		phonePanel.add(phoneField);
	}

}
