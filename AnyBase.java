public class AnyBase {
    
        public static int NumberInput(int number1,int number2){
            int c=0,ans=0,p=1;
           while (number1>0 || number2>0|| c>0) {
               int  n1=number1%10;
               int  n2=number2%10;
              number1=number1/10;
              number2=number2/10;
              int sum=n2+n1+c;
              
              c=sum/8;
              ans=ans+(sum%8)*p;
              p=p*10;

            }
            return ans;
           
        }
      
    
    public static void main(String[] args) {
        int r=NumberInput(236,756);
        System.out.println(r);
    }
}
