
import java.util.Stack;
import java.util.Scanner;
class stack{

	public static Stack<Integer> stack = null;
    public static void main(String args[]){
			if(args.length==0)
			{
				System.out.println("No arguments are passed");
			}
			else
			{
				if(stack == null){
					System.out.println("Init Stack");
					stack = new Stack<Integer>();	
				}else{
					System.out.print("Stack Have value: "+ stack);
				}
				
				try{
					
					if(args[0].equalsIgnoreCase("push")){
						System.out.println("-- Pushing Data To Stack!");
						for(int i=1;i<args.length;i++){
							int a=Integer.parseInt(args[i]);
							System.out.println(a);
							stack.push(a);
						}
					}else if(args[0].equalsIgnoreCase("pop")){
							System.out.println("-- Pushing Data To Stack First!");
							for(int i=1;i<args.length;i++){
								int a=Integer.parseInt(args[i]);
								System.out.println(a);
								stack.push(a);
							}
							System.out.println("-- Popping Data From Stack!");
							System.out.println("-- Pre Pop Data From Stack:"+stack);
							stack.pop();
							System.out.println("-- Post Pop Data From Stack:"+stack);
							
					}else{
						System.out.println("-- Invalid Operation![ push/pop allowed.]");
					}

				}catch(Exception e){
					System.out.print("-- Integer Values are only allowd for CLI Args!");
				}
				System.out.println("-- Stack value Is: "+ stack);
			}
			

    }
	
	
    // Pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop Operation:");

        for(int i = 0; i < 5; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }
	
	

}