package com.xworkz.foodapp.ingredients;

public class FoodTester {

    public static void main(String[] args) {
        Food fo=new Food();
        fo.typeOfFood="Pizza";
        Ingredients in=new Ingredients();
        in.numberOfIngredients=4;
        System.out.println("The type of food determined is:" +fo.typeOfFood);
        System.out.println("The number of ingredients present in it are:" +in.numberOfIngredients);
    }
}
