//此处替换成你自己的包名，格式：package 包名;
package com.liuchenglu.level_01;

/**
 * 输出用星号组成的向右箭头
 * @author Jiatu
 * 
 */
public class StarRightArrow {
	public static void main(String[] args) {
		for (int i = 1; i <= 13; i += 2) {
			for (int j = 1; j <= i && i + j <= 14; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
