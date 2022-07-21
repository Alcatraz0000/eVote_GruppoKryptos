/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evote;

import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.spec.ECGenParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import java.io.*;
import java.security.*;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.net.ssl.X509KeyManager;
import org.bouncycastle.asn1.*;
import org.bouncycastle.asn1.util.ASN1Dump;

/**
 *
 * @author nando
 */
public class EVote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String name = "secp256k1"; // type of elliptic curve, other examples secp256k1
        KeyPairGenerator key = KeyPairGenerator.getInstance("ECDSA");
        key.initialize(new ECGenParameterSpec(name));
        KeyPairGenerator keyMD = KeyPairGenerator.getInstance("ECDSA");
        keyMD.initialize(new ECGenParameterSpec(name));
        KeyPair keyPair = key.generateKeyPair();
        KeyPair keyPairMD = keyMD.generateKeyPair();
        // you can use this pattern to encrypt concatenation of several objects
        byte[] plainTextPKB = keyPair.getPublic().getEncoded(); // this is the public key to encrypt
        byte[] plainTextSig = "Signature".getBytes(); // here the plaintext is a string but could be
        // a byte array containing a real signature
        byte[] plainTextPreimage = "r1".getBytes(); // this could be the message signed in the signature
        //ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        System.out.print(keyPair.getPublic() + "  "  + keyPairMD.getPrivate() );
                                                    
                                                    
                                                    
    }
    
}
