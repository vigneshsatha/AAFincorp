package com.aaf.fincorp.utilities;


import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * A simple example of encrypting some data
 */
public class AESEncryptionDecryption {
	
	public static String cipherTextHex =null;
	public static String rawKeyString = null;
	
    public AESEncryptionDecryption()
    {
    }
    public static void encryptData(String dataToEncrypt) throws Exception {

    	byte[] DATA =dataToEncrypt.getBytes();
        // Create the secret/symmetric key
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        SecretKey skey = kgen.generateKey();
        byte[] raw = skey.getEncoded();
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");

        // Create the cipher for encrypting
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);

        // Encrypt the data
        byte[] encrypted = cipher.doFinal(DATA);
        
        //      converting bytes to hexstring
        cipherTextHex = byte2hex(encrypted);
        rawKeyString = byte2hex(raw);

    }
    
    
    public static String decryptData(byte[] data, byte[] raw) throws Exception{
    	String afterEncode = new String(); 
    try
    {	
    	
    	SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, skeySpec);
		// Decrypt the data
		byte[] decrypted = cipher.doFinal(data);
		afterEncode =  ConvertToString(decrypted);
    }
    catch (Exception e){
    	e.printStackTrace();
    }
    return afterEncode;
}
    
    // converting bytes to hex string
    public static String byte2hex(byte[] b) {
      String hs="";
      String stmp="";
      for (int n=0;n<b.length;n++){
        stmp=(java.lang.Integer.toHexString(b[n] & 0XFF));
        if (stmp.length()==1)
          hs=hs+"0"+stmp;
        else hs=hs+stmp;
      }
    return hs.toUpperCase();
    }
    // converting to hexstring to bytes
    public static byte[] hex2byte(String strhex){
   
      if(strhex==null) return null;
        int l = strhex.length();
   
        if(l %2 ==1) return null;
          byte[] b = new byte[l/2];
          for(int i = 0 ; i != l/2 ;i++){
            b[i] = (byte)Integer.parseInt(strhex.substring(i *2,i*2 +2),16);
          }
    return b;
    }

    private static String ConvertToString(byte[] _bytes)
	{
		char[] result = new char[_bytes.length];

		// Convert each of the characters in the string to byte
		for(int i = 0; i < _bytes.length; i++) {result[i] = (char)_bytes[i];}

		return new String(result);
  
	}
}

