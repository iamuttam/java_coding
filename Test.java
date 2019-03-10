public class Test{
    public static void main(String[] args){
        int n=50;

        for(int i=1;i<=n;i++){
            if(i%15==0)
                System.out.println("FizzBuzz");
            else{
                if(i%3==0)
                    System.out.println("Fizz");
                else if(i%5==0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
            }
        }
    }
    
}