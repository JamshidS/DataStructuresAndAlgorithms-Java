public class Main {
    public static void main(String[] args) {
        Remover remover = new Remover();
        int[] arr = new int[]{2, 5, 1, 4, 6, 8, 7};
        int[] newArr = remover.removeEven(arr);
        remover.printArray(newArr);

    }
}