package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeze;
    private boolean topping;
    private boolean takeAway;
    private boolean finalBill = false;

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
        if (!finalBill) {
            String message = "Total Price: ";
            if (this.cheeze)
                this.bill += "Extra Cheese Added: " + 80 + "\n";
            if (this.topping) {
                int top = this.isVeg ? 70 : 120;
                this.price = getPrice() + top;
                this.bill += "Extra Toppings Added: " + top + "\n";
            }
            if (this.takeAway) {
                this.price = getPrice() + 20;
                this.bill += "Paperbag Added: " + 20 + "\n";
            }
            this.bill += message + this.price + "\n";
            return this.bill;
        }
        else
            return null;
    }
}