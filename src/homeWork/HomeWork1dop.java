package homeWork;

import java.util.Arrays;

public class HomeWork1dop {
    public static void main(String[] args) {

        //Массивы

        //1
        System.out.println("Массивы. Задание 1");
        int n = 20;
        int[] chArr0 = new int[n/2];
        for (int i = 0; i < n/2 ; i++) {
            chArr0[i] = (i+1)*2;
        }
        int[] chArr1 = new int[n/2];
        for (int i = 0; i < n/2 ; i++) {
            chArr1[i] = chArr0[n/2-i-1];
        }
        System.out.println(Arrays.toString(chArr0));
        System.out.println(Arrays.toString(chArr1));

        //2
        System.out.println("Массивы. Задание 2");
        int[] randomArr1 = new int[15];
        int j1 = 0;
        for (int i = 0; i < randomArr1.length ; i++) {
            randomArr1[i] = (int) (Math.random() * 10);
            if (randomArr1[i] %2 == 0 && randomArr1[i] != 0) j1++;

        }
        System.out.println(Arrays.toString(randomArr1));
        System.out.println("количество четных чисел " + j1);

        //3
        System.out.println("Массивы. Задание 3");
        int[] randomArr2 = new int[4];
        j1 = 0;
        for (int i = 0; i < randomArr2.length ; i++) {
            randomArr2[i] = (int) (Math.random() * 90 +10);
            if (i > 0) {
                if (randomArr2[i] > randomArr2[i-1]) j1++;
            }
        }
        System.out.println(Arrays.toString(randomArr2));
        if (j1 == 3) System.out.println("Последовательность является строго возрастающей");

        //4
        System.out.println("Массивы. Задание 4");
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int[] randomArr3 = new int[11];
        for (int i = 0; i < randomArr3.length ; i++) {
            randomArr3[i] = (int) (Math.random() * 4 - 2);
            if (randomArr3[i] == -1) n1++;
            else  if (randomArr3[i] == 0) n2++;
            else n3++;
        }
        System.out.println(Arrays.toString(randomArr3));
        if (n1 > n2 && n1 > n3) System.out.println("Число -1 встречается чаще всего");
        else if (n2 > n1 && n2 > n3) System.out.println("Число 0 встречается чаще всего");
        else if (n3 > n1 && n3 > n2) System.out.println("Число 1 встречается чаще всего");

        //Многомерные массивы
        //1
        System.out.println("Многомерные массивы. Задание 1");
        int[][] doubArr1 = new int[5][8];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                doubArr1[i][j] = (int) (Math.random()*90 + 10);
            }
        }
        System.out.println(Arrays.deepToString(doubArr1));

        //2
        System.out.println("Многомерные массивы. Задание 2");
        int[][] doubArr2 = new int[7][4];
        int[] maxArr = new int[7];
        int x = 0;
        Arrays.fill(maxArr, 1);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                doubArr2[i][j] = (int) (Math.random()*11 - 5);
                maxArr[i] = maxArr[i] * doubArr2[i][j];
            }
            if (maxArr[i] < 0) maxArr[i] = maxArr[i] * -1;
            if (i > 0) {
                if( maxArr[i] > maxArr[x]) x = i;
            }
        }
        System.out.println(Arrays.deepToString(doubArr2));
        //System.out.println(Arrays.toString(maxArr));
        System.out.println("Первая найденная наибольшая по модулю произведения элементов строка " + (x+1));

        //3
        System.out.println("Многомерные массивы. Задание 3");
        int[][] doubArr3 = new int[6][7];
        int[][] maxArr2 = new int[6][2];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                doubArr3[i][j] = (int) (Math.random() * 10);
                if (j == 0) {
                    maxArr2[i][0] = doubArr3[i][j];
                    maxArr2[i][1] = j;
                }
                else {
                    if (doubArr3[i][j] > maxArr2[i][0]){
                        maxArr2[i][0] = doubArr3[i][j];
                        maxArr2[i][1] = j;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(doubArr3));
        //System.out.println(Arrays.deepToString(maxArr2));

        //int perv = 0;
        for (int i = 0; i < maxArr2.length; i++) {
            int perv =  doubArr3[i][0];
            doubArr3[i][0] = maxArr2[i][0];
            doubArr3[i][maxArr2[i][1]] = perv;
        }

        System.out.println(Arrays.deepToString(doubArr3));

    }
}
