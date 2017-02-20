package fileIOdemo;

import java.io.UnsupportedEncodingException;

public class EncodeDemo {
	public static void main(String[] args) throws UnsupportedEncodingException{
		
		String s = "雷猴ABC";
		
		byte[] byte1 = s.getBytes();
		//UTF-8编码中，中文占了三个字节，英文字母占用一个字节
		for (byte b : byte1) {
			//把字节转换成了int，以16进制的方式显示
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		
		//GBK编码中，中文占了两个字节，英文字母占用一个字节
		System.out.println();
		byte[] byte2 = s.getBytes("gbk");
		for (byte b : byte2) {
			//把字节转换成了int，以16进制的方式显示
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		
		//utf-16be编码中，中文占了两个字节，英文字母占用两个字节
		System.out.println();
		byte[] byte3 = s.getBytes("utf-16be");
		for (byte b : byte3) {
			//把字节转换成了int，以16进制的方式显示
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		
		//当某字节序列式某种特定编码方式时，若你想将其改成字符串，也需要使用这种编码方式
		System.out.println();
		String str1 = new String(byte3);
		System.out.println(str1);
		//做相应的编码格式转换
		String str2 = new String(byte3, "utf-16be");
		System.out.println(str2);		
		
		/*
		 * 文本文件， 就是字节序列，可以是任意编码的字节序列
		 * 若在中文机器上直接创建文本文件，该文件只能以“ANSI"格式存储
		 */
		
	}
}
