package lesson_12;

import java.util.*;
import java.util.stream.Collectors;

public class FileNavigator {

    private final HashMap<String, List<FileDate>> fileNavigator;

    public FileNavigator() {
        this.fileNavigator = new HashMap<>();
    }

    public void add(String path, FileDate fileData) {
        if (fileData.getPath().equals(path)) {
            List<FileDate> fileDataList = fileNavigator.computeIfAbsent(path, k -> new ArrayList<>());
            fileDataList.add(fileData);
        } else {
            System.out.println("Виникла помилка перевірте введені данні: " + path + " " + fileData );
        }
    }

    public List<FileDate> find(String path) {
        return fileNavigator.get(path);
    }

    public List<FileDate> filterBySize(long size) {
        return fileNavigator.values().stream()
                .flatMap(Collection::stream)
                .filter(f -> f.getSize() <= size)
                .collect(Collectors.toList());
    }

    public List<FileDate> remove(String path) {
        return fileNavigator.remove(path);
    }

    public List<FileDate> sortBySize() {
        return fileNavigator.values().stream()
                .flatMap(Collection::stream)
                .sorted(Comparator.comparing(FileDate::getSize)
                        .thenComparing(FileDate::getName)
                        .thenComparing(FileDate::getPath))
                .collect(Collectors.toList());
    }

    public void print() {
        for (Map.Entry<String, List<FileDate>> entry : fileNavigator.entrySet()) {
            System.out.println(entry);
        }
    }
}
