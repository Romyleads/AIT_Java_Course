package homeworks.hw_27.components;

/*** Author: Roman Romashko Date: 06.03.2025 ***/

public class Computer {
    private String model;
    private Processor processor;  // композиция
    private Memory memory; // композиция
    private Storage storage; // агрегация

    public Computer(String model, Storage storage) {
        this.model = model;
        this.storage = storage;

        this.processor=new Processor("AMD","AMD-01");
        this.memory=new Memory("Samsung", "M-02",32);
    }

    public Computer(String model, Storage storage, int memoryCapacity) {
        this.model = model;
        this.storage = storage;

        this.processor=new Processor("AMD","AMD-01");
        this.memory=new Memory("Samsung", "M-02",32);
    }

    public String toString(){
      return String.format("Computer:{model: %s, processor: %s, memory: %s, storage: %s}", model,processor.toString(), memory.getSize(),storage.toString());
    }
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public String getModel() {
        return model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }


}
