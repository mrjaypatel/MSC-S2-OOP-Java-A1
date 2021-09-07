import java.util.Scanner;

public class pattern {
    public static void main(String args[]){
        System.out.println("##### Q1 Started ####");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number:");
        int number = sc.nextInt();
        for(int i = 0; i < number; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(i+1);
            }
            System.out.println("");
        }

    }



}
