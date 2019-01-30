package com.jicl.functionalInterface;

import java.util.function.Supplier;

import org.junit.Test;

/**
 * �Ĵ���ʽ�ӿڣ�
 * 	2.Supplier<T>�������ͽӿڣ��޲��з���ֵ
 * 		T get();
 * @author xianzilei
 *
 */
public class TestSupplierInterface {
	public void getSupplier(Supplier<Integer> sup){
		System.out.println(sup.get());
	}
	
	@Test
	public void test(){
		getSupplier(()->99);
	}
}
