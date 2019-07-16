package com.kent.ojkk.video;

public class test {
	public static void main(String[] args) {
	 
		
		
		String strIn = "6224830214527858";
		
		byte[] arrB = strIn.getBytes();
		int iLen = arrB.length;

		// 两个字符表示一个字节，所以字节数组长度是字符串长度除以2
		byte[] arrOut = new byte[iLen / 2];
		for (int i = 0; i < iLen; i = i + 2) {
			String strTmp = new String(arrB, i, 2);
			arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
		}
		
		for(byte a : arrOut) {
			
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
