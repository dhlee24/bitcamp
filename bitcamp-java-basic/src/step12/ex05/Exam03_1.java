// HashSet과 사용자 정의 데이터 타입 
package step12.ex05;

import java.util.HashSet;

public class Exam03_1 {
	static class Member {
		String name;
		int age;

		public Member(String name, int age) {
			this.name = name;
			this.age = age;

		}

		@Override
		public String toString() {
			return "Member [name=" + name + ",age=" + age + "]";
		}

		public static void main(String[] args) {
			Member v1 = new Member("홍길동", 20);
			Member v2 = new Member("유관순", 16);
			Member v3 = new Member("임꺽정", 30);
			Member v4 = new Member("안중근", 20);
			Member v5 = new Member("유관순", 16);

			HashSet set = new HashSet();
			set.add(v1);
			set.add(v2);
			set.add(v3);
			set.add(v4);
			set.add(v5);

			// 출력해보면 ("유관순", 16)데이터가 중복해서 저장되었음을 알 수 있다.
			// 이유?
			// => HashSet이 중복 값인지 검사 할 때 hashCode()와 equals()의 리턴값으로 판단한다.
			// => Member 클래스에서 hashCode() equlas()를 오버라이딩 하지 않았기 때문이다.
			// => Object로부터 상속 받은 hashCode(와 equals()를 그대로 사용하여
			// 값의 중복 여부를 검사하기 때문이다.
			// => Object의 hashCode()를 ㅇ니스턴스가 다르면 무조건 다른 hash값을 리턴한다.
			// Object의 equals()는 무조건 인스턴스의 주소가 같은지 검사한다.
			print(set);
		}

		static void print(HashSet set) {
			Object[] values = set.toArray();
			for (Object value : values) {
				System.out.println(value);
			}
		}
	}
}
