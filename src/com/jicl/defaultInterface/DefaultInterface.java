package com.jicl.defaultInterface;
/**
 * jdk1.8�����ԣ�
 * 		1.�ӿڵ�Ĭ�Ϸ���
 * @author xianzilei
 *
 */
public interface DefaultInterface {
	int method1();
	
	default int method2(){
		return 2*4;
	}
}
