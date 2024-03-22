package com.company;

import com.company.models.vehicles.Motorcycle;
import com.company.models.vehicles.PickUpTruck;
import com.company.models.vehicles.Vehicle;
import com.company.models.vehicles.Vehicle4WD;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        try {


            List<Attractions> att = new ArrayList<>();
            att.add(new Attractions("uno"));
            att.add(new Attractions("dos"));
            att.add(new Attractions("tres"));
            att.add(new Attractions("cuatro"));

            Attractions attractionToFind = new Attractions("uno");

            att.forEach((x)->{
                if(attractionToFind.equals(x)){
                    x.setName("one");
                }
            });

            if(attractionToFind.equals(attractionToFind)){
                out.println("equals");
            }else{
                out.println("not equals");
            }

            Attractions attractionToFind2 = new Attractions("dos");
            int position = attractionToFind2.getIndexOf(att,attractionToFind2);


            /////arrays///////////////////////////////////////////////
            int grades[];
            grades = new int[10];

            grades[0] = 7;
            grades[5] = 9;
            grades[9] = 8;
            grades[1] = 6;

            out.println("grades: ");
            for(int i=0; i< 10; i++){
                out.println(grades[i]);
            }

            
            
            // write your code here
            out.println("asdfs");

            // Enter data using BufferReader
            //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Reading data using readLine
            //String name = reader.readLine();

            // Printing the read line
            //System.out.println(name);

            Vehicle vehicle = new Vehicle("",5, 130, 4);
            vehicle.printTripDetails(1,320,50);

            vehicle.drive(2,100);
            vehicle.drive(400.0F,100);

            Vehicle pickup = new PickUpTruck("Pickup truck",2,130,4,50);
            Vehicle motorcycle = new Motorcycle("All terrain Motorcycle",1,100,2);
            Vehicle vehicle4wd = new Vehicle4WD("Car 4WD",8,150,4, false);

            List<Vehicle> vehicleList = new ArrayList<>();
            vehicleList.add(pickup);
            vehicleList.add(motorcycle);
            vehicleList.add(vehicle4wd);
            vehicleList.forEach((v)->{
                out.print(v.getName()+": ");
                v.park();
            });


        }catch (Exception e){

        }
    }
}
