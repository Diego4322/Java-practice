//Java is a STRONGLY TYPED language; you have to DEFINE/DECLARE a variable
//you have to declare its data type

class DataTypeExamples{
    int myInt = 42;
    double myDouble = 189.75; //twice as much as the integer
    char myChar = 'Q';
    boolean myBool = false;





}
public class DataTypes {
    
    public static void main(String[] args) { //tester class
    DataTypeExamples dt = new DataTypeExamples();

    System.out.println("myInt: " + dt.myInt);
    System.out.println("myInt: " + dt.myDouble);
    System.out.println("myInt: " + dt.myChar);
    System.out.println("myInt: " + dt.myBool);
    }
}