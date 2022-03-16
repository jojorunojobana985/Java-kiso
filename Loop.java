public class Loop{  
    public static void main(String arga[]){
        int i = 0;
        while(i<8){
            if(6<i){
                break;
            }
            System.out.println("iの値は"+i+"です。"); //iの値の状態を出力
            System.out.println(i+("は8以下です。"));  //iの値が8以下であることを出力
            i++;
        }    
    }
}