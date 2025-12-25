package withoutstartegy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(checkForPalendrome(arr[i])) {
				System.out.println("palendrome is"+arr[i]);
			}
		}
	}
	public static boolean checkForPalendrome(String str) {
		int start=0;
		int end=str.length()-1;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
