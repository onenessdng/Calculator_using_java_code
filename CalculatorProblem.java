import java.util.*;
public class CalculatorProblem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the operator");
        char ch=in.next().trim().charAt(0);
        int ans=0;
        while(true)
        {
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%')
            {
                System.out.print("Enter the two numbers");
                int num1=in.nextInt();
                int num2=in.nextInt();
                if(ch=='+'){
                    ans=num1+num2;
                }
                if(ch=='-'){
                    ans=num1-num2;
                }
                  if(ch=='*'){
                    ans=num1*num2;
                }
                  if(ch=='/'){
                    if(num2!=0)
                    ans=num1/num2;
                }
                  if(ch=='%'){
                    ans=num1%num2;
                }
                System.out.println(ans);

            }
            else 
            {
            System.out.println("invalid choice");
            break;
             }
        }
    }

}
