//此处替换成你自己的包名，格式：package 包名;
package com.liuchenglu.level_01;

/**
 * 打印九九乘法表
 * @author Jiatu
 *
 */
public class NineNine {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "= " + i * j + "\t");
				if (i == j) {
					System.out.print("\n");
				}
			}
		}
	}

}
