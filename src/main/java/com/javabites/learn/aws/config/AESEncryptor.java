package com.javabites.learn.aws.config;

import org.springframework.stereotype.Component;
import org.springframework.util.SerializationUtils;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
import java.util.Base64;

@Component
public class AESEncryptor {

 private String dataKey = "RMQKCUMWQUrr6sffD5liumsEXZbG38y1uzgcda+C3rU=";

 byte[] iv = new byte[]{11,13,-2,0,45,1,17,127,44,-45,-54,3};
 private Key getKey(){
     Key key = new SecretKeySpec(Base64.getDecoder().decode(dataKey.getBytes()),"AES");
     return key;
 }

private Cipher getEncryptionCipher() throws GeneralSecurityException {

    Cipher cipher = Cipher.getInstance("AES");
    cipher.init(Cipher.ENCRYPT_MODE,getKey());
    return cipher;
}

    private Cipher getDecryptionCipher() throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE,getKey());
        return cipher;
    }

    public String encrypt(Object object) throws GeneralSecurityException {
       byte[] bytes = SerializationUtils.serialize(object);
       return Base64.getEncoder().encodeToString(getEncryptionCipher().doFinal(bytes));
    }
    public Object decrypt(String dataString) throws GeneralSecurityException {
        byte[] bytes = getDecryptionCipher().doFinal(Base64.getDecoder().decode(dataString));
        return SerializationUtils.deserialize(bytes);
    }

    public static void main(String[] args) throws GeneralSecurityException {
        System.out.println(new AESEncryptor().encrypt("111111111111111111111111111111111111111"));
    }


}
