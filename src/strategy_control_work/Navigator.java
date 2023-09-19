package strategy_control_work;

import java.util.List;

public class Navigator {
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public List<Point> calculateRoute(Point startPoint, Point endPoint) {
        return routeStrategy.calculateRoute(startPoint, endPoint);
    }
}
