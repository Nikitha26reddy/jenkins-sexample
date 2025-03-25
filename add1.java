import java.util.Scanner;
class add1{
        public static void main(String args[])
        {
                int x,y;
                int c;
		Scanner myObj = new Scanner(System.in); 
    		System.out.println("Type a number:");
    		x = myObj.nextInt(); 

    		System.out.println("Type another number:");
    		y = myObj.nextInt(); 
		c=x+y;
                System.out.println("x+y=");
                System.out.println(c);
        }
}

