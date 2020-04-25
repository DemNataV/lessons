package hwMap;

import java.util.HashMap;
import java.util.Map;

public  class FromTo {
   static HashMap<String, Customer> customerMap = new HashMap<>();


     static {

        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));
    }

    public static void customerFromTo(int from, int to) {

        Map<String, Customer> customerFT = new HashMap<String, Customer>();
        for (Map.Entry<String, Customer> entry : customerMap.entrySet()) {
            if (entry.getValue().getAge() >= from && entry.getValue().getAge() < to) {
                customerFT.put(entry.getKey(), entry.getValue());
            }

        }
        System.out.println(customerFT);
    }
}
