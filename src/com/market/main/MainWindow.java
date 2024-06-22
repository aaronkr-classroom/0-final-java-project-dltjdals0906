package com.market.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import com.market.page.GuestInfoPage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.market.cart.Cart;
import com.market.bookitem.BookInIt;
import com.market.page.CartAddItemPage;


public class MainWindow extends JFrame {
	static Cart mCart;
	static JPaenl mMenuPanel, mPagePanel;
	
	public MainWindow(String title, int x, int y, int width, int height) {
		
		initContainer(title, x, y, width, height);
		
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(new ImageIcon("./image/shop.png").getImage());
	}
	
	private void initContainer(String title, int x, int y, int width, int height) {
		setTitle(title);
		setBounds(x, y, width, height);
		setLayout(null);
		
		Dimension screenSize = ToolKit.getDefaultToolkit().getScreenSize();
		
		setLocation((screenSize.width - 1000) / 2, (screenSize.height - 750) / 2);
		mMenuPanel = new JPanel();
		mMenuPanel.setBounds(0, 150, width, 130);
		menuIntroduction();
		add(mMenuPanel);
		
		mPagePanel = new mPanel();
		mPagePaenl.setBounds(0, 150, width, height);
		add(mPagePanel);
		
		this.addWindowListner(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				setVisble(false);
				new GuestWindow("고객 정보 입력", 0, 0, 1000, 750);
			}
		});
	}
	
	private void menuIntroduction() {
		mCart = new Cart();
		Font ft;
		ft = new Font("함초롬돋움", Font.BOLD, 15);
		
		JButton bt1 = new JButton("고객 정보 확인하기",
				new ImageIcon("./image/1.png"));
		bt1.setBounds(0,0,100,50);
		bt1.setFont(ft);
		mMenuPanel.add(bt1);
		
		bt1.addActionListner(new ActionListner() {
			public void actionperformed(ActionEvent e) {
				mPagePanel.removeAll();
				mPagePanel.add("고객 정보 확인", new GuestInfoPage(mPagePanel));
				// 패널(mPagePanel)에 GuestInfoPage의 내용 출력
				mPagePanel.revalidate();
				mPagePanel.repaint();
			}
		});
		
		JButton bt2 = new JButton("장바구니 상품 목록 보기",
				new ImageIcon("./image/2.png"));
		bt2.setBounds(0,0,100,30);
		bt2.setFont(ft);
		mMenuPanel.add(bt2);
		
		// ppt 36p 버튼 2부분하기
		
		JButton bt3 = new JButton("장바구니 비우기",
				new ImageIcon("./image/3.png"));
		bt3.setBounds(0,0,100,30);
		bt3.setFont(ft);
		mMenuPanel.add(bt3);
		
		JButton bt4 = new JButton("장바구니에 항목 추가하기",
				new ImageIcon("./image/4.png"));
		bt4.setBounds(0,0,100,30);
		bt4.setFont(ft);
		mMenuPanel.add(bt4);
		
		bt4.addActionListner(new ActionListner() {
			public void actionPerformed(ActionEvent e) {
				
				mPagePanel.removeall();
				BookInIt.init();
				mPagePanel.add("장바구니에 항목 추가하기", new CartAddItemPage(mPagePanel, mCart));
				mPagePanel.revalidate();
				mPagePanel.rePaint();
			}
		});
		
		JButton bt5 = new JButton("장바구니의 항목 수량 줄이기",
				new ImageIcon("./image/5.png"));
		bt5.setBounds(0,0,100,30);
		bt5.setFont(ft);
		mMenuPanel.add(bt5);
		
		JButton bt6 = new JButton("장바구니의 항목 삭제하기",
				new ImageIcon("./image/6.png"));
		bt6.setBounds(0,0,100,30);
		bt6.setFont(ft);
		mMenuPanel.add(bt6);
		
		JButton bt7 = new JButton("주문하기",
				new ImageIcon("./image/7.png"));
		bt7.setBounds(0,0,100,30);
		bt7.setFont(ft);
		mMenuPanel.add(bt7);
		
		JButton bt8 = new JButton("종료",
				new ImageIcon("./image/8.png"));
		bt8.setBounds(0,0,100,30);
		bt8.setFont(ft);
		mMenuPanel.add(bt8);
		
		JButton bt9 = new JButton("관리자",
				new ImageIcon("./image/9.png"));
		bt9.setBounds(0,0,100,30);
		bt9.setFont(ft);
		mMenuPanel.add(bt9);
	}
	
}
