package lesson_12;


public class FileDate {
    private final String name;
    private final long size;
    private final String path;

    public FileDate(String name, long size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "name=" + name +
                ", size= " + size +
                ", path= " + path +
                "}";
    }
}
