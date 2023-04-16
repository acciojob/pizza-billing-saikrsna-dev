package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int basePrice;
    private int toppingPrice;


    private int vegBasePrice = 300;
    private int nonVegBasePrice = 400;
    private int cheesePrice = 80;
    private int vegToppings = 70;
    private int nonVegToppings = 120;
    private int takeAwayPrice = 20;


    private boolean isExtraCheeseAdded;
    private boolean isExtraTopppingsAdded;
    private boolean isTakeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        price = isVeg ? vegBasePrice : nonVegBasePrice;
        basePrice = price;
        isExtraCheeseAdded = false;
        isExtraTopppingsAdded = false;
        isTakeAway = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded){
            isExtraCheeseAdded = true;
            price += cheesePrice;
        }

    }

    public void addExtraToppings(){
        if(!isExtraTopppingsAdded){
            isExtraTopppingsAdded = true;
            price += isVeg ? vegToppings : nonVegToppings;
            if(isVeg){
                price += vegToppings;
                toppingPrice = vegToppings;
            }else{
                price += nonVegToppings;
                toppingPrice = nonVegToppings;
            }
        }
    }

    public void addTakeaway(){
        if(!isTakeAway){
            isTakeAway = true;
            price += takeAwayPrice;
        }
    }

    public String getBill(){
        // your code goes here
        String est = "";
        est += "Base Price Of The Pizza: " + basePrice + "\n";
        if(isExtraCheeseAdded){
            est += "Extra Cheese Added: " + cheesePrice + "\n";
        }
        if(isExtraTopppingsAdded){
            est += "Extra Toppings Added: " + toppingPrice + "\n";
        }
        if(isTakeAway){
            est += "Paperbag Added: " + takeAwayPrice + "\n";
        }
        est += "Total Price: " + price + "\n";
        this.bill = est;
        return this.bill;
    }
}
