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

/**
 *
 * @author JOYDEEP
 */
public class connectionfirebase {
    public static void connector_firebase() throws FileNotFoundException, IOException
    {FileInputStream serviceAccount =
new FileInputStream("fpiblockchain.json");

FirebaseOptions options = new FirebaseOptions.Builder()
  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
  .setDatabaseUrl("https://fpiblockchain-default-rtdb.firebaseio.com")
  .build();

FirebaseApp.initializeApp(options);

    }
    
}
