package iterations;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
	public static void main (String[] args) {
		List<String> binaryNums = new ArrayList<>();
		/*binaryNums.add(Integer.toBinaryString(1100));
		binaryNums.add(Integer.toBinaryString(32));
		binaryNums.add(Integer.toBinaryString(255));
		binaryNums.add(Integer.toBinaryString(256));
		binaryNums.add(Integer.toBinaryString(561892));
		binaryNums.add(Integer.toBinaryString(1));*/
		binaryNums.add(Integer.toBinaryString(5));
		
		binaryNums.forEach(el -> {
			String[] binaryGapStrings = el.split("1", -1);
			System.out.println("Longest binary gap: " + findLongestGap(binaryGapStrings)+", in :" + el);
			System.out.println("---------------------------------------------");
		});
		
	}

	private static int findLongestGap(String[] gaps){
		int longestGap = 0;
		for(int index =1; index < gaps.length - 1; index++) {
			int l = gaps[index].length();
			if(l > longestGap)
				longestGap = l;
		}
		return longestGap;
	}

}
