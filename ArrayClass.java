
public class ArrayClass {
	
	public static int search(int[] arr, int val) {
//		Method search searches array arr for value val and 
//		return the index of the first occurrence of it. 
//		For example search(new []{4, 3, 6, 2, 6, 8, 9}, 6) 
//		returns 2. If val does not appear in arr, it returns -1.
        int i = 0;
		
		if (arr == null) { 
            return -1; 
        }  
  
        while (i < arr.length) { 
  
            if (arr[i] == val) { 
                return i; 
            } else { 
                i = i + 1; 
            } 
        } 
        
        return -1; 
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIdx = i;
			for (int j = minIdx + 1; j < arr.length; j++)
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			int tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;
		}
	}

	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (arr[i] < min)
				min = arr[i];
		return min;
	}

	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}
}
