package com.aaf.fincorp.utilities;

import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

import com.sun.org.apache.xml.internal.security.utils.Base64;

public class App {

	public static void main(String[] args) {

		App app = new App();
		try {
			byte[] enc = app.encrypt("sachin");
			String pwd = new String(enc, "UTF-8");
			System.out.println(Base64.encode(enc));
			System.out.println(Base64.decode("zcSHl9cjr8z+IQkw/5tAGw=="));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public byte[] encrypt(String pwd) throws Exception {
		Key key;
		SecureRandom rand = new SecureRandom();
		KeyGenerator generator = KeyGenerator.getInstance("AES");
		generator.init(rand);
		generator.init(256);
		key = generator.generateKey();
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] encpwd = cipher.doFinal(pwd.getBytes());
		byte[] pwdKey = key.getEncoded();
		return encpwd;
	}

	public String decrypt(byte[] cipherText, byte[] encryptionKey)
			throws Exception {
		Cipher cipher = Cipher.getInstance("AES");
		SecretKeySpec secretKey = new SecretKeySpec(encryptionKey, "AES");
		cipher.init(Cipher.DECRYPT_MODE, secretKey, cipher.getParameters());
		return new String(cipher.doFinal(cipherText), "UTF-8");
	}
}
