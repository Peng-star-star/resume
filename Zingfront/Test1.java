package com.example.springBoot;

public class Test1 {
	public static void main(String[] args) {
		//拆分字符串，两次循环比较字符串
		//不考虑字符串不符合描述的情况
		String a = "This is C programming text";
		String b = "This is a text for C programming";
		String[] aArray = a.split(" ");
		String[] bArray = b.split(" ");
		System.err.println(getWord(aArray,bArray));
	}
	public static String getWord(String[] aArray,String[] bArray){
		for(String aWord : aArray){
			for(String bWord : bArray){
				if(aWord.equals(bWord)){
					return aWord;
				}
			}
		}
		return null;
	}
}
