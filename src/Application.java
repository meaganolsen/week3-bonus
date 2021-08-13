
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] numbers = new int [6];
        numbers [0] = 1;
        numbers  [1] = 5;
        numbers[2] = 2;
        numbers [3] = 8;
        numbers[4] = 13;
        numbers[5] = 6;
        
//       int[] number = {1, 5, 2, 8, 13, 6};
//        System.out.println(numbers[0]);
//        System.out.println(numbers [numbers.length - 1]);
//        System.out.println(numbers [6]);
//       System.out.println(numbers[-1]);
//       for(int i = 0; i < numbers.length; i++) {
        //	System.out.println(numbers[i]);
        //for (int number : numbers) {
        	//System.out.println(number);
        //}
        //}
       int sum = 0;
        for (int num : numbers) {
        	sum += num; 
        	
        }
        System.out.println(sum);
        int average = sum / numbers.length;
        System.out.println(average);
        for (int oddNum : numbers) {
        	if (oddNum % 2 != 0) {
        	System.out.println(oddNum);
        	}	
        }
        String[] names = {"Sam", "Sally", "Thomas", "Robert"};
        int sumOfLetters = 0;
         for (String name : names) {
        	 sumOfLetters += name.length();
        	 
         }
         System.out.println(sumOfLetters);
         printGreeting("Bob");
         System.out.println(printGreet("Bob"));
         System.out.println(isStringLongerThanNumber ("hello", 5));
	}
	public static void printGreeting (String name) {
		System.out.println("Hello, " + name +"!");}
	public static String printGreet (String name) {
		return "Hello, " + name +"!";}
	public static boolean isStringLongerThanNumber (String word, int number) {
		return word.length() > number;
	
	
	}

}
