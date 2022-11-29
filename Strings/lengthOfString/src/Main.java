public class Main {
    public static void main(String[] args) {
        String str = "Some strings";
        str = str.concat("\0");
        char[] strChar = str.toCharArray();
        int i=0;
        int count=0;
        while (strChar[i]!='\0'){
            count++;
            i++;
        }
        System.out.println(count);
    }
}