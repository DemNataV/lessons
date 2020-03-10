package homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {


            //1
        System.out.println("Задание 1");
            int n = 228;
            int m = 456;
            int res = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && m % i == 0) res = i;
            }
            System.out.println(res);



            //2
        System.out.println("Задание 2");
            int[] someArr = {3, 4, 12, -5, -23, 16, 5, 3, 16, -9};
            for (int i = 0; i < someArr.length; i++) {
                for (int j = i + 1; j < someArr.length; j++) {
                    if (someArr[i] + someArr[j] == 7)
                        System.out.println("элемент " + i + "й " + someArr[i] + " и " + "элемент " + j + "й " + someArr[j] + "=7");
                }
            }


        //3
        System.out.println("Задание 3");
        int min = someArr[0];
        int max = someArr[0];
        double sum = someArr[0];

        for (int i = 1; i < someArr.length; i++) {
            if (someArr[i] < min) min = someArr[i];
            if (someArr[i] > max) max = someArr[i];
            sum = sum + someArr[i];
        }
        System.out.println("минимальное - "+min+" максимальное - "+max+" среднее - "+sum/someArr.length);

        //4
        System.out.println("Задание 4");
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Введите целое число больше 3х");
            int n1 = in.nextInt();
            if (n1 > 3) {
                int[] randomArr = new int[n1];
                int[] randomArrChV = new int[n1];

                int j = 0;
                for (int i = 0; i < randomArr.length ; i++) {
                    randomArr[i] = (int) (Math.random() * (n+1));
                    if (randomArr[i] %2 == 0 && randomArr[i] != 0) {
                        randomArrChV[j] = randomArr[i];
                        j++;
                    }
                }
                System.out.println(Arrays.toString(randomArr));
                int[] randomArrCh = new int[j];
                System.arraycopy(randomArrChV, 0, randomArrCh, 0, j);
                System.out.println(Arrays.toString(randomArrCh));
                break;
            }
        }


        //5
        System.out.println("Задание 5");
        int[][] doubArr = new int[5][8];
        int maxi = -100;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                doubArr[i][j] = (int) (Math.random()*199 - 100);
                if (doubArr[i][j] > maxi) maxi = doubArr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(doubArr));
        System.out.println(maxi);



    }
}
