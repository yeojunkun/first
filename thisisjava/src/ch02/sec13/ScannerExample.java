package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값 입력:");
		String strX = scanner.nextLine();
		int X = Integer.parseInt(strX);
		
		System.out.print("Y값 입력:");
		String strY = scanner.nextLine();
		int Y = Integer.parseInt(strY);
		
		int result = X + Y;
		System.out.println("X + Y:" + result);
		System.out.println();
		
		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열:" + data);
			System.out.println();
			
			
			
			scanner.close();
		}
		System.out.println("종료");
		
		
		
	}

}
