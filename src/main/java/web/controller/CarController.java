package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String printCar(@RequestParam(defaultValue = ("5"),value = "count", required = false) Integer count, ModelMap model) {

        List<Car> cars = new CarServiceImp().cars(count);

        model.addAttribute("cars", cars);
        return "cars";
    }

}
