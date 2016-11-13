//此处替换成你自己的包名，格式：package 包名;
package com.liuchenglu.level_02;

import java.util.Scanner;

/**
 * 判断输入的年份是否为闰年
 * 闰年的判断规则如下：       
 *  （1）若某个年份能被4整除但不能被100整除，则是闰年。       
 *  （2）若某个年份能被400整除，则也是闰年。
 * @author Jiatu
 * 
 */
public class Bissextile {
	public static void main(String[] arge) {
		System.out.println("请输入年份:");
		int year;
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();
		scanner.close();
		if (year < 0 || year > 3000) {
			System.out.println("年份有误，程序退出！");
			System.exit(0);
		}
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " 是闰年");
		} else {
			System.out.println(year + " 不是闰年");
		}
	}
}
