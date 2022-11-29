public class Main {
    public static void main(String[] args) {
        String s = "too Hot to Hoot";
        s = s.replace(" ","");
        s=s.toLowerCase();
        char[] cs = s.toCharArray();

        int i=0,size=cs.length;
        while (i!=size){
            if(cs[i]!=cs[size-i-1]){
                System.out.println("Not palindrome");
                System.exit(0);
            }else{
                i++;
            }

        }
        System.out.println("Palindrome");


    }
}