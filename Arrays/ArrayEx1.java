public class ArrayEx1 {
    public static void main(String args[]) {
        //int[] primeNum = new long[20];
        //int even=new int[5];
        int[] score = new int[9];
        score[0] = 2;
        score[1] = 3;
        int[] score2 = score;
        System.out.println(score2[0]);
        score2[0] = 5;
        System.out.println(score[0]);
        
        

        


    }

}