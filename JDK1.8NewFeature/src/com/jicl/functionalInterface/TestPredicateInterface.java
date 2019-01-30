package com.jicl.functionalInterface;

import java.util.function.Predicate;

import org.junit.Test;

/**
 * �Ĵ���ʽ�ӿڣ�
 * 	4.Predicate<T>�������ͽӿڣ��в��з���ֵ������ֵ��boolean����
 * 	----->boolean test(T t);;
 * @author xianzilei
 *
 */
public class TestPredicateInterface {
	public void getPredicate(String str,Predicate<String> pre){
		System.out.println(pre.test(str));
	}
	
	@Test
	public void test(){
		getPredicate("998", (str)->str=="991");
	}
}
