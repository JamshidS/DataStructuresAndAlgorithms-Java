public class Main {

    static void counter(String data){
        data = data.toLowerCase();
        char[] cs = data.toCharArray();
        //cs[0] = (char) (cs[0]-32);
        int i=0,size=cs.length,vowel=0,consonant=0,specChar=0;
        while (i!=size){
            if(cs[i]>='a'&&cs[i]<='z'){
                if (cs[i]=='a'||cs[i]=='e'||cs[i]=='o'||cs[i]=='u'||cs[i]=='i'){
                    vowel++;
                }else {
                    consonant++;
                }
            }else {
                specChar++;
            }
            i++;
        }
        System.out.println(cs);
        System.out.println("Vowels:"+vowel);
        System.out.println("Consonants:"+consonant);
        System.out.println("Special Characters:"+specChar);

    }
    public static void main(String[] args) {
        String data = "Some@//Strings..";
        counter(data);

    }
}