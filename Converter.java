import CurrencyConverter.CC;
import DistanceConverter.DC;
import TimeConverter.TC;
import java.util.*;

public class Converter{
    public static void main(String[] args){
        //variables
        int c1,c2;
        double d;
        //object creation
        CC cc = new CC();
        DC dc = new DC();
        TC tc = new TC();
        Scanner sc = new Scanner(System.in);
        //Code
        do{
        System.out.println(" ");
        System.out.print("1.Currency Converter\n2.Distance Converter\n3.Time Converter\n4.Exit\nEnter your choice : ");
        c1= sc.nextInt();
        System.out.println(" ");
        switch(c1){
            case 1:
                System.out.print("1.Dollar to INR\n2.INR to Dollar\n3.Euro to INR\n4.INR to Euro\n5.Yen to INR\n6.INR to Yen\nEnter your choice : ");
                c2 = sc.nextInt();
                System.out.println(" ");
                switch(c2){
                    case 1:
                        System.out.print("Enter the value to be coverted : ");
                        d = sc.nextDouble();
                        System.out.println(d+" Dollars = "+(cc.dollartoinr(d))+" INR");
                        break;
                    case 2:
                        System.out.print("Enter the value to be coverted : ");
                        d = sc.nextDouble();
                        System.out.println(d+" INR = "+(cc.inrtodollar(d))+" Dollars");
                        break;
                    case 3:
                        System.out.print("Enter the value to be coverted : ");
                        d = sc.nextDouble();
                        System.out.println(d+" Euro = "+(cc.eurotoinr(d))+" INR");
                        break;
                    case 4:
                        System.out.print("Enter the value to be coverted : ");
                        d = sc.nextDouble();
                        System.out.println(d+" INR = "+(cc.inrtoeuro(d))+" Euro");
                        break;
                    case 5:
                        System.out.print("Enter the value to be coverted : ");
                        d = sc.nextDouble();
                        System.out.println(d+" Yen = "+(cc.yentoinr(d))+" INR");
                        break;
                    case 6:
                        System.out.print("Enter the value to be coverted : ");
                        d = sc.nextDouble();
                        System.out.println(d+" INR= "+(cc.inrtoyen(d))+" Yen");
                        break;
                    default:
                        System.out.println("Invalid choice entered!!");
                        break;
                    
                
                }
                break;

            case 2:
                System.out.print("1.Meter to Km\n2.Km to Meter\n3.Miles to Km\n4.Km to Miles\nEnter your choice : ");
                c2 = sc.nextInt();
                System.out.println(" ");
                switch(c2){
                    case 1:
                        System.out.print("Enter the value to be converted : ");
                        d = sc.nextDouble();
                        System.out.println(d+" meter  = "+(dc.metertokm(d))+" km");
                        break;
                    case 2:
                        System.out.print("Enter the value to be converted : ");
                        d = sc.nextDouble();
                        System.out.println(d+" km  = "+(dc.kmtometer(d))+" meter");
                        break;
                    case 3:
                        System.out.print("Enter the value to be converted : ");
                        d = sc.nextDouble();
                        System.out.println(d+" miles  = "+(dc.milestokm(d))+" km");
                        break;
                    case 4:
                        System.out.print("Enter the value to be converted : ");
                        d = sc.nextDouble();
                        System.out.println(d+" km  = "+(dc.kmtomiles(d))+" miles");
                        break;
                    default:
                        System.out.println("Invalid choice entered!!");
                        break;

                }
                break;

            case 3:
                System.out.print("1.Hours to Minutes\n2.Minutes to Hours\n3.Hours to Second\n4.Seconds to Hours\nEnter your choice : ");
                c2 = sc.nextInt();
                System.out.println(" ");
                switch(c2){
                    case 1:
                        System.out.print("Enter the value to be converted : ");
                        d = sc.nextDouble();
                        System.out.println(d+" Hours = "+(tc.hourstominutes(d))+" Minutes ");
                        break;
                    case 2:
                        System.out.print("Enter the value to be converted : ");
                        d = sc.nextDouble();
                        System.out.println(d+" Minutes = "+(tc.minutestohours(d))+" Hours ");
                        break;
                    case 3:
                        System.out.print("Enter the value to be converted : ");
                        d = sc.nextDouble();
                        System.out.println(d+" Hours = "+(tc.hourstoseconds(d))+" Seconds ");
                        break;
                    case 4:
                        System.out.print("Enter the value to be converted : ");
                        d = sc.nextDouble();
                        System.out.println(d+" Seconds = "+(tc.secondstohours(d))+" Hours ");
                        break;
                    default:
                        System.out.println("Invalid choice entered!!");
                        break;
                }
                break;

            case 4:
                System.out.println("Program Terminated...");
                break;

            default:
                System.out.println("Invalid choice entered!!\nTry again;");
                break;


        }


    }while(c1!=4);
}
}