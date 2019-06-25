package com.zjs.bwcx.datastructures.sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InsertSort {

	public static void main(String[] args) {

		/*
		 * int[] arr = { 3, 9, -1, 10, -2 }; System.out.println("排序前");
		 * System.out.println(Arrays.toString(arr)); insertSort(arr);
		 * System.out.println("排序后"); System.out.println(Arrays.toString(arr));
		 */

		// 测试下插入排序的速度O(n^2),给80000个数据，测试
		// 创建要给80000个的随机的数组

		int[] arr = new int[80000];
		for (int i = 0; i < 80000; i++) {
			arr[i] = (int) (Math.random() * 8000000);
		}
		Date date1 = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr1 = simpleDateFormat.format(date1);
		System.out.println("排序前 的时间是=" + dateStr1);

		// 测试插入排序 
		insertSort(arr);

		Date date2 = new Date();
		String dateStr2 = simpleDateFormat.format(date2);
		System.out.println("排序后的时间是=" + dateStr2);
	}

	// 插入排序
	public static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {

			// 定义带插入的数
			int insertVal = arr[i];
			int insertIndex = i - 1;// 即arr[i]前边这个数的下标
			// 给insertVal 找到插入的位置
			// 1.insertIndex >= 0 保证再给insertVal 找插入位置，不越界
			// 2.insertVal < arr[insertIndex] 带插入的数，还没有找到插入位置
			while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
				arr[insertIndex + 1] = arr[insertIndex];
				insertIndex--;
			}
			// 当退出while循环时，说明插入的位置找到，insertIndex+1
			// 举例：理解不了，我们一会debug
			arr[insertIndex + 1] = insertVal;
			//System.out.println("第" + i + "轮插入");
			//System.out.println(Arrays.toString(arr));
		}
	}
}
