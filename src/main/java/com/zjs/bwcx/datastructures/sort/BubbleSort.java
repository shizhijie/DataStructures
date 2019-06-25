package com.zjs.bwcx.datastructures.sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BubbleSort {
	public static void main(String[] args) {
		/*
		 * int[] arr = { 3, 9, -1, 10, -2 }; System.out.println("排序前");
		 * System.out.println(Arrays.toString(arr)); bubbleSort(arr);
		 * System.out.println("排序后"); System.out.println(Arrays.toString(arr));
		 */

		// 测试下冒泡排序的速度O(n^2),给80000个数据，测试
		// 创建要给80000个的随机的数组
		int[] arr = new int[80000];
		for (int i = 0; i < 80000; i++) {
			arr[i] = (int) (Math.random() * 8000000);
		}
		Date date1 = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr1 = simpleDateFormat.format(date1);
		System.out.println("排序前 的时间是=" + dateStr1);

		// 测试冒泡排序
		bubbleSort(arr);

		Date date2 = new Date();
		String dateStr2 = simpleDateFormat.format(date2);
		System.out.println("排序后的时间是=" + dateStr2);
	}
	
	//冒泡排序
	public static void bubbleSort(int[] arr) {
		// 冒泡排序的时间复杂度O(n^2)
		// 临时变量
		int temp = 0;
		boolean flag = false;// 表hi变量，表示是否进行交换过
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// 如果前边的数比后边的大，则交换
				if (arr[j] > arr[j + 1]) {
					flag = true;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			//System.out.println("第" + (i + 1) + "趟排序后的数组");
			//System.out.println(Arrays.toString(arr));
			if (!flag) {// 在一趟排序后，一次交换都没有发生过
				break;
			} else {
				flag = false;// 重置flag,进行下次判断
			}
		}
	}
}
