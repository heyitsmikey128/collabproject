package project;

public class CLass {
   


    public static void main(String[] args) {
        
        System.out.println("Hello World, is the stupidest statement that "
                 + "every programing example ever uses\nSTOP USING IT!!");
        
        mathing();
    }
    public static double mathing() {
        double num = Math.random()*100;
    
            if (num < 30){
                System.out.println("THE NUMBER IS less than 30");
            }
            else{
                System.out.println(num);
            }
            System.out.println(num);
        return num;
    }
}