package Utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
        private static FileInputStream inputn;
        private static Properties properties;
    static{
        String path = System.getProperty("user.dir")+"/src/test/java/resources/Configurations/Configuration.properties";
        try {
      inputn= new FileInputStream(path);
           properties =new Properties();
            properties.load(inputn);
        }catch(Throwable t){
            System.out.println(t.getMessage());
        }finally {
            try {
                inputn.close();
            } catch (IOException e) {
                System.out.println("execpetion occured while closing input object");            }
        }

    }
    public static String getProperty(String key){ //configureation.properties -> key -> url name
        return properties.getProperty(key);         //configureation.properties -> value ->url
    }
}
