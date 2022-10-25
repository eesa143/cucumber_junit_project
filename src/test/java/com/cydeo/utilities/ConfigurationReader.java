package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// this class is only one time we are creating in utilities package
// we will just call getProperty method with this class name


public class ConfigurationReader {

    //1 - create the object of Properties class
    // we need properties class to use methods coming from class like load(), getProperty("key")
    // it is static because we are using it in static method
    // it is private bcz I will be using it only in this class
    private static Properties properties = new Properties();

static {


        try {

        //2 - Create the object of FileInputStream
        // we need this object to open files as a stream in Java memory
        FileInputStream file = new FileInputStream("config.properties");

        //3 - Load the properties object using FileInputStream object
        // Load "properties" object with the "file" we opened using FileInputStream
        properties.load(file);

        // close the file after loading
            // if we do not close the file, it will take space from computer memory like Scanner
            file.close();

    }catch(IOException e){
            e.printStackTrace();

    }
    }

    /**
     * This method is used to read value from a configuration.properties file
     * @param keyword -- > key name in configuration.properties file
     * @return --> value for the key. returns null if key is not found
     * driver.get(ConfigurationReader.getProperty("env")
     */
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);

    }
}

