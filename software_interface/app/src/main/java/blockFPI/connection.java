/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockFPI;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author ayanb,joydeep,rakesh,soumik
 */
public class connection {
    static boolean val = true;
    public static void initfirebase(){
        if(val==true){
            val=false;
            FileInputStream refreshToken = null;
    try{  
    refreshToken = new FileInputStream("src/main/Resources/fpiblockchain.json");
    FirebaseOptions options = FirebaseOptions.builder()
    .setCredentials(GoogleCredentials.fromStream(refreshToken))
    .setDatabaseUrl("https://soft-fpi-default-rtdb.firebaseio.com/")
    .build();
    FirebaseApp.initializeApp(options);
    }catch (FileNotFoundException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
    try{
                refreshToken.close();
            } catch(IOException ex){
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
    }
    }
    
}
