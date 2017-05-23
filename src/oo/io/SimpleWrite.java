package oo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try{
    	FileOutputStream fos = new FileOutputStream("data.txt");
    	fos.write(66);
    	fos.flush();
    }catch(FileNotFoundException e){
    	e.printStackTrace();
    }catch(IOException e){
    	e.printStackTrace();
    }
	}

}
