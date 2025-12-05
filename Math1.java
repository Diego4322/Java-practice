class Calculator{

    //write functions for additions subtractions multiplication division
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b){
        return a / b;
    }
    // SAME METHOD NAME DIFF DATA TYPE => METHOD OVERRIDING aka POLYMORPHISM
    double divide(double a, double b){
        return a / b;
    }


    int modulo(int a, int b) {
        return a % b;
    }
}




public class Math1 {

    public static void main(String[] args){

        Calculator calc = new Calculator();

        //ADD
        System.out.println("addition: " + calc.add(10, 5));
        //POLYMORPHISM ADD
        System.out.println("addition with polymorphism:" + calc.add(10, 5));
        //SUBTRACT
        System.out.println("subtraction:" + calc.subtract(10, 5));
        //MULTIPLY
        System.out.println("multiplication: " + calc.multiply(10, 5));
        //DIVISION
        System.out.println("division: " + calc.divide(10, 5));
        //METHOD OVERRIDING: SAME METHOD NAME DIFF DATA TYPE
        //DIVISION POLYMORPHISM
        System.out.println("Division with polymorphism: " + calc.divide(10.6, 5.3));
        
        //MODULO
        System.out.println("Modulo: " + calc.modulo(10, 4));

    }
    
}
