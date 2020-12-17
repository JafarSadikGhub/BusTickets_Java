/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
public class Buses
{
   private String name;
   private int noOfSeats;
   private double fare;
   Buses(String name, int noOfSeats, double fare)
   {
       this.name = name;
       this.noOfSeats = noOfSeats;
       this.fare = fare;
   }
   public String getName()
   {
       return this.name;
   }
   public int getNoOfSeats()
   {
       return this.noOfSeats;
   }
   public double getFare()
   {
       return this.fare;
   }
   public void setName(String name)
   {
       this.name = name;
   }
   public void setNoOfSeats(int noOfSeats)
   {
       this.noOfSeats = noOfSeats;
   }
   public void setFare(double fare)
   {
       this.fare = fare;
   }
   @Override
   public String toString()
   {
       return "[Buses Class]Bus-Name: " + name + "\n# Of Seats: " + noOfSeats + "\nFare: " + fare + "\n\n";
}
