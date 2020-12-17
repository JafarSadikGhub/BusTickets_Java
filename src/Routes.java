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
public class Routes 
{
   private String name;
   private double distance;
   Routes(String name, double distance)
   {
       this.name = name;
       this.distance = distance;
   }
   public String getName()
   {
       return this.name;
   }
   public double getDistance()
   {
       return this.distance;
   }
   public void setName(String name)
   {
       this.name = name;
   }
   public void setDistance(double distance)
   {
       this.distance = distance;
   }
   @Override
   public String toString()
   {
       return "[ROUTES CLASS]Name: " + this.name + "\nDistance: " + this.distance + "\n\n";
   }
}
