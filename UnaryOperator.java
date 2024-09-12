public class UnaryOperator {
    public static void main(String[] args) {
        int x = 10;

        System.out.println(++x) ;
        //Pre-Increment
        System.out.println(x++) ;

        int y = 10;
        //Pre-Decrement
        System.out.println(--y) ;
        //Post-Decrement
        System.out.println(y--) ;

        // Logical NOT
        boolean isTrue = true;
        System.out.println(!isTrue) ;

    }
}
