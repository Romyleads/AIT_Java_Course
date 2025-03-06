package homeworks.hw_27.computer;

/*** Author: Roman Romashko Date: 06.03.2025 ***/

public class Comp {
  // Композиция - жесткая связь
private final Proc processor;
private final Mem memory;

// Агрегация - мягкая связь
private Stor storage;

public Comp(Proc processor, Mem memory) {
    this.processor = processor;
    this.memory = memory;
}

public void setStor(Stor storage) {
    this.storage = storage;
}

    @Override
    public String toString() {
        return "Comp{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", storage=" + storage +
                '}';
    }
}
