import java.util.Locale;

public class Main {
    static void pangramString(String data){
        char[] str = data.replace(" ","").toUpperCase().toCharArray();
        int size = str.length;
        int[] newA = new int[26];
        int i=0;
        while (i!=size){
            int index = str[i]-65;
            newA[index] = 1;
            i++;
        }

        int j=0;
        while (j!=26){
            if(newA[j]==1){
                j++;
            }else{
                System.out.println("Non-Pangram..!");
                System.exit(0);
            }
        }
        System.out.println("Pangram String");

    }


    public static void main(String[] args) {
        String s = "The quick brown fox jumps over a lazy dog";
        String name = "Jamshd sadiqi";
        pangramString(name);
    }
}