package com.jicl.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * Stream����
 * @author xianzilei
 *
 */
public class TestStream {
	/**
	 * ������
	 */
	@Test
	public void testGenerateStream(){
		//1.ͨ��Collection ϵ�м����ṩ��stream()����paralleStream()
		List<String> list1 = Arrays.asList("dc","dadw","","adq","c","we");
		Stream<String> stream1 = list1.stream();
		Stream<String> parallelStream1 = list1.parallelStream();//Ϊ���ϴ���������
		List<String> collect11 = stream1.filter(s->!s.isEmpty()).collect(Collectors.toList());
		List<String> collect12 = parallelStream1.filter(s->!s.isEmpty()).collect(Collectors.toList());
		System.out.println("ͨ�������ṩ��stream()������------"+collect11);
		System.out.println("ͨ�������ṩ��paralleStream()������------"+collect12);
		stream1.close();
		parallelStream1.close();
		
		//2.ͨ��Arrays�ľ�̬����stream()��ȡ������
		String[] strings={"dc","dadw","","adq","c","we"};
		Stream<String> stream2 = Arrays.stream(strings);
		List<String> collect2 = stream2.collect(Collectors.toList());
		System.out.println("ͨ��Arrays�ľ�̬����stream()��ȡ������------"+collect2);
		stream2.close();
		
		//3.ͨ��Stream���еľ�̬����of
		Stream<String> stream3 = Stream.of("dc","dadw","","adq","c","we");
		List<String> collect3 = stream3.collect(Collectors.toList());
		System.out.println("ͨ��Stream���еľ�̬����of------"+collect3);
		stream3.close();
		
		//4.����������
		Stream<Integer> stream4 = Stream.iterate(0, (x)->x+2);
		List<Integer> collect4 = stream4.collect(Collectors.toList());
		System.out.println("����������------"+collect4);
		stream4.close();
	}
	
	/**
	 * forEach�÷�:Stream �ṩ���µķ��� 'forEach' ���������е�ÿ������
	 */
	@Test
	public void testForEach(){
		Random random=new Random();
		random.ints(0,10).limit(20).forEach(System.out::println);
	}
	
	/**
	 * map�÷�:map ��������ӳ��ÿ��Ԫ�ص���Ӧ�Ľ��
	 */
	@Test
	public void testMap(){
		List<String> list = Arrays.asList("dc","c","","adq","c","we");
		List<String> collect = list.stream().map(i->i+"1").distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
	
	/**
	 * filter�÷�:filter ��������ӳ��ÿ��Ԫ�ص���Ӧ�Ľ��
	 */
	@Test
	public void testFilter(){
		List<String> list = Arrays.asList("dc","c","","adq","c","we");
		List<String> collect = list.stream().filter(s->!s.isEmpty()).distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
	
	/**
	 * limit�÷�:limit �������ڻ�ȡָ����������
	 */
	@Test
	public void testLimit(){
		Random random=new Random();
		random.ints(0,10).limit(20).forEach(System.out::println);
	}
	
	/**
	 * sorted�÷�:sorted �������ڶ�����������
	 */
	@Test
	public void testSorted(){
		Random random=new Random();
		random.ints(0,100).limit(20).sorted().forEach(System.out::println);
	}
	
	/**
	 * ���У�parallel������
	 */
	@Test
	public void testParallel(){
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,9,8);
		list.parallelStream().forEach(System.out::print);//��һ������ԭ��˳����������������
		System.out.println();
		list.parallelStream().forEachOrdered(System.out::print);//����ԭ��˳�����
	}
	
	/**
	 * Collectors:Collectors ��ʵ���˺ܶ��Լ���������罫��ת���ɼ��Ϻ;ۺ�Ԫ��
	 */
	@Test
	public void testCollectors(){
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,9,8);
		list.parallelStream().forEach(System.out::print);//��һ������ԭ��˳����������������
		System.out.println();
		list.parallelStream().forEachOrdered(System.out::print);//����ԭ��˳�����
	}
	
	/**
	 * reduce ����Լ����
	 */
	@Test
	public void testReduce(){
		//һ�����
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,9,8);
		Integer sum = list1.stream().reduce((a,b)->a+b).get();
		System.out.println(sum);
		//�������
		List<String> list2 = Arrays.asList("a","b","b","c");
		String str = list2.stream().reduce("j", (a,b)->a+b);
		System.out.println(str);
		//�������
	}
}
