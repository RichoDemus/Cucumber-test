package com.richo.test.cucumber.car;

public class CarKeys
{
	private final Volvo volvo;

	public CarKeys(Volvo volvo)
	{

		this.volvo = volvo;
	}

	public void lock()
	{
		volvo.lock();
	}
}
