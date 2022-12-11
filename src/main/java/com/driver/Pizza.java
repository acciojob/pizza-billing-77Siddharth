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
            int cost = 80;
            String message = "Extra Cheese Added: ";
            this.price = getPrice() + cost;
            String b = this.bill;
            this.bill = b + message + cost + "\n";
            this.cheeze=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.topping) {
            int cost = this.isVeg ? 70 : 120;
            String message = "Extra Toppings Added: ";
            this.price = getPrice() + cost;
            String b = this.bill;
            this.bill = b + message + cost + "\n";
            this.topping = true;
        }
    }

    public void addTakeaway(){
// your code goes here
        if(!takeAway) {
            int cost = 20;
            String message = "Paperbag Added: ";
            this.price = getPrice() + cost;
            String b = this.bill;
            this.bill = b + message + cost + "\n";
            this.takeAway = true;
        }
    }
    public String getBill(){
        // your code goes here
        String message = "Total Price: ";

        this.bill+= message + this.price+ "\n";
        return this.bill;
    }
}
