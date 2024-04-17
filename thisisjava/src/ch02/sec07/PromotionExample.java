package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intvalue = byteValue;
		System.out.println("intValue:" + intvalue);
		
		char charValue = '가';
		intvalue = charValue;
		System.out.println("가의 유니코드:" + intvalue);
		
		intvalue = 50;
		long longvalue = intvalue;
		System.out.println("longvalue:" + intvalue);
		
		longvalue = 100;
		float floatvalue = longvalue;
		System.out.println("floatvalue:" + floatvalue);
		
		floatvalue = 100.5f;
		double doublevalue = floatvalue;
		System.out.println("doubkevakue:" + doublevalue);
		
		
		
		
	}

}
