package hwMap;

import java.util.*;

public class Text implements Comparator<Integer> {
    static String text;
    static { text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
            "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
            "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
            "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
            "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
            " sometimes on purpose injected humour and the like";}

    public static void word(String word){
        int n = 0;
        for (int i = 0; i < text.length() - word.length(); i++) {
            if (text.substring(i,i+word.length()).equals(word)) n++;
        }
        System.out.println("Слово " + word + " встречается " + n + " раз");
    }

    public static void groupCount(){
        String[] subStr;
        subStr = text.split(" ");

        Map<Integer, ArrayList<String>> counter = new HashMap<>();


        for(int i = 0; i < subStr.length; i++) {
            if(counter.containsKey(subStr[i].length())) {
                counter.get(subStr[i].length()).add(subStr[i]);
            } else {
                ArrayList<String> al = new ArrayList<String>();
                al.add(subStr[i]);
                counter.put(subStr[i].length(), al);
            }
           // System.out.println(subStr[i]);
        }
        System.out.println(counter);
    }

    public static void groupWord(){
        String[] subStr;
        text = text.toLowerCase();
        subStr = text.split(" ");

        Map<String, Integer> counter1 = new HashMap<>();


        for(int i = 0; i < subStr.length; i++) {
            if(!counter1.containsKey(subStr[i])) {
                counter1.put(subStr[i], 1);
            } else {

                counter1.put(subStr[i], counter1.get(subStr[i])+1);
            }
            // System.out.println(subStr[i]);
        }
        System.out.println(counter1);


        Map<String, Integer> counter = new HashMap<>();
        counter1.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
               .forEach(System.out::println);


    }

    public static void groupLetters(){
        String str = text.replaceAll(" ", "");
        str = str.toLowerCase();
        char[] chArray = str.toCharArray();

        Map<Character, Integer> counter1 = new HashMap<>();


        for(int i = 0; i < chArray.length; i++) {
            if(!counter1.containsKey(chArray[i])) {
                counter1.put(chArray[i], 1);
            } else {

                counter1.put(chArray[i], counter1.get(chArray[i])+1);
            }
            // System.out.println(subStr[i]);
        }
        //System.out.println(counter1);

        Map<Character, Double> counter = new TreeMap<>();
        for (Map.Entry<Character, Integer> count: counter1.entrySet()) {
            double key = (((double) count.getValue()*100)/chArray.length);
            counter.put(count.getKey(), key);
        }
        System.out.println(counter);
        //System.out.println(chArray.length);
    }




    @Override
    public int compare(Integer x, Integer y) {
        return Integer.compare(x, y);
    }
}

