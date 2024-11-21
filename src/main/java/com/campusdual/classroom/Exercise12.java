package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", "Gasolina");
        System.out.println("Detalles del coche:");
        myCar.showDetails();
        myCar.start();
        System.out.println("Tachómetro después de arrancar: " + myCar.tachometer);
        myCar.showDetails();
        System.out.println("Acelerando...");
        myCar.accelerate();
        System.out.println("Velocidad actual: " + myCar.speedometer + " km/h");
        myCar.showDetails();
        System.out.println("Frenando...");
        myCar.brake();
        System.out.println("Velocidad después de frenar: " + myCar.speedometer + " km/h");
        myCar.showDetails();
        System.out.println("Girando el volante 20 grados...");
        myCar.turnAngleOfWheels(20);
        System.out.println("Ángulo actual de las ruedas: " + myCar.wheelsAngle + "°");
        myCar.showDetails();
        System.out.println("Intentando girar el volante 60 grados...");
        myCar.turnAngleOfWheels(60);
        System.out.println("Ángulo actual de las ruedas: " + myCar.wheelsAngle + "°");
        myCar.showDetails();
        System.out.println("Poniendo marcha atrás...");
        myCar.setReverse(true);
        System.out.println("Marcha actual: " + myCar.gear);
        myCar.showDetails();
        System.out.println("Intentando poner marcha atrás mientras el coche está en movimiento...");
        myCar.accelerate();  // Acelera el coche
        myCar.setReverse(true);  // No debería permitirlo
        System.out.println("Marcha actual: " + myCar.gear);
        myCar.showDetails();
        System.out.println("Deteniendo el coche...");
        myCar.stop();
        System.out.println("Tachómetro después de detener el coche: " + myCar.tachometer);
        myCar.showDetails();
    }

}