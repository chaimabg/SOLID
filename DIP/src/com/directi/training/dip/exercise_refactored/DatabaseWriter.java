package com.directi.training.dip.exercise_refactored;

public class DatabaseWriter implements IWriter
{
    @Override
    public void write(String input)
    {
        Database database = new MyDatabase();
        database.write(input);
    }
}
