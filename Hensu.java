public class Hensu{
    public static void main(String[]args){
        int itIndustryWage = 800;           //エンジニアの年収
        long itIndustryScale = 18000000;    //業界の市場規模
        char favoriteWord ='志';            //好きな言葉
        String occupation = "プログラマー";  //なりたい職業
        boolean i = true;                   //働いているか

        System.out.println("エンジニアの給料は"+itIndustryWage+"万で市場規模は"+itIndustryScale+"です。");
        System.out.println("好きな言葉は"+favoriteWord+"、なりたい職業は"+occupation+"です。");
        
        if(i=true){
            System.out.println("働いてまっせ！！！！");
        }else{
            System.out.println("無職でっせ！！！１");
        }
    }

}
