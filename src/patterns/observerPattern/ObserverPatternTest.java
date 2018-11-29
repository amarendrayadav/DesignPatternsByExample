package patterns.observerPattern;

public class ObserverPatternTest {
    public static void main(String[] args) {
        MyTopic topic = new MyTopic();
        //create observers
        Observer obj1 = new MyTopicSubscriber("Obj1");
        topic.register(obj1);
        obj1.setSubject(topic);
        Observer obj2 = new MyTopicSubscriber("Obj2");
        topic.register(obj2);
        obj2.setSubject(topic);
        Observer obj3 = new MyTopicSubscriber("Obj3");
        topic.register(obj3);
        obj3.setSubject(topic);
        obj1.update();

        topic.postMessage("New Message!");
    }
}
