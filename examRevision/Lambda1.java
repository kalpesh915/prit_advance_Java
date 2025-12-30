interface Maths{
    public int product(int i, int j);
}

public class Lambda1 {
    public static void main(String[] args) {
        Maths maths = (x, y) -> x * y;
        
        System.out.println(maths.product(10, 2));
    }
}
