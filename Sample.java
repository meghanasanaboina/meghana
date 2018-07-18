public class Sample {
    public static void main(String[] args) {
        int[] integer = {1,2,3,2,1};
        int length = integer.length;
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length; j++) {
                if (j == i || j == (length- 1 - i)) {
                    System.out.print(integer[j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
