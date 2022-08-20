package aop1;

import java.util.ArrayList;

public class Board {
	public ArrayList<String> getList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("게시문1");
		list.add("게시문2");
		list.add("게시문3");
		list.add("게시문4");
		list.add("게시문5");
		return list;
	}
	public void insert(int seq) {
		System.out.println(seq+" 번째 게시물을 저장합니다.");
	}
}
