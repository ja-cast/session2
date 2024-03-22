package com.company.models.vehicles;

import java.util.concurrent.TimeUnit;

public class Vehicle {
    private String name;
    private int maxNumberOfPassengers;
    private float maxSpeed;
    private int numberOfWheels;

    //CONSTRUCTOR
    public Vehicle(String name, int maxNumberOfPassengers, float maxSpeed, int numberOfWheels) {
        this.name = name;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        this.maxSpeed = maxSpeed;
        this.numberOfWheels = numberOfWheels;
    }

    //GETTERS & SETTERS
    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }
    public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }
    public float getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //PUBLIC METHODS
    /**
     * Method drive(int hours, int speed)
     * Given the number of hour and speed, the vehicle will drive during the specified period and speed
     * @param  hours  an absolute URL giving the base location of the image
     * @param  speed the location of the image, relative to the url argument
     * @return      response code
     */
    public int drive(int hours, int speed){
        try {
            //Initial validations
            if (speed > this.maxSpeed) {
                System.out.println("Max speed reached");
                return 0;
            }

            long start = System.currentTimeMillis();
            System.out.println("");
            System.out.println("Distance driven: ");
            for (int i = 0; i < hours; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.print("-".repeat(speed));
            }
            long finish = System.currentTimeMillis();
            long timeElapsed = finish - start;

            printTripDetails(timeElapsed/1000, hours*speed, speed);
            return 1;
        }catch(Exception e){
            return 0;
        }
    }
    /**
     * Method drive(int distance, int speed)
     * Given the distance and speed, the vehicle will drive until it reaches the specified distance at the given speed speed
     * @param  distance  an absolute URL giving the base location of the image
     * @param  speed the location of the image, relative to the url argument
     * @return      response code
     */
    public int drive(float distance, int speed){
        int distanceCovered=0;
        try {
            //Initial validations
            if (speed > this.maxSpeed) {
                System.out.println("Max speed reached");
                return 0;
            }

            long start = System.currentTimeMillis();
            System.out.println("");
            System.out.println("Distance driven: ");
            while(distanceCovered<distance){
                TimeUnit.SECONDS.sleep(1);
                distanceCovered+=speed;
                System.out.print("-".repeat(speed));
            }
            long finish = System.currentTimeMillis();
            long timeElapsed = finish - start;

            printTripDetails(timeElapsed/1000, distance, speed);
            return 1;
        }catch(Exception e){
            return 0;
        }
    }
    public void park(){
        System.out.println("Looking for a vehicle parking spot. Vehicle parked");
    }
    public void start(){
        System.out.println("Vehicle started");
    }
    public void stop(){
        System.out.println("Vehicle stopped");
    }

    //PROTECTED METHODS
    public void printTripDetails(float time, float distance, int speed){
        System.out.println("");
        System.out.println("Ride data:");
        System.out.printf("Total time driving: %f h.", time);
        System.out.println("");
        System.out.printf("Distance: %f kms",distance);
        System.out.println("");
        System.out.printf("Speed: %d kms/h",speed);
        System.out.println("");
        System.out.println("");
    }
}
