package com.robertwmurphy.everssplus;

public class Planets {

    private String planetID;
    private String region;
    private String constellation;
    private String system;
    private String planetName;
    private String planetType;
    private double orbitRadius;  //Measured in AU's
    private double escapeVelocity; //Measured in km/s
    private double mass; //Measured in kg //TODO Decide on actual measurement for mass as kg will result in numbers to large for double type
    private double temperature; //Measured in degrees Kelvin
    private double density; //Measured in kg/m^3
    private double orbitalPeriod; //Measured in Earth days
    private double radius; //Measured in km
    private double eccentricity; //Measured in decimal with 0 being perfectly circular. Higher means more elliptical.
    private double pressure; //Measured in Pascal (Pa)
    private double surfaceGravity; //Measured in m/s^2

    //Constructor
    public Planets(String planID, String region1, String constellation1, String sys, String planName, String planType,
                double orbitRad, double escVelocity, double mass1, double temp, double density1, double orbitPeriod,
                double radius1, double eccentricity1, double atmoPressure, double surfaceGrav) {
        setPlanetID(planID);
        setRegion(region1);
        setConstellation(constellation1);
        setSystem(sys);
        setPlanetName(planName);
        setPlanetType(planType);
        setOrbitRadius(orbitRad);
        setEscapeVelocity(escVelocity);
        setMass(mass1);
        setTemperature(temp);
        setDensity(density1);
        setOrbitalPeriod(orbitPeriod);
        setRadius(radius1);
        setEccentricity(eccentricity1);
        setPressure(atmoPressure);
        setSurfaceGravity(surfaceGrav);
    }

    //Setters
    public void setPlanetID(String planID) {
        planetID = planID;
    }

    public void setRegion(String region1) {
        region = region1;
    }

    public void setConstellation(String constellation1) {
        constellation = constellation1;
    }

    public void setSystem(String sys) {
        system = sys;
    }

    public void setPlanetName(String planName) {
        planetName = planName;
    }

    public void setPlanetType(String planType) {
        planetType = planType;
    }

    public void setOrbitRadius(double orbitRad) {
        orbitRadius = orbitRad;
    }

    public void setEscapeVelocity(double escVelocity) {
        escapeVelocity = escVelocity;
    }

    public void setMass(double mass1) {
        mass = mass1;
    }

    public void setTemperature(double temp) {
        temperature = temp;
    }

    public void setDensity(double density1) {
        density = density1;
    }

    public void setOrbitalPeriod(double orbitPeriod) {
        orbitalPeriod = orbitPeriod;
    }

    public void setRadius(double radius1) {
        radius = radius1;
    }

    public void setEccentricity(double eccentricity1) {
        eccentricity = eccentricity1;
    }

    public void setPressure(double atmoPressure) {
        pressure = atmoPressure;
    }

    public void setSurfaceGravity(double surfGravity) {
        surfaceGravity = surfGravity;
    }

    //Getters
    public String getPlanetID() {
        return planetID;
    }

    public String getRegion() {
        return region;
    }

    public String getConstellation() {
        return constellation;
    }

    public String getSystem() {
        return system;
    }

    public String getPlanetName() {
        return planetName;
    }

    public String getPlanetType() {
        return planetType;
    }

    public double getOrbitRadius() {
        return orbitRadius;
    }

    public double getEscapeVelocity() {
        return escapeVelocity;
    }

    public double getMass() {
        return mass;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getDensity() {
        return density;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public double getRadius() {
        return radius;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public double getPressure() {
        return pressure;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }


}
