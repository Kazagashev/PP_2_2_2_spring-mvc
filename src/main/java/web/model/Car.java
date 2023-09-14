package web.model;

public class Car {
    private String brand;
    private String modelName;
    private int age;

    public Car(String brand, String modelName, int age) {
        this.brand = brand;
        this.modelName = modelName;
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", modelName='" + modelName + '\'' +
                ", age=" + age +
                '}';
    }
}
