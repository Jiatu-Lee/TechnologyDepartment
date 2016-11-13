//此处替换成你自己的包名，格式：package 包名;
package com.liuchenglu.level_02;

import java.util.Scanner;

/**
 * 给定一个百分制的数字，输出相应的等级。 90分以上 A级 80~89 B级 70~79 C级 60~69 D级 60分以下 E级
 * 
 * @author Jiatu
 * 
 */
public class CheckScore {
	public static void main(String[] args) {
		System.out.println("请输入一个数字");
		// 可以为小数
		double mark;
		Scanner scanner = new Scanner(System.in);
		mark = scanner.nextDouble();
		scanner.close();
		if (mark < 0 || mark > 100) {
			System.out.println("输入有误！ ");
			System.exit(0);
		}
		if (mark >= 90)
			System.out.println("该分数对应的是 A");
		else if (mark >= 80)
			System.out.println("该分数对应的是 B");
		else if (mark >= 70)
			System.out.println("该分数对应的是 C");
		else if (mark >= 60)
			System.out.println("该分数对应的是 D");
		else
			System.out.println("该分数对应的是 E");
	}
}
