package chap05;

import java.util.ArrayList;
import java.util.List;

//操作Vector对象，进行元素的添加、插入、修改和删除
public class UseArrayList {
	public static void main(String[] args) {
		List<String> scores = new ArrayList<String>();
		scores.add("86");// 添加元素
		scores.add("98");// 添加元素
		scores.add(1, "99");// 插入元素
		for (int i = 0; i < scores.size(); i++) {
			System.out.print(scores.get(i) + " ");// 输出结果
		}
		scores.set(1, "77");// 修改第二个元素
		scores.remove(0);// 删除第一个元素
		System.out.println("\n修改并删除之后");
		for (int i = 0; i < scores.size(); i++) {
			System.out.print(scores.get(i) + " ");
		}
		System.out.println(" \n按字符串输出\n" + scores.toString());
	}
}