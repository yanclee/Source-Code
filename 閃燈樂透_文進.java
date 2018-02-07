import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TestThread {

	public static void main(String[] args) {
		TestThread testThread = new TestThread();
		JFrame frame = new JFrame();
		
		MyPane mp = testThread.new MyPane();
		frame.add(mp, BorderLayout.CENTER);

		JButton btnFlash = new JButton("Flash");
		frame.add(btnFlash, BorderLayout.WEST);
		btnFlash.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.btnFlashClick();				
			}
		});
		
		
		JButton btnPick = new JButton("選號");
		frame.add(btnPick, BorderLayout.EAST);
		btnPick.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				mp.btnPickClick();				
			}
		});
		
		frame.pack();
		frame.setVisible(true);
		
		
		
	} // end main().

class MyPane extends JPanel{
	
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	public MyPane() {
		this.init();		
	} // end MyPane().
		
	private void init() {
		
		this.setLayout(new GridLayout(5, 10, 2, 2));
		
		for(int i=0; i<49; i++) {
			JButton btn = new JButton(String.valueOf(i));
			
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(btn.getText());					
				}
			});
			this.add(btn);
			buttons.add(btn);
		}
	} // end init().
	
	
	public void btnFlashClick() {
		Random rnd = new Random();
				
		new Thread() {
			public void run() {
				JButton btn = null;
				for(int i=0; i<10; i++) {	// 閃10次
					// do something
					int index = rnd.nextInt(49);		// 0 ~ 48
					btn = buttons.get(index);		// 隨機取1個button
					Color oriColor = btn.getBackground(); 	// 原本的背景色記錄起來
					btn.setBackground(Color.YELLOW);		// 改變背景色
					
					try {
						Thread.sleep(500);	// 停頓0.5秒, 這很慢, 可看到變化
					}catch (InterruptedException ex) {
						ex.printStackTrace();
					}
					btn.setBackground(oriColor);	// 恢復原本的背景色
				}
				
				// 上面只是效果
				btn.setBackground(Color.CYAN);	// 確定顏色後不再變回去了
				
			} // end run().
		}.start();		
	} // end btnFlashClick().
	
	
	public void btnPickClick() {
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
							Thread.sleep(100);	// 停頓0.1秒
						}catch (InterruptedException ex) {
							ex.printStackTrace();
						}
						btn.setBackground(oriColor);	// 恢復原本的背景色
					}
					
					// 上面只是效果
					if(btn.getBackground() != Color.CYAN) { // 沒選過的球
						btn.setBackground(Color.CYAN);	// 確定顏色後不再變回去了
						count++; // 記數器增加
					}else {  // 已背選過的球(背景已為Color.CYAN)
						// do nothing; 不作任何事, 下面的while()會迴圈選新號
					}
					
				}while(count < 6);  // 要選6個號碼
				
			} // end run().
		}.start();
		
	} // end btnPickClick().
	
	
} // end class MyPane
} // end class TestThread.