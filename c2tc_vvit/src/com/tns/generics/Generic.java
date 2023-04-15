
package com.tns.generics;

public interface Generic<G> 
{
  public G Test();
}

class MyGeneric implements Generic<String>
{
	public String Test() 
	{
		return "My genericc interface";
	}
}
class MyGeneric1 implements Generic<Integer>
{

	public Integer Test() 
	{
		return 100;
	}

}