
import java.util.ArrayList;
import java.util.Scanner;
public class mainClass {
  static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
    ArrayList<Integer> ids=new ArrayList<Integer>();
  boolean stop=false;
        int s=100;
        int No_of_truck=0,No_of_buses=0,No_of_cars=0,No_of_motocycles=0;
      Truck p1=new Truck(7,124665);
      Bus p2=new Bus(10,55134);
    Car p3=new Car(5,23546);
    Moto p4=new Moto(2,34565);
    while(true){
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
        
            System.out.println("Enter your vehicle width From {Bus: 10, Truck : 7 , car : 5, Motocycle: 2 } please!");
              int n=input.nextInt();
             if(s<n){
                    System.out.println("No place is Free Sorry sir!!!"); 
                }
             else{
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
         
            
              
              ids.add(d);
                  if(n==7){
                System.out.println("Enter the num of hour please! ");
                  double h=input.nextDouble(); 
                p1.calc(h);
                p1.setWid(n);
               s-=p1.getWid();
                 p1.setId(d);
                No_of_truck++;
            
            }
            else if(n==10) {
             System.out.println("Enter the num of hour please! ");
                  double h=input.nextDouble();
                p2.calc(h);
                p2.setWid(n);
               s-=p2.getWid();
                 p2.setid(d);
                No_of_buses++;
            }
            else if(n==5) { 
              System.out.println("Enter the num of hour please! ");
                     double h=input.nextDouble();
                p3.calc(h);
                p3.setWid(n);
               s-=p3.getWid();
                 p3.setid(d);
                No_of_cars++;}
            else if(n==2){ System.out.println("Enter the num of hour please! ");
                   double h=input.nextDouble();
                p4.calc(h);
                p4.setWid(n);
               s-=p4.getWid();
                 p4.setId(d);
                No_of_motocycles++;}
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
            System.out.println("Enter the Type of  of vehicle leaved from {Truck : 1 , Bus : 2 , Car : 3 , Motocycle :4 }");
          int leaved=input.nextInt();
               if(leaved==1)
            {
              if(No_of_truck>=1)
              {
                s+=p1.getWid();
              }
              else
              {
                System.out.println("There is not any Truck to get out");
              }
            }
            else if(leaved==2)
            {
              if(No_of_buses>=1)
              {
                s+=p2.getWid();
              }
                else{
                System.out.println("There is any Bus  to get out");

                }
            }  
              else if(leaved==3)
            {
              if(No_of_cars>=1)
              {
                s+=p3.getWid();
              }
              else{
                   System.out.println("There is any Car to get out");

            }
          }
            else if(leaved==4)
            { 
              if(No_of_motocycles>=1)
              {
                s+=p4.getWid();
              }
              else{
                  System.out.println("There is not any Motocycle to get out");

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