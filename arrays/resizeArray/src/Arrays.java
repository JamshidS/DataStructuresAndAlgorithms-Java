public class Arrays {
    public int[] resizeArray(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        return temp;
    }

    public void printArr(int[] arr, int size){
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
