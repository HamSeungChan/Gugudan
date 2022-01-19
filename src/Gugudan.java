import java.util.*;

public class Gugudan {

	public static void main(String [] args) {
		
//	int i=1;
//	
//	System.out.print("구구단 총 출력할 단은?");
//	Scanner scanner = new Scanner(System.in);
//	int number = scanner.nextInt();
//	System.out.println("number: "+number);
//	
//	number = 4;
//	System.out.println("4단");
//	System.out.println(number*1);
//	System.out.println(number*2);
//	System.out.println(number*3);
//	System.out.println(number*4);
//	System.out.println(number*5);
//	System.out.println(number*6);
//	System.out.println(number*7);
//	System.out.println(number*8);
//	System.out.println(number*9);
//	
//	number = 5;
//	System.out.println("5단");
//	System.out.println(number*1);
//	System.out.println(number*2);
//	System.out.println(number*3);
//	System.out.println(number*4);
//	System.out.println(number*5);
//	System.out.println(number*6);
//	System.out.println(number*7);
//	System.out.println(number*8);
//	System.out.println(number*9);
//	
//	// while 문을 활용한 6단
//	System.out.print("몇 단을 할것인가요?");
//	number = scanner.nextInt();
//	while(i<10) {
//		System.out.println(number*i);
//		i++;
//		}
//	// for 문을 활용한 7단
//	System.out.print("몇 단을 할것인가요?");
//	number = scanner.nextInt();
//	for(i=1;i<10;i++) {
//		System.out.println(number*i);
//		} 

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 단을 출력할건가요?");
		int number = scanner.nextInt();
		
		if(number<2 && number>9) {
			System.out.println("2단과 9단 사이만 입력이 가능합니다");
		}
		
		else {
		System.out.println(number+"단을 출력하겠습니다");
		for(int i=1;i<10;i++) {
				System.out.println(number+"x"+i+"="+number*i);
			}
		}
	}	
}
