public class LinearSearch {
	public static void main(String[] args) {

		int[] arr = { 12, 45, 7, 23, 56 };
		int target = 23;

		int index = -1;

		// Linear Search
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {
				index = i;
				break;
			}

		}

		// Output
		if (index != -1) {
			System.out.println("Element found at index " + index);
		} else {
			System.out.println("Element not found");
		}

	}
}