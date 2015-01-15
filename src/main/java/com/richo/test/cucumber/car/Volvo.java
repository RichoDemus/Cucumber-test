package com.richo.test.cucumber.car;

/**
 * Created by richard.tjerngren on 2015-01-15.
 */
public class Volvo
{
	private boolean locked = false;
	public void lock()
	{
		locked = true;
	}

	public boolean isLocked()
	{
		return locked;
	}
}
