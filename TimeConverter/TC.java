package TimeConverter;

public class TC{
    //hours to minutes
    public double hourstominutes(double hours){
        return hours*60;
    }

    //minutes to hours
    public double minutestohours(double minutes){
        return minutes/60;
    }

    //hours to seconds
    public double hourstoseconds(double hours){
        return hours*3600;
    }

    //seconds to hours
    public double secondstohours(double seconds){
        return seconds/3600;
    }
}