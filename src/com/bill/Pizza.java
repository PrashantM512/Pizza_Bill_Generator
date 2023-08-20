package com.bill;

public class Pizza {

	public int price;
	public boolean veg;
	private int extraCheesePrice=100;
	private int extraToppingsPrice=150;
	private int backPackPrice=20;
	private boolean isExtraCheeseAdded=false;
	private boolean isExtraToppingsAdded=false;
	private boolean isOptedForTakeAway=false;
	private int basePizzaPrice;
	
	public Pizza(boolean veg) {
		this.veg=veg;
	    if(veg==true) {
	    	this.price=300;
	    }
	    else {
	    	this.price=400;
	    }
	     basePizzaPrice=this.price;
	}
	
	public void addExtraCheese() {
		isExtraCheeseAdded=true;
		this.price+=extraCheesePrice;
		
	}
	public void addExtraToppings() {
		isExtraToppingsAdded=true;
		this.price+=extraToppingsPrice;
		
	}
	public void takeAway() {
		isOptedForTakeAway=true;
		this.price+=backPackPrice;
        
	}
	public void getBill() {
		  System.out.println("Base Pizza Price :"+basePizzaPrice);
        String bill="";
      
        if(isExtraCheeseAdded==true) {
        	bill+="Extra Cheese Added for :"+extraCheesePrice+"\n";
        }
        if(isExtraToppingsAdded==true) {
        	bill+="Extra Cheese Added for :"+extraToppingsPrice+"\n";
        }
        if(isOptedForTakeAway==true) {
        	bill+="Extra Cheese Added for :"+backPackPrice+"\n";
        }
        bill+="Total Bill :"+this.price;
        System.out.println(bill);
        
 	}
}


