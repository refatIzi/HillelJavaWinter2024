package lesson_20;

class FileMaxSizeReachedException extends Exception {
    public FileMaxSizeReachedException(String message) {
        super(message);
    }
}
