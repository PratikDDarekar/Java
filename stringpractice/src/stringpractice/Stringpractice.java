
package stringpractice;

import static java.lang.String.valueOf;
import java.util.Scanner;


public class Stringpractice {

  
    public static void main(String[] args) {
//        String str1 = "Java Program";
//        
//        String str2 = new String("Java");
//      
//        
//        char c[] = {'H','E','L','L','O'};
//        String  str3= new String(c);
//        
//          
//        byte b[]= {65,66,67,68}; 
//         String  str4= new String(b);
//          System.out.println(str4);
          
         // String line = "Java";
        //  int l = line.length();
        
//          String low = line.toLowerCase();
//           String up = line.toUpperCase();
//          String ll = "  welcome      ";
//             String t = ll.trim();
//          System.out.println(t);
          
//              String s = "welcome";
//             String Ss = s.substring(2);
//          System.out.println(Ss);
//          
//              String s2 = "welcome";
//             String Ss2 = s2.substring(2,5);
//          System.out.println(Ss2);
          
//           String r = "welcome";
//             String R = r.replace('e','k');
//          System.out.println(R);


//
//String str1 = "MR.Shahrukh Khan";
//System.out.println(str1.startsWith("MR."));
//System.out.println(str1.startsWith("Shah", 3));
//
//System.out.println(str1.endsWith("Khan"));
//
//System.out.println(str1.charAt(4));
//
//for(int i=0;i<str1.length();i++){
//  System.out.print(str1.charAt(i));
//}


//String str1= "www.udemy.co.in";
//System.out.println(str1.indexOf("udemy"));
//System.out.println(str1.indexOf(".", 3));
//
//System.out.println(str1.indexOf(".co"));
//System.out.println(str1.lastIndexOf(".", 3));



//String str1 ="Pyramid"; 
//String str2 ="Pyramid"; 
//String str3 ="pyramid"; 
//String str4 = new String("Pyramid");
//String str5 ="china wall"; 
//String str6 = new String("china tall");
//String str7 = "the great wall of china";
//String str8 = "the great wall ";
//String str9 = "of china ";
//
//System.out.println(str1.equalsIgnoreCase(str3));
//System.out.println(str1==str2);
//System.out.println(str1==str3);
//System.out.println(str1==str4);
//System.out.println(str1.equals(str2));
//
//System.out.println(str1.compareTo(str2));
//System.out.println(str1.compareTo(str3));
//System.out.println(str3.compareTo(str1));
//System.out.println(str5.compareTo(str6));//it gives the difference between those ASCII keys two letters
//
//System.out.println(str7.contains("wall"));
//
//System.out.println(str8.concat(str9) );//or
//System.out.println(str9+str8);



//REGULAR EXPRESSION EXERCISE:-

//Q.1 Find if the email id is on gmail (does it include gmail)
//    Find username and domain name from email  (subtring)  
// by me
//    String str = "programmer@gmail.com";
//    String username = str.substring(0, 10);
//     String domainname = str.substring(11);
//     System.out.println("username:- "+username);
//     System.out.println("domainname:- "+domainname);
//     System.out.println(str.matches(".*gmail.*"));
     
// by sir     
//String str1 = "programmmer@hotmail.com";
//int i =str1.indexOf("@");
//String username1 = str1.substring(0, i);
//String domainname1 = str1.substring(i+1, str1.length());
//
//System.out.println("Username:- "+username1);
//System.out.println("domainname:- "+domainname1);
//
//int j= domainname.indexOf(".");
//String name = domainname.substring(0,j);
//System.out.println(name.startsWith("hotmail"));



//STUDENT CHALLENG 1
//Find if a number is Binary or not
//int a= 100110;
//String str = valueOf(a);
//System.out.println(str.matches("[01]*"));

//Find if a number is Hexa-Decimal or not
//String b= "105623ACDF";
//String str1 = valueOf(b);
//System.out.println(str1.matches("[0-9A-F]+"));

//Find is the data in Date format (dd/mm/yy)
//String c = "01/12/2000";
//System.out.println(str1.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));


//STUDENT CHALLENG 2

//Remove Special characters from the String
//String str5 = "a!B@c#1#2%3";
//System.out.println(str5.replaceAll("[^a-zA-Z0-9]",""));

//Remove extra spaces from String

//String str6 = "     abc  def   ghl  mno pqrst   ";
//System.out.println(str6.replaceAll("\\s+ ", ""));
//System.out.println(str6.replaceAll("\\s+ ", "").trim());
//System.out.println(str6.replaceAll(" ", ""));

//Find number of words in a String

//String str7 = "     abc    def   ghl    gh   ijk   ";
//str7 = str.replaceAll("\\s+"," ").trim();
//String words[] = str.split("\\s");
//System.out.println(words.length);
//


//Finding the redix number

//Scanner sc = new Scanner(System.in);
//String num = sc.nextLine();
//
//if(num.matches("[01]+")){
//    System.out.println("Binary Number redix = 2");
//}
//else if(num.matches("[0-7]+")){
//    System.out.println("Octal Number redix = 8");
//}
//else if(num.matches("[0-9]+")){
//    System.out.println("Decimal Number redix = 10");
//}
//else if(num.matches("[0-9A-F]+")){
//    System.out.println("Hexa-Decimal Number redix = 16");
//}
//else{
//    System.out.println("Not a Number");
//  }





//FIND TYPE OF WEBSITE AND THE PROTOCOL USED

Scanner sc = new Scanner(System.in);
String str= sc.nextLine();

int l= str.length();
int pidx= (str.indexOf("/"));
//int tidx= (str.indexOf(".", 12, l));//Or
int tidx= (str.lastIndexOf("."));
String webProtocol = (str.substring(0, pidx));
String webType = (str.substring(tidx, l));

//
//if(webProtocol.equals("http:")){
//    System.out.println("http type protocol ");
//    }
//else if(webProtocol.equals("https:")){
//    System.out.println("https type protocol ");
//    }
//else if(webProtocol.equals("ftp:")){
//    System.out.println("ftp type protocol ");
//    }
//else{
//System.out.println("Not a Valid Protocol");
//}
//
//if(webType.equals(".com")){
//    System.out.println("Commercial type ");
//    }
//else if(webType.equals(".gov")){
//    System.out.println("government type ");
//    }
//else if(webType.equals(".org")){
//    System.out.println("organization type ");
//    }
//else if(webType.equals(".net")){
//    System.out.println("Network type ");
//    }
//else if(webType.equals(".biz")){
//    System.out.println("Bussiness type ");
//    }
//else{
//System.out.println("Not a Valid Type");
//}

//OR

if(str.startsWith("http")){
    System.out.println("http type protocol ");
}
else if(str.startsWith("https:")){
    System.out.println("https type protocol ");
    }
else if(str.startsWith("ftp:")){
    System.out.println("ftp type protocol ");
    }
else{
System.out.println("Not a Valid Protocol");
}
if(str.endsWith(".com")){
    System.out.println("Commercial type ");
}
else if(str.endsWith(".gov")){
    System.out.println("government type ");
    }
else if(webType.equals(".org")){
    System.out.println("organization type ");
    }
else if(webType.equals(".net")){
    System.out.println("Network type ");
    }
else if(webType.equals(".biz")){
    System.out.println("Bussiness type ");
    }
else{
System.out.println("Not a Valid Type");
}
 }
}
