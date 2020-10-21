import java.util.Scanner;
public class ex7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int dice = 0;
        int sides = 0;;
        int num = 0;
        int total = 0;
        String YN = "y";
       
        
        while(YN.equals("y")){
        System.out.println("How many dice do you want to roll? ");
        dice = sc.nextInt();
        System.out.println("How many sides do these dice have? ");
        sides = sc.nextInt();
        System.out.println("Your rolled: ");
        System.out.println("");
        
        for (int i = 0; i<dice; i++){
             num = rollDie(sides);
             total = total + num;
             System.out.print(" " + num);
        }
        System.out.println("");
        System.out.println("Total: " + total);
        System.out.println("");
        System.out.println("Again? ");
        YN = sc.next();
    }
        
        
    
        
        
    }
    public static int rollDie(int sides){
        return ((int) (Math.random()*sides + 1));
    }


}
