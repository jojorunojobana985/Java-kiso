public class Flg{
    public static void main(String[] args){
        int val = 7;
        boolean flg = true;  //JavaSilverの問題では、""bool""になっていたので””boolean””に変更
        if(flg == true){
            do{
                System.out.println(val);
            }while(val > 10);
        }

    }
}