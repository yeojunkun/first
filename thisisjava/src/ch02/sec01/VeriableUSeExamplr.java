package ch02.sec01;

public class VeriableUSeExamplr {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalminute = (hour*60) + minute;
		System.out.println(totalminute + "분");
	}

}
