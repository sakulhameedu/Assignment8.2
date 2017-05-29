import java.util.Scanner;
//implement interface runnable

public class demoRunnable implements Runnable {
	// counter flag to 0
	int flag = 0;

	// override run method
	public void run() {
		System.out.println("Enter the no to check whether prime or not by RUNNABLE interface  ");
		Scanner obj = new Scanner(System.in);
		// user input
		int a = obj.nextInt();
		// condition to check for prime number
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				System.out.println(" number is not  prime");

				flag++;

				break;
			}

		}
		// if counter remain unchange
		if (flag == 0) {
			System.out.println("number is prime");

		}
	}
	// main method

	public static void main(String[] args) {
		// demoClass object
		demoRunnable obj1 = new demoRunnable();
		// thread class object
		// passing object
		Thread t1 = new Thread(obj1);
		// run method for t1 object

		t1.run();
		// demoThread object
		demoRunnable obj2 = new demoRunnable();
		// object passing

		Thread t2 = new Thread(obj2);
		// method to start thread t2

		t2.start();

	}
}

----------------
Sample Output:
sh-4.3$ javac demoRunnable.java                                                                                                                                                 
sh-4.3$ java demoRunnable                                                                                                                                                       
Enter the no to check whether prime or not by RUNNABLE interface                                                                                                                
1123                                                                                                                                                                            
number is prime                                                                                                                                                                 
Enter the no to check whether prime or not by RUNNABLE interface                                                                                                                
345                                                                                                                                                                             
 number is not  prime                                                                                                                                                           
sh-4.3$ java demoRunnable                                                                                                                                                       
Enter the no to check whether prime or not by RUNNABLE interface                                                                                                                
1                                                                                                                                                                               
number is prime                                                                                                                                                                 
Enter the no to check whether prime or not by RUNNABLE interface                                                                                                                
3                                                                                                                                                                               
number is prime 
