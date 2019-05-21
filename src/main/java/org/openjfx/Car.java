package org.openjfx;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private Integer volume;

    public Car(String brand, String model, Integer volume) {
        this.brand = brand;
        this.model = model;
        this.volume = volume;

        // TODO if volume <= 0 throw exception
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(volume, car.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, volume);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                '}';
    }
}
