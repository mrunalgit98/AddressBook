package com.brigelabz;

import java.util.Scanner;

public class contact {

   String FirstName;
   String LastName;
   String Address;
   String State;
   int Zipcode;
   long phoneNo;
   
   Scanner sc =new Scanner(System.in);
   String getfirstName() {
   return FirstName;
   }
   void setfirstName(String firstName) {
	   FirstName=firstName;
   }
   
   
   String getlastName() {
	   return LastName;
   }
   void setlastName(String lastName) {
	   LastName=lastName;
   }
   
   
   String getAddress() {
	   return Address;
   }
   void setAddress(String address) {
	   Address=address;
   }
   
   String getState() {
	   return State;
   }
   void setState(String state) {
	   State=state;
   }
   
   
   int getZipCode() {
	   return Zipcode;
   }
   void setZipcode(int zipcode) {
	   Zipcode=zipcode;
   }
   
   long setphoneNo() {
	   return phoneNo;
   }
   void setphoneNo(long Phoneno) {
	   phoneNo=Phoneno;
   }
   
   void display() {
	   System.out.println("Enter First name");
	   setfirstName(sc.nextLine());
	   
	   System.out.println("Enter last name");
	   setlastName(sc.nextLine());
	   
	   System.out.println("Enter address");
	   setAddress(sc.nextLine());
	   
	   System.out.println("Enter state");
	   setState(sc.nextLine());
	   
	   System.out.println("enter zipcode");
	   setZipcode(sc.nextInt());
	   
	   System.out.println("enter phoneno");
	   setphoneNo(sc.nextLong());
	   
	   
	   System.out.println("first name " +this.getfirstName());
	   System.out.println("last name " +this.LastName);
	   System.out.println("address " + this.Address);
	   System.out.println("state " + this.State);
	   System.out.println("zipcode " + this.Zipcode);
	   System.out.println("phone no " + this.phoneNo);
	   
	   
	   
   }
   
   
   public static void main(String[] args) {
	
	   
	   contact detail =new contact();
	   System.out.println("enter detail");
	   detail.display();
	   
	   contact detail2=new contact();
	   System.out.println("enter detail");
	   detail2.display();
}
   
}
   
   

