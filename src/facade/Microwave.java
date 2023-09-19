package facade;

public class Microwave implements DriveListener, PowerListener {
    private Drive drive;
    private Power power;
    private Notification notification;

    public Microwave(Drive drive, Power power, Notification notification) {
        this.drive = drive;
        this.power = power;
        this.notification = notification;

        drive.addDriveListener(this);
        power.addPowerListener(this);
    }

    public void cook() {
        notification.setMessageFin("Приготовление началось");
        power.setMicrowavePower(500); // Средняя мощность
        for (int i = 0; i < 3; i++) {
            drive.turnRight();
            drive.turnLeft();
        }
        // Подождем 2 минуты (время в миллисекундах)
        try {
            Thread.sleep(2 * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        power.setMicrowavePower(0); // Выключаем
        notification.setMessageFin("Приготовление завершено");
    }

    public void defrost() {
        notification.setMessageFin("Операция началась");
        power.setMicrowavePower(1000);
        drive.turnRight();
        drive.turnRight();
        power.setMicrowavePower(500);
        drive.stop();
        drive.turnLeft();
        drive.turnLeft();
        power.setMicrowavePower(200);
        drive.stop();
        drive.turnRight();
        drive.turnRight();
        drive.stop();
        power.setMicrowavePower(0);
        notification.setMessageFin("Операция завершена");
    }

    @Override
    public void driveTwisted(Drive drive) {
        System.out.println(drive.toString());
    }

    @Override
    public void powerChanged(Power power) {
        System.out.println(power.toString());
    }
}

