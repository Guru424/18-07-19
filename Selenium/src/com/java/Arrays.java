package com.java;

public class Arrays {
public static void main(String[] args) {
	
	int [] arr=new int[5];
	arr[0]=100;
	arr[1]=200;
	arr[2]=600;
	arr[3]=40;
	arr[4]=500;
	
	System.out.println(arr.length);
	
	int max=arr[0];
	int min=arr[0];
	for(int i=1;i< arr.length;i++){
		if(arr[i] > max){
			max=arr[i];
		}
		if(arr[i] < min){
			min=arr[i];
		}
	}
	
	/*for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}*/
	System.out.println("Max value is="+max);
	System.out.println("Min value is="+min);
}
}
