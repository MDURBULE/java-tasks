import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator{
    Calculator(){
        System.out.println("*******Rules*********");
        System.out.println("Please giving one Space after number and operator : ");
        System.out.println("Ex. 3 + 4 ");
        System.out.println("Ex. 4 - 3 ");
        System.out.println("Ex. 3 * 4 ");
        System.out.println("Ex. 4 / 3 ");
        System.out.println();
    }
    public  float add(float a,float b){
        return (a+b);
    }
    public float sub(float a,float b){
        return a-b;
    }
    public float mul(float a,float b){
        return a*b;
    }
    public float div(float a,float b) throws ArithmeticException{
        return a/b;
    }
    public boolean check(char ch){
        boolean flag = false;
        char [] chars = {'+','-','*','/'};
        for(int i=0;i<chars.length;i++){
            if(ch==chars[i]){
                flag = true;
            }
        }
        return flag;

    }


}
public class calculator1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator cal = new Calculator();
        char ch= '+';


            while (true) {
                System.out.print("use the calci : ");
                float n=0;
                float m =0;

                try {
                    n = scan.nextFloat();
                    ch = scan.next().charAt(0);
                    m = scan.nextFloat();
                } catch (InputMismatchException e) {
                    System.out.println();
                    System.out.println("Please give the proper input : ");
                    continue;

                }

                catch (Exception e){
                    System.out.println("please enter a proper input : ");
                }


                if (cal.check(ch)) {
                    switch (ch) {
                        case '+': {
                            System.out.println(cal.add(n, m));
                            break;
                        }
                        case '-': {
                            System.out.println(cal.sub(n, m));
                            break;
                        }
                        case '*': {
                            System.out.println(cal.mul(n, m));
                            break;
                        }
                        case '/': {
                            try {
                                System.out.println(cal.div(n, m));
                                break;
                            } catch (ArithmeticException e1) {
                                System.out.println("divide by zero is not possible ");
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println();
                    System.out.println("Please select a proper operation : ");
                    break;
                }
            }


    }
}
