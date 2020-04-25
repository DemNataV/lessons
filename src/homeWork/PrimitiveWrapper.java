package homeWork;

public class PrimitiveWrapper {
    public static void main(String[] args) {

        int count = 267;
        //Integer age = new Integer(200);
       Integer age = 200;

       Integer num = count;

       double price;
       Double someDouble = 45.32;
       price = someDouble;

       Integer a =23;
       Byte b = 12;

      // a = (Integer) b;
        sgr(5);

        double[] doubles = {3, 6.78, -34.8};
       // printDoubleArr(doubles); //автоупаковка не работает с массивами

        System.out.println(Byte.parseByte("2")); //byte
        System.out.println(Byte.valueOf("2")); //Byte

        //System.out.println(Integer.parseInt("2 llkjj"));

        Integer x = 1;
        Integer y = 1;
        Integer z = 200;
        Integer p = 200;
        System.out.println(x.compareTo(y));
        System.out.println(x.equals(y));
        System.out.println(Integer.compare(x, y));

        System.out.println(x == y);//ссылка на один объект
        System.out.println(z == p);//вне диапазоне кеша

        System.out.println(z.compareTo(p));
        System.out.println(z.equals(p));
        System.out.println(Integer.compare(z, p));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.TYPE);






    }

    private  static  void sgr(Integer num){
        System.out.println(num*num);
    }

    private static void printDoubleArr(Double[] doubles) {
        for (Double d: doubles) { System.out.print(" " + d); } }
}
