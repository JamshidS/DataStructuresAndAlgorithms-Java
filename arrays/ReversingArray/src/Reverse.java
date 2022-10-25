public class Reverse {

    public void reverse(int[] numbers,int start,int end){

        while (start<end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;

        }

    }

    public void printArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
