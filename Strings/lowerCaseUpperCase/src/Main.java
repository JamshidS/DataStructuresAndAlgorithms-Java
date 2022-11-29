public class Main {

    static char[] toUpperCase(String data){
        char[] charName = data.toCharArray();
        int i=0,size=charName.length;
        while (i!=size){// converting to upperCase
            if(charName[i]!=' '){
                charName[i] = (char)(charName[i]-32);
            }
            i++;
        }
        return charName;
    }
    static char[] toLowerCase(String data){
        char[] charName = data.toCharArray();
        int i=0,size=charName.length;
        int j =0;
        while (j!=size){
            if(charName[j]!=' ') {
                charName[j] = (char) (charName[j] + 32);
            }
            j++;
        }
        return charName;
    }

    static char[] convertFirstCharOfEachWordToUpper(String data){
        char[] str = data.toCharArray();
        int i =1,size = str.length;
        str[0] = (char) (str[0]-32);
        while (i!=size){
            if(str[i]==' '){
                str[i+1] = (char) (str[i+1]-32);
            }
            i++;
        }
        return str;
    }


    public static void main(String[] args) {
        String name = "your string here";

    }
}