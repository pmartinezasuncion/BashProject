//This program adds numbers 1-10
public class Number{
	public static void main (String[] args){
		int num = 10, sum = 0;

		for(int i = 1; i<= num; ++i){
			//sum = sum + i
			sum += i;
		}
		System.out.println("The sum "+ sum);
	}
}
