// java.util.HashMap - Key목록을 사용하여 Map에서 값을 꺼내
package step12.ex06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import step12.ex06.Member;

public class Exam02_1 {
	public static void main(String[] args) {
		Member v1 = new Member("홍길동", 20);
		Member v2 = new Member("유관순", 16);
		Member v3 = new Member("임꺽정", 30);
		Member v4 = new Member("안중근", 20);
		Member v5 = new Member("윤봉길", 25);
		
		HashMap map = new HashMap();
		
		// 값을 저장할 때 key로 사용할 객체를 지정한다.
		// 보통 key 객체로 String 객체를 많이 사용한다.
		// => 어떤 객체라도 key로 사용할 수 있다.
		map.put("s01", v1);
		map.put("s02", v2);
		map.put("s03", v3);
		map.put("s04", v4);
		map.put("s05", v5);
		
		Set entrySet = map.entrySet(); // key/value가 한 쌍으로 묶인 객체가 들어있는 집합.
		
		for(Object obj : entrySet) {
			// Set 컬렉션에 들어있는 객체는 원래 Entry객체이다.
			// Entry 객체에서 key와 값을 꺼내려
			// 원래의 타입으 형 변환해야 한다. 
			Entry entry = (Entry)obj;
			System.out.printf("%s = %s%n", entry.getKey(), entry.getValue());
			
		}
		
	}
}