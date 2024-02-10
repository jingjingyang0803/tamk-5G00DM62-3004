import java.util.Arrays;

class Sorter {
	public int[] sortAscending(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}

	public int[] sortDescending(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		return arr;
	}

	public int findMax(int[] arr) {
		int maxVal = arr[0];
		for(int i: arr) {
			if(i > maxVal) maxVal = i;
		}
		return maxVal;
	}

	public int findMin(int[] arr) {
		int minVal = arr[0];
		for(int i: arr) {
			if(i < minVal) minVal = i;
		}
		return minVal;
	}

	public int findSum(int[] arr) {
		int sum = 0;
		for(int i: arr) {
			sum += i;
		}
		return sum;
	}
}
