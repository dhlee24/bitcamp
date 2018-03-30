// java.util.HashMap - 값을 저장할 때 key를 사용하여 저장한다.
package step12.ex06;

import java.util.HashMap;

import step12.ex06.Member;

public class Exam01_3 {
	static class MyKey{
		String major;
		int no;
		
		public MyKey(String major, int no) {
			this.major = major;
			this.no = no;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((major == null) ? 0 : major.hashCode());
			result = prime * result + no;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MyKey other = (MyKey) obj;
			if (major == null) {
				if (other.major != null)
					return false;
			} else if (!major.equals(other.major))
				return false;
			if (no != other.no)
				return false;
			return true;
		}
		
		
	}
	public static void main(String[] args) {
		Member v1 = new Member("홍길동", 20);
		Member v2 = new Member("유관순", 16);
		Member v3 = new Member("임꺽정", 30);
		Member v4 = new Member("안중근", 20);
		Member v5 = new Member("유관순", 16);
		
		MyKey k1 = new MyKey("컴공", 1);
		MyKey k2 = new MyKey("컴공", 2);
		MyKey k3 = new MyKey("컴공", 3);
		MyKey k4 = new MyKey("컴공", 4);
		MyKey k5 = new MyKey("컴공", 5);
		
		
		HashMap map = new HashMap();
		
		
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		
		System.out.println(map.get(k1));
		System.out.println(map.get(k2));
		System.out.println(map.get(k3));
		System.out.println(map.get(k4));
		System.out.println(map.get(k5));
		
		// 같은 값을 갖지만 인스턴스가 다른 key
		MyKey k6 = new MyKey("컴공", 3); // k3와 같은 값을 갖지만 인스턴스는 다르다
		
		System.out.println(map.get(k6));
		// k3와 k6는 인스턴스가 다르더라도 hashCode()의 리턴 값이 같고, equals()의 결과가 true기 때문에
		// 같은 key로 간주한다.
		//
		// 결론!
		// - HashMap의 key 객체로 사용할 클래스는 반드시 hashCode()와 equals()를 오버라이딩 하여
		//	 같은 값을 갖는 경우 같은 해시 값을 리턴하게 하라!
		// - 
	}
}
