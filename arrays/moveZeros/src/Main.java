public class Main {

    public static void main(String[] args) {
        int[] arr = {1,0,3,0,5,6,0,10,9,2};
        Mover mover = new Mover();
        mover.arrPrint(arr);
        System.out.println();
        mover.moveZeroes(arr,arr.length);
        mover.arrPrint(arr);

    }
}