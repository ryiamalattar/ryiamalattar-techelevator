import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TestClass {

	public static void main(String[] args) {
		
//		int arr[] = {1,1,2,5,3,2,4,5,5,5,6};
//		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> newList = new ArrayList<Integer>();
//		Set<Integer> newSet = new LinkedHashSet<Integer>();
//		int [] newArray = new int[arr.length];
//		
//		
//		for (int i =0;i<arr.length;i++) {
//			list.add(arr[i]);
//			newSet.add(arr[i]);
//		}
//		
//		
//		for (int j=0;j<list.size();j++) {
//		for (int i=j+1 ; i< list.size() ;i++ ) {
//			if(list.get(j) == list.get(i)) {
//			list.remove(i);
//			i--;
//		}
//		}
//		newList.add(list.get(j));
//		
//
//	}
//		System.out.println(newList);
//		// below another way
//		Object arr2[] = new Integer[newSet.size()];
//		arr2 = newSet.toArray();
//		for (int j=0;j<list.size();j++) {
//		System.out.println(arr2[j]);
//		}
//		
//	for (int k=0;k<arr.length;k++) {
//		if (k==0) {
//			newArray[k] =arr[arr.length-1];
//		}
//		else if(k==arr.length-1) {
//			newArray[k] = arr[0];
//		}
//		else newArray[k] = arr[k];
//	}
//	for (int k=0;k<arr.length;k++) {
//		System.out.print(newArray[k] + ",");
//	}
		int[] arr = {4,2,3, 5, 6};
		String str = "Next";
	
		
//		System.out.println(isStriclyIncreasing(arr));
//		System.out.println(Array123(arr));
//		System.out.println(reverseString(str));
		System.out.println(returnArr(arr));
	
}

//	private static boolean isStriclyIncreasing(int[] arr) {
//		boolean result =false;
//		int length = arr.length;
//		for(int i=0;i<arr.length-1;i++) {
//			
//				if(arr[i]> arr[i++]) {
//					result=false;
//				}
//				else result = true;
//			
//		}
//		
//		return result;
//	}
//	public static boolean Array123(int[] arr) {
//	
//		
//		boolean result=false;
//		for(int i = 0;i<arr.length;i++) {
//			if(arr[i] == 1 && arr[i+1]==2 && arr[i+2] ==3) {
//				
//				result =true;;
//			}
//			
//		}
//		return result;
//	}
	
//	public static String reverseString(String str) {
//			String newStr="";
//			for(int i= str.length()-1; i>= 0;i--) {
//				newStr = newStr + str.charAt(i);
//			}
//		
//		return newStr;
//	}
	
	public static int[] returnArr(int[] arr) {
//		for(int i = 0;i<arr.length;i++) {
//			if(arr[i]==2 && arr[i+1]==3) {
//				arr[i+1] = 0;
//			}
//		}
//		for(int i = 0;i<arr.length;i++) {
//			System.out.print(arr[i]);
//		}
//		return arr;
		
		int temp;
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1 ;j<arr.length;j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] =arr [j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		return arr;
	}
	//public void sortRandomNumbers(int[] )
}
