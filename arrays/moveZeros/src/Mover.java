public class Mover {
    public void moveZeroes(int[] arr, int n){
        int j =0; //it holds the zero values
        for(int i=0;i<n;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }

    }

    public void arrPrint(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ ",");
        }
    }
}
