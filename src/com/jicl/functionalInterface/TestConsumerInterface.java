package com.jicl.functionalInterface;

import java.util.function.Consumer;
import org.junit.Test;

/**
 * �Ĵ���ʽ�ӿڣ�
 * 	1.Consumer<T>�������ͽӿڣ��в��޷���ֵ
 * 		void accept(T t);
 * @author xianzilei
 *
 */
public class TestConsumerInterface {
	public void getConsumer(double money,Consumer<Double> consumer){
		consumer.accept(money);
	}
	
	@Test
	public void test(){
		getConsumer(999,(m)->System.out.println("һ������"+m+"Ԫ"));
	}
}
