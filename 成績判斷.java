import javax.swing.JOptionPane;
public class hw01 {

/*	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				}System.out.println();//內循環執行一遍就換行
			}
	}*/
	public static void main(String[] args) {
		int gradeValue;
		String grade;
		String input = JOptionPane.showInputDialog(
				"請輸入成績:  ");
		gradeValue = Integer.parseInt( input );
		
		/*
		if(gradeValue>=90 && gradeValue<=100)
			JOptionPane.showMessageDialog(
			         null, "您的成績是A");		
		if(gradeValue>=80 && gradeValue<=89) 
			JOptionPane.showMessageDialog(
			         null, "您的成績是B");
		if(gradeValue>=70 && gradeValue<=79)
				JOptionPane.showMessageDialog(
						null, "您的成績是C");
		if(gradeValue>=60 && gradeValue<=69)
				JOptionPane.showMessageDialog(
						null, "您的成績是D");
		if(gradeValue>=0 && gradeValue<60)	
			JOptionPane.showMessageDialog(
				null, "您的成績是E");
		else
			JOptionPane.showMessageDialog(
				null,"您輸入錯誤,請重新輸入");*/
				
	      switch((int)((double)gradeValue / 10)) {
	      	case 10:
	            JOptionPane.showMessageDialog( null, "您的成績是A" );
	      		break;
	      	case 9:
	            JOptionPane.showMessageDialog( null, "您的成績是A" );
	      		break;
	      	case 8:
	            JOptionPane.showMessageDialog( null, "您的成績是B" );
	      		break;
	      	case 7:
	            JOptionPane.showMessageDialog( null, "您的成績是C" );
	      		break;
	      	case 6:
	            JOptionPane.showMessageDialog( null, "您的成績是D" );
	      		break;
	      	case 5:
	            JOptionPane.showMessageDialog( null, "您的成績是E" );
	      		break;
	      	case 4:
	            JOptionPane.showMessageDialog( null, "您的成績是E" );
	      		break;
	      	case 3:
	            JOptionPane.showMessageDialog( null, "您的成績是E" );
	      		break;
	      	case 2:
	            JOptionPane.showMessageDialog( null, "您的成績是E" );
	      		break;
	      	case 1:
	            JOptionPane.showMessageDialog( null, "您的成績是E" );
	      		break;
	      	case 0:
	            JOptionPane.showMessageDialog( null, "您的成績是E" );
	      		break;
	      	default:
	      		JOptionPane.showMessageDialog( null, "您輸入錯誤,請重新輸入" );
	      		
	      }
	}
}