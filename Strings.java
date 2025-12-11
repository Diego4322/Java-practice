public class Strings {
    public static void main(String[] args){

        String nameObj = new String("Didi");

        //0 1 2 3
        // D i d i


        String name1 = "Didi";
        String name2 = "Gogo";
        String name3 = "Gogo";

        //first line will be false
        System.out.println("name1 and nameObj: " + (name1 == nameObj));
        System.out.println("name1 and nameObj: " + name1.equals(nameObj));
        System.out.println("name1.equals(name2): " + name1.equals(name2));
        System.out.println("name2 and name3: " + (name2 == name3));



        //compareto
        System.out.println("Compare: " + name1.compareTo(name2));


        //HELPFUL BUILT IN METHODS
        System.out.println("# of chars in string: " + name1.length());
        System.out.println("Index select: " + name1.indexOf("o")); //experiment with this
        System.out.println("Character select: " + name1.charAt(2));

        String quote = "Talk is cheap, show me the code.";
        String result1 = quote.substring(15);
        String result2 = quote.substring(5,13);

        System.out.println("Full quote: " + quote);
        System.out.println("Substring 1: " + result1);
        System.out.println("Substring 2: " + result2);


        // toUpper case, toLowerCase, contains, replace are other built in functions


    }
}
