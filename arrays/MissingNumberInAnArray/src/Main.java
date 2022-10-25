public class Main {
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        int[] arr = {1,2,3,4,6,7,8};
        int result = arrays.finder(arr, arr.length);
        System.out.println("The missing number is: "+ result);

    }
}