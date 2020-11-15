package InterviewProgrammes;


public class Prog9_WAP_to_Find_Factorial_Of_Num {

    public static void main(String[] args) {
            int num = 10;
            int factorial = 1;
            for(int i = 1;i<=num;i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of a number is : " + factorial );
    }

}
