import java.util.*;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class bill{
  public static void main(String[] args)throws Exception{
        // Setup file logger
        FileWriter fw = new FileWriter("log.txt", true); // append mode
        PrintWriter logWriter = new PrintWriter(fw, true);

        PrintStream logOut = new PrintStream(new OutputStream() {
        public void write(int b) {
            originalOut.write(b);
            logWriter.write(b);
            }
        });
        System.setOut(logOut);
        
    //String cno;
    int no;
    String name;
    double prev,curr;
    char type;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter consumer number :");
    if(sc.hasNextInt()){
        no = sc.nextInt();
    }
    else{
        System.out.println("Input must be numeric!!");
        return;
    }
    sc.nextLine();

    System.out.println("Enter consumer name :");
    name = sc.nextLine();
    if(name == null){
        System.out.println("Input must be string!!");
        return;
    }
    
    System.out.println("Enter previous month reading :");
    prev = sc.nextDouble();
    while(prev<0){
    System.out.println("Negative value entered !!%nTry again!!");
    prev = sc.nextDouble();
    }
        
    System.out.println("Enter current month reading :");
    curr = sc.nextDouble();
    while(curr<0 || prev>curr){
    System.out.println("Illegal value entered!!");
    System.out.println("Enter again!!");
    curr = sc.nextDouble();
    }
    
    System.out.println("Enter 'd' if the connection is domestic and 'c' if the connection is commercial:");
    type = sc.next().charAt(0);

    logWriter.println("Consumer number : "+no);
    logWriter.println("Consumer name   : "+name);
    logWriter.println("Previous Month reading : "+prev);
    logWriter.println("Current month reading  : "+curr);
    
    if(type == 'd' || type == 'D'){
        logWriter.println("EB connection type : Domestic");
        logWriter.println("Amount to be paid this month : "+domestic(curr,prev));
    }
    else if(type == 'c' || type == 'C'){
        logWriter.println("EB connection type : Commercial");
        logWriter.println("Amount to be paid this month : "+commercial(curr,prev));
 
   }
   else
       System.out.println("Invalid type entered!!");
 }
 

    public static double domestic(double curr,double prev){
       double bill = 0;
       double units = curr-prev;
       if(units<=100)
           bill = 1*units;
       else if(100<units && units<201)
           bill = (1*100)+(2.5*(units-100));
       else if(200<units && units<501)
           bill = (1*100)+(2.5*100)+(4*(units-200));
       else
           bill = (1*100)+(2.5*100)+(4*300)+(6*(units-500));
       return bill;
    }

    public static double commercial(double curr,double prev){
       double bill = 0;
       double units = curr-prev;
       if(units<=100)
           bill = 2*units;
       else if(100<units && units<201)
           bill = (2*100)+(4.5*(units-100));
       else if(200<units && units<501)
           bill = (2*100)+(4.5*100)+(6*(units-200));
       else
           bill = (2*100)+(4.5*100)+(6*300)+(7*(units-500));
       return bill;
    }

}

