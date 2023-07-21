package task2.model;

public class Phone <T>{

    private String brand;
    private int memory;

    public Phone(String brand, int memory) {
        this.brand = brand;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", memory=" + memory +
                '}';
    }
}
