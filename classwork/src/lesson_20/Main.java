package lesson_20;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            FileLoggerConfiguration configuration = FileLoggerConfigurationLoader.load("config.txt");
            FileLogger logger = new FileLogger(configuration);

            logger.info("This is an info message.");
            logger.debug("This is a debug message.");

            logger.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FileMaxSizeReachedException e) {
            e.printStackTrace();
        }
    }
}

