public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("До замены: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("После замены: a = " + a + ", b = " + b);
    }
}
