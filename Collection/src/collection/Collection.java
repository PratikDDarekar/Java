/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection;


 class Country {

String name;
	String cap;
	String hs;
	int phnoCode;
	
	public Country(String name,String cap,String hs,int phnoCode)
	{
		this.name = name;
		this.cap = cap;
		this.hs = hs;
		this.phnoCode = phnoCode;
	}
	
	@Override
	public String toString()
	{
		return "Country[Name: "+name+", Capital: "+cap+", HS: "+hs+", Phone Code:"+phnoCode+"] ";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(cap, hs, name, phnoCode);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Country other = (Country) obj;
//		return Objects.equals(cap, other.cap) && Objects.equals(hs, other.hs) && Objects.equals(name, other.name)
//				&& phnoCode == other.phnoCode;
//	}
//	
    
}
