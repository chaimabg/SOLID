package com.directi.training.lsp.exercise_refactored;

public class Pool
{
    public void run()
    {
        IDuck donaldDuck = new Duck();
        IDuck electronicDuck = new ElectronicDuck();
        quack(donaldDuck, electronicDuck);
        swim(donaldDuck, electronicDuck);
    }

    private void quack(IDuck... ducks)
    {
        for (IDuck duck : ducks) {
            try {
                duck.quack();
            } catch (IDuck.IDuckException e) {
                e.printStackTrace();
            }
        }
    }

    private void swim(IDuck... ducks)
    {
        for (IDuck duck : ducks) {
            try {
                duck.swim();
            } catch (IDuck.IDuckException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
