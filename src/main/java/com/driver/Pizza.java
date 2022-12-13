package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeze;
    private boolean topping;
    private boolean takeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        int cost = isVeg?300:400;
        String message = "Base Price Of The Pizza: ";
        String b = this.bill;
        this.price = getPrice() + cost;
        this.bill= message + cost + "\n";
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.cheeze) {
            this.cheeze=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.topping) {
            this.topping = true;
        }
    }

    public void addTakeaway(){
// your code goes here
        if(!takeAway) {

            this.takeAway = true;
        }
    }
    public String getBill(){
        // your code goes here
        String message = "Total Price: ";
        if(this.cheeze)
            this.bill+="Extra Cheese Added: " + 80;
        if(this.topping) {
            int top = this.isVeg ? 70 : 120;
            this.price = getPrice() + top;
            this.bill += "Extra Toppings Added: " + top;
        }
        if (this.takeAway){
            this.price = getPrice() + 20;
            this.bill += "Paperbag Added: " + 20;
        }
        this.bill+= message + this.price+ "\n";
        return this.bill;
    }
}
//    int cost = 80;
//    String message = "Extra Cheese Added: ";
//            this.price = getPrice() + cost;
//                    String b = this.bill;
//                    this.bill = b + message + cost + "\n";

//    int cost = this.isVeg ? 70 : 120;
//    String message = "Extra Toppings Added: ";
//            this.price = getPrice() + cost;
//                    String b = this.bill;
//                    this.bill = b + message + cost + "\n";

//    int cost = 20;
//    String message = "Paperbag Added: ";
//            this.price = getPrice() + cost;
//                    String b = this.bill;
//                    this.bill = b + message + cost + "\n";