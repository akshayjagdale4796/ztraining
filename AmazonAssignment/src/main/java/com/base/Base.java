package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base
{

        public WebDriver driver;
        public Properties prop;

        public WebDriver init_driver(){
            String browserName="chrome";
            String amazonUrl=prop.getProperty("url");

            if(browserName.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
                 driver = new ChromeDriver();
            }
            return driver;
        }


        public Properties init_properties(){
            prop = new Properties();
            try {
                FileInputStream ip = new FileInputStream("C:\\Users\\akshay jagdale\\IdeaProjects\\AmazonAssignment\\src\\main\\java\\configuration\\Config.properties");
                prop.load(ip);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return prop;
        }




}
