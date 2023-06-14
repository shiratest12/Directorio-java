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


public class Metodos
{
	
	private String direccion;
	private String nombre;
	private    String telefono;
	private String celular;
	public Metodos ()
	{
		direccion = "";
		nombre   = "";
		telefono   = "";
		celular   = "";
	}
	
	public Metodos (String direccion, String nombre, String telefono,  String celular )
		throws Dexception
	{
		
		direccion = direccion.trim ();
		nombre   = nombre.trim ();
		telefono   = telefono.trim ();
		celular  = celular.trim ();
		
		if (nombre.length () == 0)
		{
			
			throw new Dexception ("Error: nombre no ingresado");
		}
		
		else
		{
			
			this.direccion = direccion;
			this.nombre   = nombre;
			this.telefono = telefono;
			this.celular  = celular;
		}
	}
	
	public String getdir ()
	{
		return direccion;
	}
	
	public String getn ()
	{
		return nombre;
	}
	
	public void setdir (String direccion)
	{
		this.direccion = direccion;
	}
	
	public void setn (String nombre)
	{
		this.nombre = nombre;
	}
	
	public String gettelefono ()
	{
		return telefono;
	}
	
	public void settelefono (String telefono)
	{
		this.telefono = telefono;
	}
	
	public String getcelular()
	{
		return celular;
	}
	
	public void setcelular (String celular)
	{
		this.celular = celular;
	}
	
	
	@Override
		public String toString ()
	{
			return nombre + "\t" + direccion + "\t" + telefono + "\t" + celular ;
		}
	
} 
