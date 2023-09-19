package strategy_control_work;

import java.util.List;

abstract public class RouteStrategy {
   abstract public List<Point> calculateRoute(Point startPoint, Point endPoint);
}
