public class Main {
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        int[] nums = {2,11,5,10,7,8};
        reverse.printArray(nums);
        reverse.reverse(nums,0,nums.length-1);
        System.out.println();
        reverse.printArray(nums);
    }
}