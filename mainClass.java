
import java.util.ArrayList;
import java.util.Scanner;
public class mainClass {
  static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
      // arraylist for all vehicles
      ArrayList<Integer> ids=new ArrayList<Integer>();
// id for every type of vehicles
    ArrayList<Integer> ids_truck=new ArrayList<Integer>();
    ArrayList<Integer> ids_bus=new ArrayList<Integer>();
    ArrayList<Integer> ids_car=new ArrayList<Integer>();
    ArrayList<Integer> ids_moto=new ArrayList<Integer>();
// time for entering vehicles
    ArrayList<Double> Entering_Time_truck=new ArrayList<Double>();
    ArrayList<Double> Entering_Time_bus=new ArrayList<Double>();
    ArrayList<Double> Entering_Time_car=new ArrayList<Double>();
    ArrayList<Double> Entering_Time_moto=new ArrayList<Double>();
        int s=100;
        int No_of_truck=0,No_of_buses=0,No_of_cars=0,No_of_motocycles=0;
        Truck p1=new Truck(0);
        Bus p2=new Bus(0);
        Car p3=new Car(0);
       Moto p4=new Moto(0);
    while(true){
    boolean stop=false;
        System.out.println("Choose a choice please  ");
        System.out.println("=====================================================");
        System.out.println( " 1->>parking vehicle ");
        System.out.println(" 2->>parking Status ");
        System.out.println(" 3->>leaving vehicle");
        System.out.println(" 4->>Exist");
        System.out.println("=====================================================");
        System.out.println("What is your choice sir ?!! ");
        int x =input.nextInt();
         if(x ==1){
            System.out.println("Enter the id please ");
              int d=input.nextInt();
              for(int i: ids)
              {
                if(i==d)
                {
                  System.out.println("invalid id , this id is existing in another transport you car is stolen");
                   stop=true;
                }
              }
              if(stop==true)
              {
                continue;
              }
              else{
                ids.add(d);
                System.out.println("Enter the time when vehicle entered as 24 system! ");
                System.out.println("the Hour ");
                int hour=input.nextInt();
                System.out.println("and ");
                int min=input.nextInt();
                double alltime=hour+min/60.0;
                System.out.println("Vehicle entered at " + hour +" : "+min);
                System.out.println("Enter Vehicle type from{1:Truck ; 2:Bus ; 3:Car ; 4:Motocycle} please sir !!");
                    int vehicle_type=input.nextInt();
                      if(vehicle_type==1){
                        if(s>=p1.width){
                        Entering_Time_truck.add(alltime);
              
                          s-=p1.getWid();
                            p1.setId(d);
                            ids_truck.add(d);
                            No_of_truck++;
                                  }
                              else
                            {
                              System.out.println("Execuse me! There is not any place to park ");
                            }
                         }
                      else if(vehicle_type==2) {
                        if(s>=p2.width)
                              {
                        Entering_Time_bus.add(alltime);
                     
                      s-=p2.getWid();
                      ids_bus.add(d);
                        p2.setid(d);
                        No_of_buses++;
                    }
                  else
                    {
                      System.out.println("Execuse me! There is not any place to park ");
                    }
                     }
            else if(vehicle_type==3) { 
                        if(s>=p3.width){
                        Entering_Time_car.add(alltime);
                   
                    s-=p3.getWid();
                      p3.setid(d);
                      ids_car.add(d);
                      No_of_cars++;
                    }
                        else
                    {
                      System.out.println("Execuse me! There is not any place to park ");
                    }
              }
            else if(vehicle_type==4) {
                    if(s>=p4.width)
                    {
                      Entering_Time_moto.add(alltime);

                    s-=p4.getWid();
                      p4.setId(d);
                      ids_moto.add(d);
                      No_of_motocycles++;
                    }
                        else
                    {
                      System.out.println("Execuse me! There is not any place to park ");
                    }
            }
             }
            }
        
        else if(x ==2){ 
        if(s<2){
            System.out.println("The parking is occupied ");
        }
        else{
            System.out.println("It find free space is " +s);   
        }
        if(No_of_truck>0||No_of_buses>0||No_of_cars>0||No_of_motocycles>0)
            System.out.println("the number of existing vehicles is : ");
        if(No_of_truck>0){
            System.out.println(No_of_truck+" Trucks");
        }
         if(No_of_buses>0){
            System.out.println(No_of_buses+" Buses");
        }
          if(No_of_cars>0){
            System.out.println(No_of_cars+" cars");
        }
           if(No_of_motocycles>0){
           System.out.println(No_of_motocycles+" Motocycile");
        }
        }
        else if(x==3){
          System.out.println("Enter Leaving time as 24 system");
          System.out.println("the Hour ");
          int leaveHour=input.nextInt();
          System.out.println("and ");
          int leaveMin=input.nextInt();
          double allTimeLeave= leaveHour+leaveMin/60.0;
            System.out.println("Enter the id of  of vehicle leaved");
            int leaved_id=input.nextInt();
            for(int i=0;i<ids_truck.size();i++){
               if(leaved_id==ids_truck.get(i))
                {
                  System.out.println("vehicle which will leave of type truck");
                  s+=p1.getWid();
                    No_of_truck--;
                  System.out.println("this truck costs " +(allTimeLeave- Entering_Time_truck.get(i))*p1.calc());
                  ids.remove(i);
                  ids_truck.remove(i);
                }
              }
        for(int i=0;i<ids_bus.size();i++){
        if(leaved_id==ids_bus.get(i))
        {
          System.out.println("vehicle which will leave of type bus");
          s+=p2.getWid();
            No_of_buses--;
          System.out.println("this bus costs " +(allTimeLeave- Entering_Time_bus.get(i))*p2.calc());
          ids_bus.remove(i);
          ids.remove(i);
        }
      }
        for(int i=0;i<ids_car.size();i++){
        if(leaved_id==ids_car.get(i))
        {
          System.out.println("vehicle which will leave of type car");
          s+=p3.getWid();
            No_of_cars--;
          System.out.println("this car costs " +(allTimeLeave- Entering_Time_car.get(i))*p3.calc());
          ids_car.remove(i);
          ids.remove(i);

        }
      }
      for(int i=0;i<ids_moto.size();i++){
        if(leaved_id==ids_moto.get(i))
        {
          System.out.println("vehicle which will leave of type Motocycle");
          s+=p4.getWid();
            No_of_motocycles--;
          System.out.println("this Motocycle costs " +(allTimeLeave- Entering_Time_moto.get(i))*p4.calc());
          ids.remove(i);
          ids_moto.remove(i);
          }
        }
          }
        else if(x==4) {
          break;
        }
        else {
          System.out.println("Your choice is not true  Try another choice!! ");
        }
    }
  }
}