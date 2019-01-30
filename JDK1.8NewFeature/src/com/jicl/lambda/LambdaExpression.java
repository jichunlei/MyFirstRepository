package com.jicl.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * jdk1.8�����ԣ�
 * 		2.Lambda���ʽ����ɣ������б���ͷ��->�����Լ�һ�����ʽ�����飩====���ʣ������ڲ��࣬Ҳ������һ�ο��Դ��ݵĴ���
 * 
 * @author xianzilei
 *
 */
public class LambdaExpression {

	/**
	 * ��ͳ����д��
	 */
	public void traditionalSort() {
		List<String> list = Arrays.asList("bd", "af", "ac", "dg", "cc");
		System.out.println("����ǰ----" + list);
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("�����----" + list);
	}

	/**
	 * Lambda���ʽд��1
	 */
	public void lambdaSort1() {
		List<String> list = Arrays.asList("bd", "af", "ac", "dg", "cc");
		System.out.println("����ǰ----" + list);
		Collections.sort(list, (String a, String b) -> {
			return a.compareTo(b);
		});
		System.out.println("�����----" + list);
	}

	/**
	 * Lambda���ʽд��2
	 */
	public void lambdaSort2() {
		List<String> list = Arrays.asList("bd", "af", "ac", "dg", "cc");
		System.out.println("����ǰ----" + list);
		Collections.sort(list, (String a, String b) -> a.compareTo(b));
		System.out.println("�����----" + list);
	}

	/**
	 * Lambda���ʽд��3
	 */
	public void lambdaSort3() {
		List<String> list = Arrays.asList("bd", "af", "ac", "dg", "cc");
		System.out.println("����ǰ----" + list);
		Collections.sort(list, (a, b) -> a.compareTo(b));
		System.out.println("�����----" + list);
	}
}
