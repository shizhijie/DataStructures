package com.zjs.bwcx.datastructures.sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SelectSort {
	public static void main(String[] args) {

		/*
		 * int[] arr = { 3, 9, -1, 10, -2 }; System.out.println("排序前");
		 * System.out.println(Arrays.toString(arr)); selectSort(arr);
		 * System.out.println("排序后"); System.out.println(Arrays.toString(arr));
		 */

		// 测试下选择排序的速度O(n^2),给80000个数据，测试
		// 创建要给80000个的随机的数组

		int[] arr = new int[80000];
		for (int i = 0; i < 80000; i++) {
			arr[i] = (int) (Math.random() * 8000000);
		}
		Date date1 = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr1 = simpleDateFormat.format(date1);
		System.out.println("排序前 的时间是=" + dateStr1);

		// 测试选择排序
		selectSort(arr);

		Date date2 = new Date();
		String dateStr2 = simpleDateFormat.format(date2);
		System.out.println("排序后的时间是=" + dateStr2);

	}

	// 选择排序
	public static void selectSort(int[] arr) {
		// 选择排序的时间复杂度是O(n^2)
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			int min = arr[minIndex];
			for (int j = i + 1; j < arr.length; j++) {
				if (min > arr[j]) {// 说明假定的最小值，并不是最小
					min = arr[j];// 重置最小
					minIndex = j;// 重置minIndex
				}
			}
			// 将最小值，放在arr[0],即交换
			if (minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
			//System.out.println("第" + (i + 1) + "轮后~~");
			//System.out.println(Arrays.toString(arr));
		}
	}
}
