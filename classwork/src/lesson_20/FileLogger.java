package lesson_20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

class FileLogger {
    private FileLoggerConfiguration configuration;
    private File logFile;
    private FileWriter writer;

    public FileLogger(FileLoggerConfiguration configuration) throws IOException {
        this.configuration = configuration;
        this.logFile = new File(configuration.getFilePath());
        if (!logFile.exists()) {
            logFile.createNewFile(); // Створюємо файл, якщо він не існує
        }
        this.writer = new FileWriter(logFile, true);
    }

    public void info(String message) throws IOException, FileMaxSizeReachedException {
        if (configuration.getLoggingLevel() == LoggingLevel.DEBUG)
            debug(message);

        log("[INFO] " + message);
    }

    public void debug(String message) throws IOException, FileMaxSizeReachedException {
        log("[DEBUG] " + message);
    }

    private synchronized void log(String message) throws IOException, FileMaxSizeReachedException {
        if (logFile.length() >= configuration.getMaxSize()) {
            throw new FileMaxSizeReachedException("Досягнуто максимального розміру файлу. Максимальний розмір: " + configuration.getMaxSize() + " Поточний розмір: " + logFile.length() + " шлях: " + logFile.getAbsolutePath());
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat(configuration.getFormat());
        String formattedDate = dateFormat.format(new Date());
        writer.write("[" + formattedDate + "] " + message + "\n");
        writer.flush();
    }

    public void close() throws IOException {
        writer.close();
    }
}
