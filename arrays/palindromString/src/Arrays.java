public class Arrays {

    public boolean isPalindrome(String word){
        char[] chars = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while (start<end){
            if(chars[start]!=chars[end]){
                return false;
            }
            end--;
            start++;
        }
        return true;
    }

}
