package patterns.singletonPattern;

public class SingletonClass {
    private SingletonClass() {
    }

    private static SingletonClass INSTANCE;

    public static SingletonClass getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonClass.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonClass();
                }
            }
        }
        return INSTANCE;
    }
}
