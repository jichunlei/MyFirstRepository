package com.jicl.functionalInterface;

import java.util.function.Function;

import org.junit.Test;

/**
 * �Ĵ���ʽ�ӿڣ�
 * 	3.Function<T , R>������ʽ�ӿڣ��в��з���ֵ
 * 	----->R apply(T t);
 * @author xianzilei
 *
 */
public class TestFunctionInterface {
	public void getFunction(String str,Function<String,Integer> fun){
		System.out.println(fun.apply(str));
	}
	
	@Test
	public void test(){
		getFunction("998", (s)->Integer.valueOf(s));
	}
}
