package day18;
import java.util.Scanner;
import java.util.Random;

class Ex13
{
	final int SIZE = 9;
	int []front = new int [SIZE];
	int []back = new int [SIZE];
	
}
public class ClassEx13 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	Ex13 e = new Ex13();
	
	for(int i = 0;i<e.SIZE;i++)
	{
		e.front[i] = i+1;
		e.back[i] = i+10;
	}
	
	for(int i = 0; i<1000;i++)
	{
		int rd = ran.nextInt(e.SIZE);
		int temp = e.front[0];
		e.front[0] = e.front[rd];
		e.front[rd] = temp;
	}
	
	int game = 0;
	System.out.println("=== 1 to 18 ===");
	int min = e.back[0];
	while (true)
	{
		for(int i = 0; i<e.SIZE;i++)
		{
			if(i%3==0)
			{
				System.out.println();
			}
			System.out.print(e.front[i]+"    ");
			
		}
		System.out.println();
		
		System.out.print("인덱스를 입력하세요 : ");
		int idx = sc.nextInt();
		
		for(int i = 0; i<e.SIZE;i++)
		{
			
				if(i == idx)
				{
					e.front[i] = e.back[i];
				}
			
			
		}
		game ++;
	}
	}
}


