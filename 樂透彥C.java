import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Lottery1 extends JFrame {
	
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	private JPanel contentPane;
	private JTable table;
	
	private JTextField txfNow1;
	private JTextField txfNow2;
	private JTextField txfNow3;
	private JTextField txfNow4;
	private JTextField txfNow5;
	private JTextField txfNow6;
	private JTextField txfOpen1;
	private JTextField txfOpen2;
	private JTextField txfOpen3;
	private JTextField txfOpen4;
	private JTextField txfOpen5;
	private JTextField txfOpen6;
	private JTextField textField_12;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lottery1 frame = new Lottery1();
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
	public Lottery1() {
		setTitle("大樂透程式");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 707);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelAll = new JPanel();
		panelAll.setBounds(5, 446, 508, 200);
		panelAll.setBackground(new Color(224, 255, 255));
		panelAll.setPreferredSize(new Dimension(10, 200));
		contentPane.add(panelAll);
		panelAll.setLayout(new BorderLayout(0, 0));
		
		JTextArea txArea對獎訊息 = new JTextArea();
		txArea對獎訊息.setSelectedTextColor(new Color(112, 128, 144));
		txArea對獎訊息.setBackground(new Color(255, 192, 203));
		txArea對獎訊息.setPreferredSize(new Dimension(220, 25));
		panelAll.add(txArea對獎訊息, BorderLayout.WEST);
		
		JScrollPane scrollPane已選號碼 = new JScrollPane();
		scrollPane已選號碼.setBackground(new Color(224, 255, 255));
		panelAll.add(scrollPane已選號碼, BorderLayout.CENTER);
		
		table = new JTable();
		table.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		table.setSelectionForeground(new Color(154, 205, 50));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"    \u7B2C\u4E00\u7D44", null},
				{"    \u7B2C\u4E8C\u7D44", null},
				{"    \u7B2C\u4E09\u7D44", null},
				{"    \u7B2C\u56DB\u7D44", null},
				{"    \u7B2C\u4E94\u7D44", null},
				{"    \u7B2C\u516D\u7D44", null},
				{"    \u7B2C\u4E03\u7D44", null},
				{"    \u7B2C\u516B\u7D44", null},
				{"    \u7B2C\u4E5D\u7D44", null},
				{"    \u7B2C\u5341\u7D44", null},
			},
			new String[] {
				"   \u7D44\u6578", "   \u5DF2\u7D93\u9078\u904E\u7684\u865F\u78BC"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(60);
		table.getColumnModel().getColumn(1).setPreferredWidth(165);
		scrollPane已選號碼.setViewportView(table);
		
		JPanel panelSec = new JPanel();
		panelSec.setBackground(new Color(175, 238, 238));
		panelSec.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelSec.setPreferredSize(new Dimension(10, 40));
		panelAll.add(panelSec, BorderLayout.NORTH);
		panelSec.setLayout(null);
		
		JButton btnAuto = new JButton("自動對獎");
		btnAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAuto.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new EmptyBorder(5, 10, 5, 10)));
		btnAuto.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		btnAuto.setPreferredSize(new Dimension(111, 23));
		btnAuto.setMargin(new Insets(0, 14, 0, 14));
		btnAuto.setBounds(50, 5, 100, 30);
		panelSec.add(btnAuto);
		
		JButton btnClear = new JButton("全部清空");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new EmptyBorder(5, 10, 5, 10)));
		btnClear.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		btnClear.setBounds(377, 5, 100, 30);
		panelSec.add(btnClear);
		
		JButton btnDellone = new JButton("刪除一筆");
		btnDellone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDellone.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new EmptyBorder(5, 10, 5, 10)));
		btnDellone.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		btnDellone.setBounds(257, 5, 100, 30);
		panelSec.add(btnDellone);
		
		JPanel panelTmp = new JPanel();
		panelTmp.setBounds(5, 203, 508, 60);
		contentPane.add(panelTmp);
		panelTmp.setPreferredSize(new Dimension(10, 60));
		panelTmp.setBackground(new Color(135, 206, 250));
		panelTmp.setLayout(null);
		
		JButton btnComputer = new JButton("電腦選號");
		btnComputer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnComputerClick();
			}
		});
		btnComputer.setBounds(47, 15, 89, 37);
		btnComputer.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new EmptyBorder(5, 10, 5, 10)));
		btnComputer.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		panelTmp.add(btnComputer);
		
		JButton btnRecheck = new JButton("確認號碼");
		btnRecheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRecheck.setBounds(151, 15, 89, 37);
		btnRecheck.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new EmptyBorder(5, 10, 5, 10)));
		btnRecheck.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		panelTmp.add(btnRecheck);
		
		JButton btnSetnew = new JButton("重置號碼");
		btnSetnew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSetnew.setBounds(255, 15, 89, 37);
		btnSetnew.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new EmptyBorder(5, 10, 5, 10)));
		btnSetnew.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		panelTmp.add(btnSetnew);
		
		JButton btnOpen = new JButton("本期獎號");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOpen.setBounds(359, 15, 89, 37);
		btnOpen.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new EmptyBorder(5, 10, 5, 10)));
		btnOpen.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		panelTmp.add(btnOpen);
		
		
		
		JPanel panelBtn = new JPanel();
		panelBtn.setBounds(5, 256, 508, 190);
		contentPane.add(panelBtn);
		panelBtn.setBackground(new Color(255, 204, 0));
		panelBtn.setPreferredSize(new Dimension(10, 30));
		panelBtn.setLayout(null);
		
		JLabel label_1 = new JLabel("目前選擇的號碼");
		label_1.setBounds(192, 10, 126, 25);
		label_1.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		panelBtn.add(label_1);
		
		txfNow1 = new JTextField();
		txfNow1.setBounds(30, 54, 71, 29);
		panelBtn.add(txfNow1);
		txfNow1.setColumns(5);
		
		txfNow2 = new JTextField();
		txfNow2.setBounds(106, 54, 71, 29);
		txfNow2.setColumns(5);
		panelBtn.add(txfNow2);
		
		txfNow3 = new JTextField();
		txfNow3.setBounds(182, 54, 71, 29);
		txfNow3.setColumns(5);
		panelBtn.add(txfNow3);
		
		txfNow4 = new JTextField();
		txfNow4.setBounds(258, 54, 71, 29);
		txfNow4.setColumns(5);
		panelBtn.add(txfNow4);
		
		txfNow5 = new JTextField();
		txfNow5.setBounds(334, 54, 71, 29);
		txfNow5.setColumns(5);
		panelBtn.add(txfNow5);
		
		txfNow6 = new JTextField();
		txfNow6.setBounds(410, 54, 71, 29);
		txfNow6.setColumns(5);
		panelBtn.add(txfNow6);
		
		textField_12 = new JTextField();
		textField_12.setBounds(30, 95, 71, 29);
		textField_12.setBackground(new Color(173, 255, 47));
		textField_12.setColumns(5);
		panelBtn.add(textField_12);
		
		JLabel label = new JLabel("特別號");
		label.setBounds(114, 97, 54, 25);
		label.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		panelBtn.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("本期獎號");
		lblNewLabel_1.setBounds(257, 97, 72, 25);
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		panelBtn.add(lblNewLabel_1);
		
		txfOpen1 = new JTextField();
		txfOpen1.setBounds(30, 133, 71, 29);
		txfOpen1.setColumns(5);
		panelBtn.add(txfOpen1);
		
		txfOpen2 = new JTextField();
		txfOpen2.setBounds(106, 133, 71, 29);
		txfOpen2.setColumns(5);
		panelBtn.add(txfOpen2);
		
		txfOpen3 = new JTextField();
		txfOpen3.setBounds(182, 133, 71, 29);
		txfOpen3.setColumns(5);
		panelBtn.add(txfOpen3);
		
		txfOpen4 = new JTextField();
		txfOpen4.setBounds(258, 133, 71, 29);
		txfOpen4.setColumns(5);
		panelBtn.add(txfOpen4);
		
		txfOpen5 = new JTextField();
		txfOpen5.setBounds(334, 133, 71, 29);
		txfOpen5.setColumns(5);
		panelBtn.add(txfOpen5);
		
		txfOpen6 = new JTextField();
		txfOpen6.setBounds(410, 133, 71, 29);
		txfOpen6.setColumns(5);
		panelBtn.add(txfOpen6);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(143, 188, 143));
		panel.setBounds(3, 0, 510, 205);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(7, 0, 0, 0));

		
		for (int i = 1; i<50 ; i++) {
			
			JButton btn = new JButton(String.valueOf(i));
		
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(btn.getText());					
				}
			});
			this.add(btn);
			panel.add(btn);
		}
	}
		public void btnRecheck() {
			Random rnd = new Random();
			
			new Thread() {
				public void run() {
					JButton btn = null;
					for(int i= 0; i<10; i++) {
						int index=rnd.nextInt(49);
						btn = buttons.get(index);
						Color oriColor = btn.getBackground();
						btn.setBackground(Color.YELLOW);
						
						try {
							Thread.sleep(500);
						}catch(InterruptedException ex) {
							ex.printStackTrace();
						}
						btn.setBackground(oriColor);
					}
					btn.setBackground(Color.CYAN);
				}
				}.start();
			}
		
		public void btnComputerClick() {
			
			Random rnd = new Random();
			
			new Thread() {
				
			public void run() {
			JButton btn = null;
			int count = 0;
			do {
			for(int i=0; i<15; i++) {	// 閃15次
				// do something
				int index = rnd.nextInt(49);		// 0 ~ 48
				btn = buttons.get(index);		// 隨機取1個button
				Color oriColor = btn.getBackground(); 	// 原本的背景色記錄起來
				btn.setBackground(Color.YELLOW);		// 改變背景色
				
				try {
					Thread.sleep(100);	// 停頓0.5秒, 這很慢, 可看到變化
				}catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				btn.setBackground(oriColor);	// 恢復原本的背景色
			}
			
			if(btn.getBackground() != Color.CYAN) { // 沒選過的球
				btn.setBackground(Color.CYAN);	// 確定顏色後不再變回去了
				count++; // 記數器增加
		
				} else {  // end run().
					
				}
			
			}while(count < 6);  // 要選6個號碼.start();		
		} // end btnFlashClick().
	}.start();
}
}
	
