package patterns.behaviouralPatterns.observerPattern;

public interface Observer {

    // attach with subject to observe
    void setSubject(Subject subject);

    // method to update observer, used by subject
    void update();
}
