package sample;

public class ForSample {

    public static void main(String[] args) {
        for (int i =1; i <= 10; i++) {
            System.out.println(i);
            
          
        }
        for(int i=2; i<=20; i+=2) {
            System.out.println(i);
        }
        
        for(int i=1; i<=20; i++) {
            if (i%2 ==0) {
                continue;
            }
                System.out.println(i);
            }
        var numbers = new int[] {1,2,3,4,5};
        
        for(var number:numbers) {
            System.out.println(number);
        }
        }
    }


