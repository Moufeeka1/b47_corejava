package com.tns.inheritance;
class Indians {
    protected String lang="Hindi";
    void displayNational() {
	     System.out.println("National lang"+lang);	
}
	

public class Kerala extends Indians {
	public String lang="Malayalam";
	void displayLocalKerala() {
		System.out.println("Local lang of Kerala"+lang);
}
}
public class Karnataka extends Indians {
	public String lang="Kannada";
	void displayLocalKarnataka() {
		System.out.println("Local lang of Karnataka"+lang);
}
}
}

