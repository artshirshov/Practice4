package strategy_control_work;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new CarRouteStrategy());

        Point startPoint = new Point(0, 0); // Начальная точка
        Point endPoint = new Point(10, 10); // Конечная точка

        List<Point> carRoute = navigator.calculateRoute(startPoint, endPoint);

        // Переключение на другую стратегию
        navigator.setRouteStrategy(new WalkingRouteStrategy());
        List<Point> walkingRoute = navigator.calculateRoute(startPoint, endPoint);

        // Другие операции с маршрутами
    }
}

