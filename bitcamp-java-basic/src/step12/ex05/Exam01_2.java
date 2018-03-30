//
package step12.ex05;

import java.util.HashSet;

public class Exam01_2 {
	public static void main(String[] args) {
		String v1 = new String("aaa");
		String v2 = new String("bbb");
		String v3 = new String("ccc");
		String v4 = new String("ddd");
		String v5 = new String("ccc");
		
		
		HashSet set = new HashSet();
		set.add(v1);
		set.add(v2);
		set.add(v3);
		set.add(v4);
		set.add(v5); 
		// v5 v3와 다른 인스턴스이다. 하지만 두 객체에 들어있는 문자열은 같다.
		// String 클래스는 인스턴스가 다르더라도 값이 같으면 
		// hashCode()의 리턴 값이 같도록 오버라이딩 하였다.
		// 또한 equals()	의 리턴 값도 true가 되도록 오버라이딩 하였다.
					 
		// HashSet()은 값의 중복을 검사할 때 인스턴스의 주소를 비교하지 않고
		// hashCode()의 리턴 ㄹ값과 equals()의 리턴 값으로 판단한다.
		// 따라서 v5는 비록 v3와 다른 인스턴스지만 hashCode()의 리턴 값이 두 객체에 
		print(set);
	}
	
	static void print(HashSet set) {
		Object[] values = set.toArray();
		for(Object value : values) {
			System.out.print(value + ", ");
		}
		System.out.println();
	}
}
