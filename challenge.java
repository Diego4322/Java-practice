public class challenge{
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++) {
    if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("foobar");
    } else if (i % 3 == 0) {
        System.out.println("foo");
    } else if (i % 5 == 0) {
        System.out.println("bar");
    } else {
        System.out.println(i);
    }
}

    }
}
// Foobar
        // count from 1 to 100
        // if i % 3 print "foo"
        // if i is divisble by 5 print "bar"
        // if both divisble by 3 and 5 print "foobar"