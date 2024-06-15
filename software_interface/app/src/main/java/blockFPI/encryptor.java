/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockFPI;
import java.security.MessageDigest;

/**
 *
 * @author ayanb,joydeep,rakesh,soumik
 */
public class encryptor { 
    public static String sha256(String input)
    {
        try {
            MessageDigest sha
                = MessageDigest
                      .getInstance(
                          "SHA-256");
            int i = 0;
            byte[] hash
                = sha.digest(
                    input.getBytes("UTF-8"));
            // hexHash will contain
            // the Hexadecimal hash
            StringBuffer hexHash= new StringBuffer();
            while (i < hash.length) {
                String hex
                    = Integer.toHexString(
                        0xff & hash[i]);
                if (hex.length() == 1)
                    hexHash.append('0');
                hexHash.append(hex);
                i++;
            }
            return hexHash.toString();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
