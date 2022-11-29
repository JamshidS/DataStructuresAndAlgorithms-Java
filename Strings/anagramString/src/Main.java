import java.util.Arrays;

public class Main {

    static void anagramChecker(String data,String data2){
        char[] cData1 = data.toLowerCase().replace(" ","").toCharArray();
        char[] cData2 = data2.toLowerCase().replace(" ","").toCharArray();
        Arrays.sort(cData1);
        Arrays.sort(cData2);
        boolean result = Arrays.equals(cData1,cData2);
        if(result){
            System.out.println("Anagram String");
        }else {
            System.out.println("Not Anagram String");
        }
    }

    public static void main(String[] args) {
        anagramChecker("listen","SiLenT");
    }
}