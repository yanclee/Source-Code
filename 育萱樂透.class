import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class lotto extends JFrame implements ActionListener {

	 /*Initialization*/

	private JPanel contentPane;
	
	/*=====下注號碼textField======*/
	private JTextField tbAutoNum1;
	private JTextField tbAutoNum2;
	private JTextField tbAutoNum3;
	private JTextField tbAutoNum4;
	private JTextField tbAutoNum5;
	private JTextField tbAutoNum6;
	private JTextField tbAutoNum7;

	int auto_nums[] = new int[7];//電腦產生號碼
	int auto_temp = 0;//暫存產生號碼
	boolean special_num = false;//判斷特別號是否相同

	static int nums[] = new int[7];//開獎號碼
	static int temp = 0;//暫存產生號碼
	static int i,j=0, counter=0;//計數器
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lotto frame = new lotto();
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
	public lotto() {
		setTitle("\u5927\u6A02\u900F\u5C0D\u734E\u5668");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 466);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_LetsRoll = new JPanel();
		panel_LetsRoll.setBounds(0, 244, 485, 178);
		panel_LetsRoll.setForeground(Color.WHITE);
		panel_LetsRoll.setBackground(new Color(51, 51, 102));
		contentPane.add(panel_LetsRoll);
		panel_LetsRoll.setLayout(null);
		
		JLabel label_8 = new JLabel("\u7B2C\u4E8C\u865F");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_8.setBounds(90, 13, 45, 20);
		panel_LetsRoll.add(label_8);
		
		JLabel label_9 = new JLabel("\u7B2C\u4E09\u865F");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_9.setBounds(156, 13, 45, 20);
		panel_LetsRoll.add(label_9);
		
		JLabel label_10 = new JLabel("\u7B2C\u56DB\u865F");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_10.setBounds(222, 13, 45, 20);
		panel_LetsRoll.add(label_10);
		
		JLabel label_11 = new JLabel("\u7B2C\u4E94\u865F");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_11.setBounds(288, 13, 45, 20);
		panel_LetsRoll.add(label_11);
		
		JLabel label_12 = new JLabel("\u7B2C\u516D\u865F");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_12.setBounds(354, 13, 45, 20);
		panel_LetsRoll.add(label_12);
		
		JLabel label_13 = new JLabel("\u7279\u5225\u865F");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(new Color(255, 105, 180));
		label_13.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_13.setBounds(420, 13, 45, 20);
		panel_LetsRoll.add(label_13);
		
		JLabel label_14 = new JLabel("\u7B2C\u4E00\u865F");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		label_14.setBounds(14, 13, 55, 20);
		panel_LetsRoll.add(label_14);
		
		
		
		JLabel lblNum1 = new JLabel("");
		lblNum1.setBorder(new LineBorder(SystemColor.activeCaption));
		lblNum1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum1.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 36));
		lblNum1.setForeground(new Color(255, 255, 255));
		lblNum1.setBackground(new Color(255, 255, 255));
		lblNum1.setBounds(14, 46, 57, 54);
		panel_LetsRoll.add(lblNum1);
		
		JLabel lblNum2 = new JLabel("");
		lblNum2.setBorder(new LineBorder(SystemColor.activeCaption));
		lblNum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum2.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 36));
		lblNum2.setForeground(new Color(255, 255, 255));
		lblNum2.setBackground(new Color(255, 255, 255));
		lblNum2.setBounds(81, 46, 57, 54);
		panel_LetsRoll.add(lblNum2);
		
		JLabel lblNum3 = new JLabel("");
		lblNum3.setBorder(new LineBorder(SystemColor.activeCaption));
		lblNum3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum3.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 36));
		lblNum3.setForeground(new Color(255, 255, 255));
		lblNum3.setBackground(new Color(255, 255, 255));
		lblNum3.setBounds(148, 46, 57, 54);
		panel_LetsRoll.add(lblNum3);
		
		JLabel lblNum4 = new JLabel("");
		lblNum4.setBorder(new LineBorder(SystemColor.activeCaption));
		lblNum4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum4.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 36));
		lblNum4.setForeground(new Color(255, 255, 255));
		lblNum4.setBackground(new Color(255, 255, 255));
		lblNum4.setBounds(215, 46, 57, 54);
		panel_LetsRoll.add(lblNum4);
		
		JLabel lblNum5 = new JLabel("");
		lblNum5.setBorder(new LineBorder(SystemColor.activeCaption));
		lblNum5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum5.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 36));
		lblNum5.setForeground(new Color(255, 255, 255));
		lblNum5.setBackground(new Color(255, 255, 255));
		lblNum5.setBounds(282, 46, 57, 54);
		panel_LetsRoll.add(lblNum5);
		
		JLabel lblNum6 = new JLabel("");
		lblNum6.setBorder(new LineBorder(SystemColor.activeCaption));
		lblNum6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum6.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 36));
		lblNum6.setForeground(new Color(255, 255, 255));
		lblNum6.setBackground(new Color(255, 255, 255));
		lblNum6.setBounds(349, 46, 57, 54);
		panel_LetsRoll.add(lblNum6);
		
		JLabel lblNum7 = new JLabel("");
		lblNum7.setBorder(new LineBorder(SystemColor.activeCaption));
		lblNum7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum7.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 36));
		lblNum7.setForeground(new Color(255, 105, 180));
		lblNum7.setBackground(new Color(255, 255, 255));
		lblNum7.setBounds(416, 46, 57, 54);
		panel_LetsRoll.add(lblNum7);
		
		JButton btn_LetsRoll = new JButton("\u958B\u734E!");
		btn_LetsRoll.setForeground(Color.WHITE);
		btn_LetsRoll.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		btn_LetsRoll.setBorder(null);
		btn_LetsRoll.setBackground(new Color(0, 191, 255));
		btn_LetsRoll.setBounds(169, 113, 135, 54);
		panel_LetsRoll.add(btn_LetsRoll);
		
		
		JLabel label = new JLabel("\u6B61\u8FCE\u4F86\u5230\u5927\u6A02\u900F\u514C\u734E\u5668");
		label.setForeground(new Color(25, 25, 112));
		label.setBackground(Color.DARK_GRAY);
		label.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 34));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(92, 0, 632, 62);
		contentPane.add(label);
		
		JPanel panel_bet = new JPanel();
		panel_bet.setForeground(new Color(51, 102, 255));
		panel_bet.setBackground(new Color(51, 51, 102));
		panel_bet.setBounds(0, 66, 485, 178);
		contentPane.add(panel_bet);
		panel_bet.setLayout(null);
		
		JLabel label_1 = new JLabel("\u7B2C\u4E00\u865F");
		label_1.setBounds(14, 13, 55, 20);
		panel_bet.add(label_1);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		
		JButton btnRandom = new JButton("\u96FB\u8166\u9078\u865F");
		btnRandom.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		btnRandom.setForeground(new Color(255, 255, 255));
		btnRandom.setBorder(null);
		btnRandom.setBackground(new Color(0, 191, 255));
		btnRandom.setBounds(26, 120, 126, 45);
		panel_bet.add(btnRandom);
		
		JLabel label_2 = new JLabel("\u7B2C\u4E8C\u865F");
		label_2.setBounds(90, 13, 45, 20);
		panel_bet.add(label_2);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		
		JLabel label_3 = new JLabel("\u7B2C\u4E09\u865F");
		label_3.setBounds(156, 13, 45, 20);
		panel_bet.add(label_3);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		
		JLabel label_4 = new JLabel("\u7B2C\u56DB\u865F");
		label_4.setBounds(222, 13, 45, 20);
		panel_bet.add(label_4);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		
		JLabel label_5 = new JLabel("\u7B2C\u4E94\u865F");
		label_5.setBounds(288, 13, 45, 20);
		panel_bet.add(label_5);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		
		JLabel label_6 = new JLabel("\u7B2C\u516D\u865F");
		label_6.setBounds(354, 13, 45, 20);
		panel_bet.add(label_6);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		
		JLabel label_7 = new JLabel("\u7279\u5225\u865F");
		label_7.setBounds(420, 13, 45, 20);
		panel_bet.add(label_7);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(255, 105, 180));
		label_7.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		
		tbAutoNum1 = new JTextField();
		tbAutoNum1.setForeground(Color.DARK_GRAY);
		tbAutoNum1.setBackground(Color.WHITE);
		tbAutoNum1.setFont(new Font("Segoe UI Light", Font.BOLD, 27));
		tbAutoNum1.setHorizontalAlignment(SwingConstants.CENTER);
		tbAutoNum1.setBounds(14, 49, 55, 54);
		panel_bet.add(tbAutoNum1);
		tbAutoNum1.setColumns(10);
		
		tbAutoNum2 = new JTextField();
		tbAutoNum2.setForeground(Color.DARK_GRAY);
		tbAutoNum2.setBackground(Color.WHITE);
		tbAutoNum2.setFont(new Font("Segoe UI Light", Font.BOLD, 27));
		tbAutoNum2.setHorizontalAlignment(SwingConstants.CENTER);
		tbAutoNum2.setColumns(10);
		tbAutoNum2.setBounds(81, 49, 55, 54);
		panel_bet.add(tbAutoNum2);
		
		tbAutoNum3 = new JTextField();
		tbAutoNum3.setForeground(Color.DARK_GRAY);
		tbAutoNum3.setBackground(Color.WHITE);
		tbAutoNum3.setFont(new Font("Segoe UI Light", Font.BOLD, 27));
		tbAutoNum3.setHorizontalAlignment(SwingConstants.CENTER);
		tbAutoNum3.setColumns(10);
		tbAutoNum3.setBounds(148, 49, 55, 54);
		panel_bet.add(tbAutoNum3);
		
		tbAutoNum4 = new JTextField();
		tbAutoNum4.setForeground(Color.DARK_GRAY);
		tbAutoNum4.setBackground(Color.WHITE);
		tbAutoNum4.setFont(new Font("Segoe UI Light", Font.BOLD, 27));
		tbAutoNum4.setHorizontalAlignment(SwingConstants.CENTER);
		tbAutoNum4.setColumns(10);
		tbAutoNum4.setBounds(215, 49, 55, 54);
		panel_bet.add(tbAutoNum4);
		
		tbAutoNum5 = new JTextField();
		tbAutoNum5.setForeground(Color.DARK_GRAY);
		tbAutoNum5.setBackground(Color.WHITE);
		tbAutoNum5.setFont(new Font("Segoe UI Light", Font.BOLD, 27));
		tbAutoNum5.setHorizontalAlignment(SwingConstants.CENTER);
		tbAutoNum5.setColumns(10);
		tbAutoNum5.setBounds(282, 49, 55, 54);
		panel_bet.add(tbAutoNum5);
		
		tbAutoNum6 = new JTextField();
		tbAutoNum6.setForeground(Color.DARK_GRAY);
		tbAutoNum6.setBackground(Color.WHITE);
		tbAutoNum6.setFont(new Font("Segoe UI Light", Font.BOLD, 27));
		tbAutoNum6.setHorizontalAlignment(SwingConstants.CENTER);
		tbAutoNum6.setColumns(10);
		tbAutoNum6.setBounds(349, 49, 55, 54);
		panel_bet.add(tbAutoNum6);
		
		tbAutoNum7 = new JTextField();
		tbAutoNum7.setForeground(new Color(255, 105, 180));
		tbAutoNum7.setBackground(Color.WHITE);
		tbAutoNum7.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 27));
		tbAutoNum7.setHorizontalAlignment(SwingConstants.CENTER);
		tbAutoNum7.setColumns(10);
		tbAutoNum7.setBounds(416, 49, 55, 54);
		panel_bet.add(tbAutoNum7);
		
		JButton btnBet = new JButton("\u4E0B\u6CE8");
		btnBet.setForeground(Color.WHITE);
		btnBet.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		btnBet.setBorder(null);
		btnBet.setBackground(new Color(0, 191, 255));
		btnBet.setBounds(330, 120, 126, 45);
		panel_bet.add(btnBet);
		
		JButton btnClear = new JButton("\u6E05\u7A7A");
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		btnClear.setBorder(null);
		btnClear.setBackground(new Color(0, 191, 255));
		btnClear.setBounds(178, 120, 126, 45);
		panel_bet.add(btnClear);
		
		JPanel panel_banner = new JPanel();
		panel_banner.setBackground(new Color(233,100,99));
		panel_banner.setBounds(0, 0, 818, 62);
		contentPane.add(panel_banner);
		panel_banner.setLayout(null);
		
		
		JPanel panel_result = new JPanel();
		panel_result.setBackground(new Color(31,110,212));
		panel_result.setBounds(488, 66, 330, 356);
		contentPane.add(panel_result);
		panel_result.setLayout(null);
		
		JLabel label_15 = new JLabel("\u958B\u734E\u7D50\u679C");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setForeground(new Color(25, 25, 112));
		label_15.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 34));
		label_15.setBackground(Color.DARK_GRAY);
		label_15.setBounds(0, 0, 344, 53);
		panel_result.add(label_15);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("微軟正黑體", Font.PLAIN, 30));
		textPane.setBounds(14, 66, 302, 277);
		panel_result.add(textPane);
		

		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnRandom.setEnabled(true);
				tbAutoNum1.setText("");
				tbAutoNum2.setText("");
				tbAutoNum3.setText("");
				tbAutoNum4.setText("");
				tbAutoNum5.setText("");
				tbAutoNum6.setText("");
				tbAutoNum7.setText("");
				tbAutoNum1.setEditable(true);
				tbAutoNum2.setEditable(true);
				tbAutoNum3.setEditable(true);
				tbAutoNum4.setEditable(true);
				tbAutoNum5.setEditable(true);
				tbAutoNum6.setEditable(true);
				tbAutoNum7.setEditable(true);
			}
		});
		

		btnBet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {

					if(Integer.valueOf(tbAutoNum1.getText())>49 || 
							Integer.valueOf(tbAutoNum2.getText())>49|| 
							Integer.valueOf(tbAutoNum3.getText())>49||
							Integer.valueOf(tbAutoNum4.getText())>49||
							Integer.valueOf(tbAutoNum5.getText())>49||
							Integer.valueOf(tbAutoNum6.getText())>49||
							Integer.valueOf(tbAutoNum7.getText())>49)
					{
						JOptionPane.showMessageDialog(null, "號碼範圍必須為1~49");
					}
					else
					{
					btnRandom.setEnabled(false);
					tbAutoNum1.setEditable(false);
					tbAutoNum2.setEditable(false);
					tbAutoNum3.setEditable(false);
					tbAutoNum4.setEditable(false);
					tbAutoNum5.setEditable(false);
					tbAutoNum6.setEditable(false);
					tbAutoNum7.setEditable(false);
					}
				}catch(NumberFormatException evet){
					JOptionPane.showMessageDialog(null, "請輸入7個1~49號碼");
				}
			}
				
		});
		
		//==========電腦選號=================
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(i = 0; i<=6; i++) {
					auto_temp = (int) (Math.random()*49)+ 1;//產生1~49號碼先放入temp中
					while(j<i) {
						if(auto_nums[j]==auto_temp) {//判斷號碼是否重複
							auto_temp = (int) (Math.random()*49)+ 1;
							j=0;
						}else
						{
							j++;
						}
					}
				//確定沒重複的值再給nums[]陣列中
					auto_nums[i] = auto_temp;
					j=0;
				}
				tbAutoNum1.setText(""+auto_nums[0]);
				tbAutoNum2.setText(""+auto_nums[1]);
				tbAutoNum3.setText(""+auto_nums[2]);
				tbAutoNum4.setText(""+auto_nums[3]);
				tbAutoNum5.setText(""+auto_nums[4]);
				tbAutoNum6.setText(""+auto_nums[5]);
				tbAutoNum7.setText(""+auto_nums[6]);
			}
		});
		
		
		//===========開獎!==============

		btn_LetsRoll.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
			//產生號碼
				if(btnRandom.isEnabled()) {
					JOptionPane.showMessageDialog(null, "確定選定號碼後，請按下注鈕");
				}else
				{
					for(i = 0; i<=6; i++) {
						temp = (int) (Math.random()*49)+ 1;//產生1~49號碼先放入temp中
						while(j<i) {
							if(nums[j]==temp) {//判斷號碼是否重複
								temp = (int) (Math.random()*49)+ 1;
								j=0;
							}else
							{
								j++;
							}
						}
					//確定沒重複的值再給nums[]陣列中
						nums[i] = temp;
						j=0;
					}
				
					lblNum1.setText(""+nums[0]);
					lblNum2.setText(""+nums[1]);
					lblNum3.setText(""+nums[2]);
					lblNum4.setText(""+nums[3]);
					lblNum5.setText(""+nums[4]);
					lblNum6.setText(""+nums[5]);
					lblNum7.setText(""+nums[6]);

				//*************兌獎**************
					int counter=0;
					String str="";
					int i,j=0;
					for(i=0; i< nums.length-1; i++) {
						for(j=0; j<auto_nums.length-1; j++) {
							if(nums[i] == auto_nums[j]) {
								counter++;
								str += nums[i]+" ";
							}
						}
					}
				//**********判斷特別號是否中獎****************
					if(nums[6]==auto_nums[6]) {
						special_num = true;
					}
				
				//==========判斷中幾獎====================
					String str_result="";
					if (counter==6) {
						str_result = "恭喜你中了頭獎!";
						textPane.setText(str_result);
					} else if (counter==5 && special_num) {
						str_result = "恭喜!你中了貳獎!\n中獎號碼: "+str;
						textPane.setText(str_result);
					} else if (counter==5) {
						str_result = "恭喜!你中了參獎\n中獎號碼:"+str;
						textPane.setText(str_result);
					} else if (counter==4 && special_num) {
						str_result = "恭喜!你中了肆獎\n中獎號碼: "+str;
						textPane.setText(str_result);
					} else if (counter==4) {
						str_result ="恭喜!你中了 伍獎\n獎金NT$4,000\n中獎號碼: "+str;
						textPane.setText(str_result);
					} else if (counter==3 && special_num) {
						str_result = "恭喜!你中了陸獎\n獎金NT$1,000\n中獎號碼: "+str;
						textPane.setText(str_result);
					} else if (counter==3) {
						str_result ="恭喜!你中了普獎\n獎金NT$400\n中獎號碼: "+str;
						textPane.setText(str_result);
					} else if (counter==2 && special_num) {
						str_result ="恭喜!你中了柒獎\n獎金NT$400\n中獎號碼: "+str;
					} else {
						str_result ="沒中!請再接再厲!";
						textPane.setText(str_result);
					}
				}
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}//end of class Lottery

