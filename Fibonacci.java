public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fi(45));
    }
    static int fi (int i){
        if (i <=1)
            return i;
        else
            return fi(i-1)+fi(i-2);
    }
}
