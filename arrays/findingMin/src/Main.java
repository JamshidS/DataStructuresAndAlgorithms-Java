public class Main {
    public static void main(String[] args) {
        int[] arr = {5,9,3,15,1,2,-5};
        Find find = new Find();
       int min =  find.findMin(arr);
       System.out.println(min);
       System.out.println(find.findSecondMax(arr));
    }
}