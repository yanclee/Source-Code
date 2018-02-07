狀況1:form1是父視窗傳給子視窗form2

在form2寫:
public string a;				//資料型態可改
在form1寫:
form2 f2 = new form2();			//建立form2子視窗
f2.a = combobox.SelectedValue; 	//把combobox的值傳給f2的a	
//selectvalue是傳你選的那項的值 selecttext是你選擇的文字那項的文字內容
或者用建構子
form2 f2 = new form2(combobox.SelectedValue)

狀況2:form1是子視窗要傳到父視窗form2

在form1寫:
public form2 f2;			//存f2地址用
在form2寫:
public string a;
form1 f1 = new form1();		//建立form1子視窗
f1.f2 = this;				//將自己的地址傳給f1
然後form1就可以用f2來傳值了
在form1寫 f2.a = combobox.SelectedValue;

狀況3:兩個視窗不相關

1.用資料庫 
2.如果都是A視窗開的就把form1資料傳到A視窗再給form2 
3.在父視窗、form1、form2都建同一個class a，父視窗把class a的地址給form1 form2，把class a 當暫存用