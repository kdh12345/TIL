package aop1;

import java.util.ArrayList;

public class Board {
	public ArrayList<String> getList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("�Խù�1");
		list.add("�Խù�2");
		list.add("�Խù�3");
		list.add("�Խù�4");
		list.add("�Խù�5");
		return list;
	}
	public void insert(int seq) {
		System.out.println(seq+" ��° �Խù��� �����մϴ�.");
	}
}
