public class RaizQuadrada {
    public static void main(String[] args) {
        int x = 8;
        System.out.println("A raiz quadrada de: "+ x + " é: "+ mySqrt(x));
    }
    public static int mySqrt(int x) {
        return x <= 0 ? x = 0:(int) Math.sqrt(x);
    }
}
