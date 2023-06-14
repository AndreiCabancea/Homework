package Homework;

public class HomeWork {
    public static void main(String[] args) {

        char a = '%';
        char b = 32000;
        char c = '\u00D1';


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println((int) a);


//       System.out.println(a);
//       System.out.println(b);
//       System.out.println((int) a);
//       System.out.println(c);
//       System.out.println((int) c);



        char test1 = '9';
        int r = test1;
        System.out.println(r);



        char  test2 = '0';
        String t = String.valueOf(test2);
        System.out.println(t+1);
        int LL = Integer.parseInt(t);
        System.out.println(LL + 0);

        char test3 = '9';
        int y = Character.getNumericValue(test3);
        System.out.println(y + 0);




















    }


}
