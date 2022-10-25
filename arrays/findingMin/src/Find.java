public class Find {
   //finds the minimum value of an array
    public int findMin(int[] arr){

        if(arr.length==0 || arr == null){
            throw  new IllegalArgumentException("Invalid Input");
        }

        int min = arr[0];
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }

        return min;
    }

    public int findSecondMax(int[] arr){

        if(arr.length==0 || arr == null){
            throw  new IllegalArgumentException("Invalid Input");
        }

        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);

        for(int i =0;i< arr.length;i++){
            if(sMax<arr[i] && arr[i]!=max){
                sMax=arr[i];
            }
        }


        return sMax;
    }




}
