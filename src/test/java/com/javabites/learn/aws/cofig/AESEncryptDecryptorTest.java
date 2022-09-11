package com.javabites.learn.aws.cofig;

import com.javabites.learn.aws.config.AESEncryptDecryptor;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class AESEncryptDecryptorTest {

    public static void main(String[] args) throws GeneralSecurityException {
        AESEncryptDecryptor ae = new AESEncryptDecryptor();
        String enc = ae.encrypt("test");
        Object dnc = ae.decrypt(enc);

        System.out.println(enc);
        System.out.println(dnc);
    }
}
