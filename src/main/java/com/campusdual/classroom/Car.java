package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED=120;
    public String fuel;
    public int speedometer=0;
    public int tachometer=0;
    public String gear="N";
    public boolean reverse =false;
    public int wheelsAngle=0;
    public Car() {
        this.brand = "Default Brand";
        this.model = "Default Model";
        this.fuel = "Gasoline";
    }

    public Car(String brand,String model,String fuel){
        this.brand=brand;
        this.model=model;
        this.fuel=fuel;
    }
    public void start(){
        if(this.tachometer==0){
            this.tachometer=1000;
            System.out.println("Vehículo acedido");
        }else{
            System.out.println("O vehículo xa está acendido");
        }
    }
    public void stop(){
        if(this.speedometer==0){
            this.tachometer=0;
            System.out.println("Vehículo apagado");
        }else{
            System.out.println("Non se pode apagar o vehículo, primero ten que estar detido");
        }
    }
    public boolean isTachometerGreaterThanZero(){
        return this.tachometer>0;
    }
    public boolean isTachometerEqualToZero(){
        return this.tachometer==0;
    }

    public void accelerate(){
        if(this.speedometer<MAX_SPEED){
                this.speedometer+=10;
                if (this.speedometer>=MAX_SPEED){
                    this.speedometer=MAX_SPEED;
                }
        }else{
            this.speedometer=MAX_SPEED;
        }
    }
    public void brake(){
        if(this.speedometer>0){
            this.speedometer-=10;
            if (this.speedometer<=0){
                this.speedometer=0;
            }
        }else{
            this.speedometer=0;
        }
    }
    public void turnAngleOfWheels(int angle){
        this.wheelsAngle+=angle;
        if(this.wheelsAngle>45){
            this.wheelsAngle=45;
        }else if(this.wheelsAngle<-45){
            this.wheelsAngle=-45;
        }
    }
    public String showSteeringWheelDetail(){
        return "El angulo ahora es de: "+this.wheelsAngle;
    }
    public boolean isReverse(){
        return this.reverse;
    }
    public void setReverse(boolean reverse){
        if (this.speedometer == 0) {
            this.reverse = reverse;
            this.gear = "R";
        } else {
            System.out.println("No se puede poner marcha atrás mientras el coche está en movimiento");
        }
    }
    public void showDetails(){
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Combustible: " + this.fuel);
        System.out.println("Velocidad actual: " + this.speedometer + " km/h");
        System.out.println("Tacómetro: " + this.tachometer);
        System.out.println("Marcha: " + this.gear);
    }




}
//Objetivos
//Girar el volante 20 grados
//Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
//Detener el coche y poner marcha atrás
//Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)