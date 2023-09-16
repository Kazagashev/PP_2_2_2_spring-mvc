package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService{

    @Override
    public List<Car> cars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2022));
        cars.add(new Car("Honda", "Stream", 2023));
        cars.add(new Car("Nissan", "Primera", 2024));
        cars.add(new Car("Hyundai", "Solaris", 2025));
        cars.add(new Car("Toyota", "LandCruiser", 2026));
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
