package com.jicl.functionalInterface;

import org.junit.Test;

/**
 * jdk1.8�����ԣ�
 * 		3.����ʽ�ӿڣ�����ֻ����һ�����󷽷��Ľӿڣ�ע���ǳ��󷽷���
 * @author xianzilei
 *
 */
public class TestMyFunctionalInterface{
	@Test
	public void test() {
		MyFunctionalInterface myFI=i->i*2;
		System.out.println(myFI.method1(99));
		System.out.println(myFI.method2());
		System.out.println(MyFunctionalInterface.method3());
	}
	
	
}
