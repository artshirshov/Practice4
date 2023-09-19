package template_method;

public class Program {
        public static void main(String[] args) {
            int f = 5, l = 20, h = 3; // Здесь введите значения границ диапазона и шага для арифметической прогрессии
            Progression arithmeticProgression = new ArithmeticProgression(f, l, h);
            arithmeticProgression.templateMethod();

            int a = 2, r = 3, n = 5; // Здесь введите начальный член, множитель и количество членов для геометрической прогрессии
            Progression geometricProgression = new GeometricProgression(a, r, n);
            geometricProgression.templateMethod();
        }
}
