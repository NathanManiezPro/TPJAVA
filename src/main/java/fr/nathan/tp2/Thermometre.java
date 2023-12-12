package fr.nathan.tp2;

public class Thermometre {
    private double temperature;

    public Thermometre (double temperature){
        this.temperature = temperature;
    }
    public Thermometre(){
        this(0);
    }

    public double getCelsius(){
        return this.temperature;
    }

    public void setCelsius(double nouvelleTempEnCelsius){
        this.temperature = nouvelleTempEnCelsius;
    }

    public double getKelvin(){
        return this.temperature + 273.15;
    }

    public void setKelvin(double nouvelleTempEnKelvin){
        this.temperature = nouvelleTempEnKelvin - 273.15;
    }

    public double getFahrenheit(){
        return this.temperature *1.8 +32;
    }
    public void setFahrenheit(double nouvelleTempEnFahrenheit){
        this.temperature = (nouvelleTempEnFahrenheit - 32 /1.8 );
    }















/*
    public double getCelsius() {
        return temperature;
    }

    public double getFahrenheit() {
        return temperature;
    }

    public double getKelvin() {
        return temperature;
    }

    public void setCelsius(double temperature) {
        if(typeTemp.equals("Fahrenheit")){
            typeTemp = "Celsius";
            this.temperature = (temperature - 32) / 1.8;
        } else if (typeTemp.equals("Kelvin")) {
            typeTemp = "Celsius";
            this.temperature = (temperature - 273.15);
        }else{
            this.temperature = temperature;
        }
    }
    public void setKelvin(double temperature) {
        if(typeTemp.equals("Fahrenheit")){
            typeTemp = "Kelvin";
            this.temperature = (temperature- 32) / 1.8 + 273.15;
        } else if (typeTemp.equals("Celsius")) {
            typeTemp = "Kelvin";
            this.temperature = temperature + 273.15;
        }
        else {
            this.temperature = temperature;
        }
    }
    public void setFahrenheit(double temperature) {
        if(typeTemp.equals("Kelvin")){
            typeTemp = "Fahrenheit";
            this.temperature = (temperature- 273.15) * 1.8 + 32;
        } else if (typeTemp.equals("Celsius")) {
            typeTemp = "Fahrenheit";
            this.temperature = temperature * 1.8 + 32;
        }
        else {
            this.temperature = temperature;
        }
    }

 */

}
