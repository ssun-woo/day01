package day01;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(100);
		System.out.println(100.123);

		System.out.println(100 + 100);
		System.out.println(100.123 + 100.123);
		
		System.out.println("백 : " + 100);
		// 문자열과 숫자의 합은 하나의 문자열로 만든다
		System.out.println("100" + 100 + 100);
		// 앞에 있는 문자열과 뒤에있는 숫자의 합
		// >> "100100" + 100
		// >> "100100100"
		System.out.println("100" + (100 + 100));
		// "100" + 200
		// 소괄호로 우선순위를 정할 수 있다
	}
}
