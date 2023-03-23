package com.tns.staticprog;

public class Employee {
   private String name;
   private int id;
   static int count=0;
   static String CompanyName="TNS";
  static int count ()
   {
	count++;
	return count;   
   }
   Employee(String name,int id) {
	   this.name=name;
	   this.id=id;
   }
   @Override
   public String toString() {
	   return "Employee [name="+ name +" , id="+id+",count]";
   }

}
