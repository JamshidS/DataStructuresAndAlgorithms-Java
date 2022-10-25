public class Main {
    public static void main(String[] args) {
        int[] arr = {2,5,6,3};
        Arrays a  = new Arrays();
        int[] newArr =   a.resizeArray(arr,arr.length*2);
        a.printArr(newArr,newArr.length);
    }
}