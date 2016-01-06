package com.aaf.fincorp.utilities;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Encryption {
	public static void main(String args[]){

    
		try{
		    String passWord=null;
		    String pwdNameKey=null;
			String pwd=null;

		    System.out.print("Enter Data to Encrypt : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            pwd = br.readLine();
		    AESEncryptionDecryption.encryptData(pwd);
			passWord = AESEncryptionDecryption.cipherTextHex;
			pwdNameKey = AESEncryptionDecryption.rawKeyString;
			System.out.print("Encrypted Data : " + passWord);
			System.out.println();
		    System.out.println("Encrypted Data Key :  "+ pwdNameKey);  
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
