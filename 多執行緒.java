main(){


}
public void actionPerformed(){
	new Thread(){
	     public void  run(){
	
	for(int i=0;i<10;i++{
		System.out.println(名稱 i);
		try{
		Thread.sleep(500);
		}catch(InterruptedException e){
			e.printStackTrace();
			}
		}
	   }
	}.start();

}
	
new Thread(){
	public void  run(){
		for(int i=0;i<10;i++{
		System.out.println(名稱 i);
		try{
		Thread.sleep(500);
		}catch(InterruptedException e){
			e.printStackTrace();
			}
		}
	}
}.start();