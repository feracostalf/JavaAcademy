package challenges.lambdalive;

public class Calculator {
    
    public static void main(String[] args) {
        int num1=3;
        int num2=30;

        Operational addOp = ((a, b)-> a+b);
        Operational subOp = ((a, b)-> a-b);
        ResulType oddType=((a)-> {
            if(a%2==0) return true;
            return false;
        });
        ResulType primeType=((a)-> {
            if (a == 0 || a == 1 || a == 4) {
                return false;
              }
              for (int x = 2; x < a / 2; x++) {
                if (a % x == 0)
                  return false;
              }
              return true;
        });
        Factorial fact=((a)->{
            if (a < 0) a = a * -1;
		    if (a <= 0) return 1;
		    int factorial = 1;
		    while (a > 1) {
			    factorial = factorial * a;
			    a--;
            }
		    return factorial;
        });
        
        System.out.println(AddElements(addOp, num1, num2));
        System.out.println(AddElements(subOp, num1, num2));
        System.out.println(isOdd(oddType,num1));
        System.out.println(isPrime(primeType,num1));
        System.out.println(calcFactorial(fact,num1));

    }

    public static int AddElements(Operational op , int num1, int num2){
        return op.Operation(num1, num2);
    }

    public static boolean isOdd(ResulType rt , int num1){
        return rt.Result(num1);
    }

    public static boolean isPrime(ResulType rt , int num1){
        return rt.Result(num1);
    }

    public static int calcFactorial(Factorial ft , int num1){
        return ft.getFactorial(num1);
    }
}

interface Operational{
    int Operation(int a, int b);
}
interface ResulType{
    boolean Result(int a);
}
interface Factorial{
    int getFactorial(int a);
}
