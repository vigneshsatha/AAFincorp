package com.aaf.fincorp.utilities;


import com.aaf.fincorp.model.UserVO;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionUtility {
    public UserVO encrypt(UserVO userVO) throws Exception {
    Key key;
    SecureRandom rand = new SecureRandom();
    KeyGenerator generator = KeyGenerator.getInstance("AES");
    generator.init(rand);
    generator.init(256);
    key = generator.generateKey();
    Cipher cipher = Cipher.getInstance("AES");
    cipher.init(Cipher.ENCRYPT_MODE, key);
    userVO.setPwdEncyrpt(cipher.doFinal(userVO.getUserPassword().getBytes()));
    userVO.setPwdKey(key.getEncoded());
    return userVO;
  }

  public String decrypt(byte[] cipherText, byte[] encryptionKey) throws Exception{
    Cipher cipher = Cipher.getInstance("AES");
    SecretKeySpec secretKey = new SecretKeySpec(encryptionKey,"AES");
    cipher.init(Cipher.DECRYPT_MODE, secretKey, cipher.getParameters());
    return new String(cipher.doFinal(cipherText),"UTF-8");
  }
}