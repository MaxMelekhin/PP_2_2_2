package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private static int carCount;
    private List<Car> carList;

    {
        this.carList = new ArrayList<>();
        carList.add(new Car(++carCount, "model1", 1));
        carList.add(new Car(++carCount, "model2", 2));
        carList.add(new Car(++carCount, "model3", 3));
        carList.add(new Car(++carCount, "model4", 4));
        carList.add(new Car(++carCount, "model5", 5));
    }

    public CarDaoImpl() {
    }

    public List<Car> getCars(int count) {
        return carList.stream().limit(count).toList();
    }
}
