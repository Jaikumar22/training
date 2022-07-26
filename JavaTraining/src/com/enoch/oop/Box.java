package com.enoch.oop;

public class Box {
    double width;
    double height;
    double depth;  
    double weight;
}
class BoxWeight extends Box {
   BoxWeight(double w, double h, double d, double m) {
       width = w;
       height = h;
       depth = d;
       weight = m;
   }
}

class demobox{                                                                                                                                                                                                                                                                               
   public static void main(String[] args) {
	   BoxWeight mybox = new BoxWeight(10, 20, 15, 34.3);
       
       System.out.println("Weight of mybox is " + mybox.weight);
    
   }
}