/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regularexpression;

/**
 *
 * @author darek
 */
public class RegularExpression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// 	    String str="darekarpratik99@gmail.com";
// 	    //validate the email
// 		//System.out.println(str.matches("//w*@gmail.*"));
// 		//find domainname and username
// 		int i= str.indexOf("@");
// 		String uname=str.substring(0,i);
// 		String domain=str.substring(i+1, str.length());
// 		System.out.println("Username : "+uname+" Domain : "+domain);
// 		//check is it a gmail or not
// 		int j = domain.indexOf(".");
// 		String name= domain.substring(0,j);
// 		System.out.println(name.equals("gmail"));
//find if a number is Binary or not
//find is a number is gexadecimal or not
//find is a data in Date fromat or not (dd/mm/yyyy)
        int b = 1001010;

        String str = b + "";//or String.valueOf(b)  //convert to string 
        System.out.println(str.matches("[01]+"));//more than one times

        String hex = "B234A";
        System.out.println(hex.matches("[0-9A-F]+"));//more than one times

        String Date = "01/12/2000";
        System.out.println(Date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}+"));//more than one times

    }

}
