package com.jicl.methodReferences;

import java.util.function.BiFunction;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * ����������
 * ��ʽ��ClassName::new
 * @author xianzilei
 *
 */
public class TestConstructorReferences {
	
	@Test
	//���췽������  ����::new���޲Σ�
	public void test1(){
		Supplier<Person> supplier=()->new Person();
		System.out.println(supplier.get());
		Supplier<Person> supplier2=Person::new;//Person��������޲ι�����
		System.out.println(supplier2.get());	
	}
	
	@Test
	//���췽������ ����::new �����Σ�
	public void test2(){
		BiFunction<String, Integer,Person> biFunction1=(a,b)->new Person(a, b);
		Person person1 = biFunction1.apply("����", 18);
		System.out.println(person1);
		
		BiFunction<String, Integer,Person> biFunction2=Person::new;
		Person person2 = biFunction2.apply("����", 18);
		System.out.println(person2);
		
	}
	
}
