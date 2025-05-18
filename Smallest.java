public class Smallest{
    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 36;
        int num3 = 43;

        int smallest = findSmallest(num1, num2, num3);

        System.out.println("The smallest number is: " + smallest);
    }

    public static int findSmallest(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}