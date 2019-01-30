package com.jicl.methodReferences;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

import org.junit.Test;

/**
 * JDK1.8�����ԣ���������:��lambda���е������з����Ѿ�ʵ���ˣ���ô����ʹ�á��������á�,Ҳ�������Ϊ����������lambda���ʽ������һ�ֱ�����ʽ�������﷨��lambda���ʽ���Ӽ�
 *		
 * ���ֱ�����ʽ�� 
 *	1. ���󣺣�ʵ�������� 
 *	2. �ࣺ����̬������ 
 *	3. �ࣺ��ʵ�������� ��lambda�����б��е�һ��������ʵ�������ĵ��� �ߣ��ڶ���������ʵ�������Ĳ���ʱ���ã�
 * @author xianzilei
 *
 */
public class TestMethodReferences {

	@Test
	public void test() {
		//��ͨlambda���ʽд��
		Consumer<Integer> consumer=(i)->System.out.println(i);
		consumer.accept(996);
		
		//������ʽ1�������󣺣�ʵ����������
		Consumer<Integer> consumer1=System.out::println;
		consumer1.accept(997);
		
		//������ʽ2�����ࣺ����̬��������
		Function<String,Integer> function2=Integer::valueOf;
		Integer apply = function2.apply("998");
		System.out.println(apply);
		
		//������ʽ3�����ࣺ��ʵ����������
		BiFunction<String, String, Boolean> biFunction=String::equals;
		Boolean result = biFunction.apply("hello", "hello");
		System.out.println(result);
	}
}
