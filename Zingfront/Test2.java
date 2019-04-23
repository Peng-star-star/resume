package com.example.springBoot;

public class Test2 {
	public static void main(String[] args) {
		//整数N分解组合
		//开始值start，结束值end
		//则满足条件为N=start+(start+1)+(start+2)+...+end
		//化简为N=(start + end) * (end - start + 1) / 2
		//穷尽组合
		solution(16);
	}
	public static void solution(int n){
		boolean flag = false;
	    for(int startNum = 1; startNum < n; ++startNum){
	        for(int endNum = startNum + 1; endNum < n; endNum ++){
	            int sum = (startNum + endNum) * (endNum - startNum + 1) / 2;
	            if(sum == n){
	                flag = true;
	                for(int i = startNum; i < endNum + 1; ++i){
	                    System.err.print(i+" ");
	                }
	                System.err.println("");
	            }
	        }
	    }
	    if(!flag){
	        System.err.println("NONE");
	    }
	}
}
