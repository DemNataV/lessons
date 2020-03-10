package homeWork;

import java.util.Scanner;

public class Hw10 {
    public static void main(String[] args) {

        //10
        //пока не работает
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        String res = "1";
        String resv = new String();
        for (int i = 2; i <= num ; i++) {
            for (int j = 0; j <= i ; j++) {
                resv = res;
                int vsp = 0;
                for (int k = 0; k < resv.length() ; k++) {
                    char[] chArray1 = resv.toCharArray();
                    char[] chArray2 = res.toCharArray();
                    int x1 = Character.getNumericValue(chArray1[resv.length()-k-1]);
                    int x2 = Character.getNumericValue(chArray2[res.length()-k-1]);

                    /*char ch1 = resv.charAt(resv.length()-k);
                    char ch2 = res.charAt(res.length()-k);
                    int x1 = Character.getNumericValue(ch1);
                    int x2 = Character.getNumericValue(ch2);*/

                    int x = (x1 + x2 +vsp) % 10;
                    vsp = (x1 + x2 + vsp) / 10;
                    chArray2[res.length()-k-1] = Integer.toString(x).toCharArray()[0];

                    res = new String(chArray2);


                }
                int perv = Integer.parseInt(res.substring(0, res.length() - resv.length()+1)) + vsp;
                res = perv + res.substring(res.length() - resv.length()+1, res.length()+1);


            }

        }

        System.out.println(res);
    }
}
