package com.jicl.functionalInterface;
/**
 * �Զ���ĺ���ʽ�ӿ�
 * @author xianzilei
 *
 */
@FunctionalInterface
public interface MyFunctionalInterface {
	public int method1(int i);
	
	//�������ⶨ��Ĭ�Ϸ���
	default public int method2(){
		return 2;
	}
	
	//�������ⶨ�徲̬����
	static int method3(){
		return 3;
	}
}
