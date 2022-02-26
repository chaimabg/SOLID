package com.directi.training.srp.exercise_refactored;

public class CarManager
{
    private final ICarDao _carDao;
    private final ICarFormatter _carFormatter;
    private final ICarRater _carRater;

    public CarManager(ICarDao carDao, ICarFormatter carFormatter, ICarRater carRater)
    {
        _carDao = carDao;
        _carFormatter = carFormatter;
        _carRater = carRater;
    }

    public Car getCarById(final String carId)
    {
        return _carDao.findById(carId);
    }

    public String getCarsNames()
    {
        return _carFormatter.getCarsNames(_carDao.findAll());
    }

    public Car getBestCar()
    {
        return _carRater.getBestCar(_carDao.findAll());
    }
}
