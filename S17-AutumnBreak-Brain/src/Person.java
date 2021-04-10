public class Person {

    private String name;
    private Brain brain;

    public Person(String name) {
        this.name = name;
        this.brain = new Brain();
    }

    public String getName() {
        return name;
    }

    public int getIQ() {
        return brain.getIQ();
    }

    public boolean doYouRememberThis(String topic) {
        return brain.recall(topic);
    }

    public void learnATopic(String topic) {
        brain.remember(topic);
    }

    public String presentTopic(int number) {
        switch (number) {
            case 1: break;
            case 2: brain.bringPassiveToActive(1); break;
            case 3: brain.bringPassiveToActive(2); break;
        }
        return brain.recall();
    }

    @Override
    public String toString() {
        return "name= " + name + ", activeMem= " + presentTopic(1) + ", passiveOne= " + presentTopic(2) + ", passiveTwo= " + presentTopic(3);
    }
}
