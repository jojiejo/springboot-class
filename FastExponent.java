public class FastExponent {
    public static int pow(int number, int power) {
        if (power != 0) return (number * pow(number, power - 1));
        else return 1;
    }
     
    public static void main(String[] args)
    {
        System.out.println("2 ^ 3 = " + pow(2, 3));
        System.out.println("5 ^ 3 = " + pow(5, 3));
        System.out.println("10 ^ 2 = " + pow(10, 2));
        System.out.println("2 ^ 5 = " + pow(2, 5));
        System.out.println("7 ^ 3 = " + pow(7, 3));
    }
}
