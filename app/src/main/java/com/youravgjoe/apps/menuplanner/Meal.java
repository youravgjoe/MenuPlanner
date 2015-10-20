package com.youravgjoe.apps.menuplanner;

import java.util.List;

public class Meal
{
    List<Ingredient> ingredients;
    String directions;

    public Meal(String filePath)
    {
        //read ingredients in from file.
    }

    public void Save(String filePath)
    {

    }

    public Double GetCost()
    {
        Double cost = 0.0;
        for (int i = 0; i < ingredients.size(); i++)
        {
            cost += ingredients.get(i).GetTotalCost();
        }
        return cost;
    }


}