package patterns.creationalPatterns.singletonPattern;

public final class ImmutableClass {

    public ImmutableClass(String name) {
        this.name = name;
    }

    private final String name;

    public String getName() {
        return name;
    }
}
