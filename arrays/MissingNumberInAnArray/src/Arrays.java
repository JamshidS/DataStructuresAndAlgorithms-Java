public class Arrays {

    public int finder(int[] arr,int size){

        int num = size+1;
        int sum = (num*(num+1))/2;
        for(int i = 0;i< arr.length;i++){
            sum = sum - arr[i];
        }
        return sum;
    }
}
