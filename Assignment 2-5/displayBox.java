import java.util.Scanner;
public class displayBox {
    public static void displayBox (int width, int height){
        String sym = "$";
        
        for (int i=0;i<height;i++){
            
            for (int j=0;j<width;j++){
                System.out.print(sym);

            }
            System.out.println("");

        }
        
    }

}
