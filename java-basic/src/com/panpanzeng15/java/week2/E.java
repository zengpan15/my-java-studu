enum Season{
    春季,夏季,秋季,冬季
}

public class E {
    public static void main(String[] args) {
        int x = 96,y =1;
        Season season =Season.春季;
        String str = new String("Java语言");
        switch(x+y){
            case 1:
                System.out.println(x+y);
                break;
            case 10:
                System.out.println(x+y);
                break;
            default:System.out .println("没有般配的"+(x+y));

        }
        switch (season){
            case 冬季:
                System.out.println("longdonglayue");
            case 春季:
                System.out.println("chuntianzhongxiazhongzi");
            case 秋季:
                System.out.println("qiutianshouhuoguoshi ");
                break;

            }
            switch(str){
                case"java语言":
                    System.out.println("xuexijiavayuyan");
                case "c语言":
                    System.out.println("zuihaoxuexiguocyuyan ");
                    break;

            }

    }
}
