public class Third {
    public static void main(String[] args) {
        int[] arr = {12, 21, 3, 2, 5, 16, 15, 25, 6, 4, 33};
        for (int j : arr) {
            if (j % 3 == 0)
                System.out.println(j);
        }
    }
}
