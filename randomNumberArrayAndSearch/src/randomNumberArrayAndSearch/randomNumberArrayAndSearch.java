package randomNumberArrayAndSearch;
import java.util.Random;
import java.util.Arrays;
public class randomNumberArrayAndSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		int[]list=new int[50];
		int num1=1;
		int num2=0;
		int freqNum=list[0];
		System.out.println("Array: ");
		for(int a=0; a<list.length; a++)
		{
			list[a]=ran.nextInt(25)+1;
			System.out.println(list[a]+", ");
		}
		System.out.println();
		System.out.println();
		Arrays.sort(list);
		System.out.println("Sorted Arrays: ");
		for(int b=0; b<list.length; b++)
		{
			System.out.println(list[b]+", ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Smallest number: "+list[0]);
		System.out.println("Largest number: "+list[49]);
		System.out.println("The product of the smallest and largest number is: "+list[0]*list[49]);
		for(int a=1; a<list.length; a++)
		{
			if(list[a]==list[a-1])
			{
				num1++;
			}
			else
			{
				if(num1>num2)
				{
					num2=num1;
					freqNum=list[a-1];
				}
				num1=1;
			}
		}
		System.out.println("The most frequent number is "+freqNum+" and it appears "+num2+" times.");
	}

}
