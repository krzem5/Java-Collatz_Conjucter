package com.krzem.collatz_conjucter;



import java.util.ArrayList;



public class Main{
	public static void main(String[] args){
		new Main();
	}



	public Main(){
		System.out.println(this.collatz(670617279).length);
	}



	public long[] collatz(long n){
		ArrayList<Long> l=new ArrayList<Long>();
		while (n!=1){
			l.add(n);
			if (n%2==0){
				n/=2;
			}
			else{
				n=n*3+1;
			}
		}
		long[] t=new long[l.size()];
		for (int i=0;i<l.size();i++){
			t[i]=(long)l.get(i);
		}
		return t;
	}
}