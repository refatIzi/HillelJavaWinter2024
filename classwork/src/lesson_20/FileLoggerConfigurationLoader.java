package lesson_20;

import java.io.*;

class FileLoggerConfigurationLoader {
    public static FileLoggerConfiguration load(String filename) throws IOException {
        File configFile = new File(filename);
        if (!configFile.exists()) {
            createDefaultConfigFile(filename); // Створюємо файл конфігурації, якщо його не існує
        }

        BufferedReader reader = new BufferedReader(new FileReader(configFile));
        String filePath = null;
        LoggingLevel loggingLevel = null;
        long maxSize = 0;
        String format = null;

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(": ");
            if (parts.length != 2) {
                throw new IllegalArgumentException("Недійсний формат файлу конфігурації.");
            }

            switch (parts[0]) {
                case "FILE":
                    filePath = parts[1];
                    break;
                case "LEVEL":
                    loggingLevel = LoggingLevel.valueOf(parts[1]);
                    break;
                case "MAX-SIZE":
                    maxSize = Long.parseLong(parts[1]);
                    break;
                case "FORMAT":
                    format = parts[1];
                    break;
                default:
                    throw new IllegalArgumentException("Невідомий ключ конфігурації: " + parts[0]);
            }
        }

        reader.close();

        return new FileLoggerConfiguration(filePath, loggingLevel, maxSize, format);
    }

    // Метод для створення файлу конфігурації за замовчуванням
    private static void createDefaultConfigFile(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write("FILE: default.log\n");
        writer.write("LEVEL: INFO\n");
        writer.write("MAX-SIZE: 1024\n");
        writer.write("FORMAT: yyyy-MM-dd HH:mm:ss\n");
        writer.close();
    }
}
