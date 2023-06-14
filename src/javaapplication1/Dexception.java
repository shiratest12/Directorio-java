/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Viri
 */

public class Dexception extends Exception
{
	
	public Dexception ()
	{
		super ();
	}
	
	public Dexception (String message)
	{
		super (message);
	}
	
	public Dexception (Throwable cause)
	{
		super (cause);
	}
	
	public Dexception (String message, Throwable cause)
	{
		super (message, cause);
	}
}