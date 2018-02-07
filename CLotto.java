package tw.org.iii.helloapp;

/**
 * Created by jack on 2018/2/3.
 */

public class CLotto {
/*電腦選號:從1~49,取出六個號碼不相同的數字來
  電腦對獎:
  電腦選號流程拆解:
  因為二,所以要宣告int count
  因為一,所以要宣告int temp
  因為要六組,所以要宣告陣列numbers
  一,隨機抽出一個號碼100*Math.random()
  二,紀錄號碼numbers[count]=int temp
  三,若不重複則繼續抽出下一個號碼count++
  四,抽完六個號碼,就不抽了while (count<6){
  五,將六個號碼印出來printf

  號碼不重複


  號碼由小排到大
 */
    public String GetNumber() {//宣告GetNumber方法
        int count = 0;//記錄取了第幾組數字
        int[] numbers = new int[6];//宣告陣列儲存六個號碼
        while (count < 6) {//當取出來的數不足6時,就從亂數中取出一個
            double d = 100 * Math.random();//Math.random()是從0~1取出一個亂數(浮點數)
            //我們要的是整數所以乘以100,存入d中
            int temp = (int) d;      //把浮點數取整數出來
            if (temp >= 1 && temp <= 49) {//判斷隨機抽出來的號碼temp是否在1~49間
                if(!Is亂數被取號過(temp,numbers)) {//不重複才加入陣列,將temp交由最底下的方法判斷
                            //如果temp在numbers中
                                                //判斷號碼是否已存在,我們要的是不重複才存入,
                                               //所以要加!IsNumberExist
                numbers[count] = temp;//上面temp判斷號碼不重複,則加入陣列中
                count++;
                }
            }
        }
        //號碼由小排到大,為何是雙迴圈????? 氣泡排序法
        // https://home.gamer.com.tw/creationDetail.php?sn=3389305
        for(int i=0;i<numbers.length-1;i++) {//一共六個號碼,要讓最小的在最左邊,內圈需要跑五次,
            for (int j = 0; j < numbers.length-1; j++) {//內圈跑完一輪,0~5,最大的數跑道最右邊
                if (numbers[j + 1] < numbers[j]) {//假如後面小於前面
                    int temp = numbers[j+1];//先把小的存在temp裡
                    numbers[j+1]=numbers[j];//把大的放右邊
                    numbers[j]=temp;//小的放左邊
                }
            }
        }
        String s="";//宣告回傳的字串
        for (int i: numbers)//foreach 陣列 []numbers
        {
            s+=String.valueOf(i)+" ";//將陣列裡的整數,valueOf轉換為String
        }
        return s;//回傳s字串
    }
    //號碼不重複的方法(將隨機數temp跟陣列裡的號碼做比較)
    private boolean Is亂數被取號過(int p, int[] numbers) {//Alt+Enter系統生出此方法
        for (int i :numbers) {//用foreach迴圈將陣列裡已儲存的號碼i,一一叫出來跟p做比較
            if ((p==i))//如果p==i表示號碼存在,則回傳true
                return true;//有重複則回傳true
        }
        return false;//沒有重複則回傳false
    }
}
