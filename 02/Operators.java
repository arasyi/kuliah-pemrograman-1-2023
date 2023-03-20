public class Operators {
    public static void main(String[] args) {
        int a = 11;
        int b = 3;

        // basic operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        int p, q, r, s, t;
        p = q = r = s = t = 0;

        // post increment
        System.out.println("p = " + p);
        System.out.println("p++ = " + p++);
        System.out.println("p = " + p);

        // pre increment
        System.out.println("q = " + q);
        System.out.println("++q = " + ++q);
        System.out.println("q = " + q);

        // post decrement
        System.out.println("r = " + r);
        System.out.println("r-- = " + r--);
        System.out.println("r = " + r);

        // pre decrement
        System.out.println("s = " + s);
        System.out.println("--s = " + --s);
        System.out.println("s = " + s);

        // recommended usage for increment/decrement operators
        System.out.println("t = " + t);
        t++;
        System.out.println("after increment, t = " + t);
        t--;
        System.out.println("after decrement, t = " + t);

    }    
}
