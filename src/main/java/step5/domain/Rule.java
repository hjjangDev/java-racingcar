package step5.domain;

import java.util.List;

public interface Rule {
    void go(Car car);

    void go(Car car, int dice);

    void goCars(List<Car> cars);

}
