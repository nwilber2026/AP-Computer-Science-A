/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicleinheritance;

/**
 *
 * @author NWilber2026
 */



//------------------------------------------------------------------------------
//Car Imported Code
//------------------------------------------------------------------------------    

// Car Class inherits from Vehicle Class
    public class Car extends Vehicle
    {
        int wheels = 4;
        String color = "White";
        boolean spoiler = false;
        boolean stereo = false;
        double mpg = 0.0; //has an extra variable, mpg
        public Car(String inBrand, double inSpeed, int inPassengers, double inCargo,
        double inMPG)
        {
            constructor
        }
    }
     
    `   public boolean getSpoiler()
        {
            return spoiler;
        }
    
        //another additional variable
        public void setStereo(boolean inStereo)
        {
            stereo = inStereo;
        }
        
        public boolean getStereo()
        {
            return stereo;
        }

//overrides the super getSpeed method
    @Override
        public double getSpeed() 
        {
            if (spoiler)
            else
        }

        public void setMpg(double mpg) 
        {
            this.mpg = mpg;
        }

        public double getMPG()
        {
        if(stereo)
        else
        }

//usesd the super toString, as well as addingnthe new variable to it.
    public String toString()
    {
        String result = super.toString() +
        "MPG :\t\t\t" + this.getMPG();
        return result ;
    }

    return mpg - (mpg / 10);
    return mpg;
    return super.getSpeed() + 20;
    return super.getSpeed();
    super(inBrand, inSpeed, inPassengers, inCargo); //uses the super
    mpg = inMPG; //also include the extra variable in the Car constructor
    //another additional variable
    public void setSpoiler(boolean inSpoiler){
    spoiler = inSpoiler;    
    
   

//------------------------------------------------------------------------------
//Vehicle Imported Code
//------------------------------------------------------------------------------

// The Base Vehicle Class, implements the Speedometer interface
public class Vehicle implements Speedometer{
//base (Class wide) variables
protected String brandName = "";
protected double speed = 0.0;
protected int passengers = 0;
protected double cargoWeight = 0.0;
//Base default constructor
public Vehicle(){
brandName = "";
speed = 0.0;
passengers = 0;
cargoWeight = 0.0;
}
public Vehicle(String inBrand, double inSpeed, int inPassengers, double
inCargo){
brandName = inBrand;
speed = inSpeed;
passengers = inPassengers;
cargoWeight = inCargo;
}
//getters and setters
public Vehicle(String inBrand){
brandName = inBrand;
}
public String getBrand(){
return brandName;
}
public void setBrandName(String inBrand){
brandName = inBrand;
}
public double getSpeed(){
return speed;
}
public void setSpeed(double inSpeed){
speed = inSpeed;
}
public int getPassengers(){
return passengers;
}
public void setPassengers(int inPassengers){
speed = inPassengers;
}
public double getCargoWeight(){
return cargoWeight;
}
public void setCargoWeight(double inCargoWeight){
cargoWeight = inCargoWeight;
}
//Base toString
public String toString(){
String result = "";
result = "Brand: \t\t\t" + getBrand() + "\n" +
"Speed (mph): \t" + getSpeed() + "\n" +
"Passengers: \t" + getPassengers() + "\n" +
"Cargo (lbs): \t" + getCargoWeight() + "\n";
return result;
}
}
//the Speedometer interface to show the speed of any vehicle in the same way
interface Speedometer{
public void setSpeed(double inSpeed);
public double getSpeed();
}