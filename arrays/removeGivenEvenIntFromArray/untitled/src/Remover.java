public class Remover {

    public int[] removeEven(int[] arr){
        int countOdd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                countOdd++;
            }
        }

        int[] result = new int[countOdd];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }
    public  void printArray(int[] newArr){
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
      }
}
