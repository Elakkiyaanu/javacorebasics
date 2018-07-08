package com.basic;

public class PossibbleWords {
	public static void main(String[] args) {
		PossibbleWords p=new PossibbleWords();
		p.identifyPossible(args[0],args[1]);
		
	}

	private void identifyPossible(String a,String b) {
		a=a.toUpperCase();
		b=b.toUpperCase();
		String []a1=a.split("_");
		//System.out.println(a1[0]+" "+a1[1]);
		String []b1=b.split(":");
		int len1=a.length();
		int len2=b1.length;
		int k=0;
		String[] c=new String[len2];
		for(int i=0;i<len2;i++) {
			if(a.endsWith("_")) {
				if(len1==b1[i].length()) {
					if(b1[i].startsWith(a1[0])){
						c[k]=b1[i];
						k++;
					}
				}
			}
			else if(len1==b1[i].length()) {
				if((b1[i].startsWith(a1[0])&&(b1[i].endsWith(a1[1])))) {
					c[k]=b1[i];
					k++;
				}
			}
		}
		if(c[0]==null) {
			System.out.println("ERROR");
		}
		int count=0;
		for(int e=0;e<c.length;e++) {
			if(c[e]!=null) {
				count++;
			}
		}
		for(int e1=0;e1<count;e1++) {
			System.out.print(c[e1]);
			if(e1<count-1) {
				System.out.print(":");
			}
		}
	}

}
