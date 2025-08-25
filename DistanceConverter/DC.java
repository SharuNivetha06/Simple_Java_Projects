package DistanceConverter;

public class DC{
    // meter to km
    public double metertokm(double meter){
        return meter*0.001;
    }

    //km to meter
    public double kmtometer(double km){
        return km*1000;
    }

    //miles to km
    public double milestokm(double miles){
        return miles*1.60934;
    }

    //km to miles
    public double kmtomiles(double km){
        return km*0.621371;
    }
}