package lesson_17.pair;

class Pair {

    private String key;
    private String value;

    public Pair(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" + key + ":" + value + "}";
    }
}

