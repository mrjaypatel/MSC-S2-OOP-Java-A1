import java.util.Scanner;
class myException{
	 public static void main(String args[]){
        System.out.println("##### Q1 Started ####");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number:");
        int number = sc.nextInt();
		try {
			int[] myArray = new int[number];
			System.out.print("-- Array Careted With Positive Number: "+number);
		} catch (NegativeArraySizeException ex) {
			System.out.println("-- Can't create array of negative size");
		}

    }
	

}