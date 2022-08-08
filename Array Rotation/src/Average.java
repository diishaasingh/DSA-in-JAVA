
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		   int sum = 0;
		   Double average;
		   
		   for(int number:numbers) {
			   sum+=number;
		   }
		   
		   int length=numbers.length;
		   
		   //typecasting
		   average=(double)sum/(double)length;

		   System.out.println("Sum = " + sum);
		   System.out.println("Average = " + average);
	}

}
