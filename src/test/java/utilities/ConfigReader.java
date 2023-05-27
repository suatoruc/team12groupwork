package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
   static Properties properties;
   static {
       String filePath="src/test/Configurations.properties";


       try {
           FileInputStream fileInputStream=new FileInputStream(filePath);
           properties=new Properties();
           properties.load(fileInputStream);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }


   }

   public static String getProperty(String key){
       String value=properties.getProperty(key);
   return value;
   }



}
