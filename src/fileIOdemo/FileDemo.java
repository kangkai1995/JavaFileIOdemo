package fileIOdemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\i333104\\Documents\\My Received Files");
		//是否是一个目录，若是目录返回true，不是目录或者目录不存在返回false
		System.out.println(file.isDirectory());
		//是否是一个文件
		System.out.println(file.isFile());
		
		File file2 = new File("C:\\Users\\i333104\\Documents\\My Received Files\\1.txt");
		if(file2.exists()){
			file2.delete();
		}else {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//File中有很多常用的API，可以获取相应的信息
		System.out.println(file);
		System.out.println(file.getParent());
	}

}
