
package stringpractice;
import java.util.Scanner;

public class Conditional_statement {
    public static void main(String[] args){
  
        
     //STUDENT CHALLENGE :- 
    //FIND TYPE OF WEBSITE AND THE PROTOCOL USED(if-else ladder)

Scanner sc = new Scanner(System.in);
//String str= sc.nextLine();
//
//int l= str.length();
//int pidx= (str.indexOf("/"));
////int tidx= (str.indexOf(".", 12, l));//Or
//int tidx= (str.lastIndexOf("."));
//String webProtocol = (str.substring(0, pidx));
//String webType = (str.substring(tidx, l));
//
////
////if(webProtocol.equals("http:")){
////    System.out.println("http type protocol ");
////    }
////else if(webProtocol.equals("https:")){
////    System.out.println("https type protocol ");
////    }
////else if(webProtocol.equals("ftp:")){
////    System.out.println("ftp type protocol ");
////    }
////else{
////System.out.println("Not a Valid Protocol");
////}
////
////if(webType.equals(".com")){
////    System.out.println("Commercial type ");
////    }
////else if(webType.equals(".gov")){
////    System.out.println("government type ");
////    }
////else if(webType.equals(".org")){
////    System.out.println("organization type ");
////    }
////else if(webType.equals(".net")){
////    System.out.println("Network type ");
////    }
////else if(webType.equals(".biz")){
////    System.out.println("Bussiness type ");
////    }
////else{
////System.out.println("Not a Valid Type");
////}
//
////OR
//
//if(str.startsWith("http")){
//    System.out.println("http type protocol ");
//}
//else if(str.startsWith("https:")){
//    System.out.println("https type protocol ");
//    }
//else if(str.startsWith("ftp:")){
//    System.out.println("ftp type protocol ");
//    }
//else{
//System.out.println("Not a Valid Protocol");
//}
//if(str.endsWith(".com")){
//    System.out.println("Commercial type ");
//}
//else if(str.endsWith(".gov")){
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





//STUDENT CHALLENGE (SWITCH CASE :- MENU DRIVEN PROGRAM)

System.out.println("MENU");
System.out.println("===7");
System.out.println("ADD");
System.out.println("SUB");
System.out.println("DIV");
System.out.println("MUL");

System.out.println("Enter the value of two variable a and b :");
int a =sc.nextInt(), b =sc.nextInt();

System.out.println("Enter the operation you want to perform");
sc.nextLine(); // BUFFER PROBLEM
String MENU=sc.nextLine().toUpperCase();
switch(MENU){
    case "ADD":System.out.println(a+b);
    break;
    
    case "SUB":System.out.println(a-b);
    break;
    
    case "MUL":System.out.println(a*b);
    break;
    
    case "DIV":System.out.println(a/b);
    break;
    
    default:System.out.println("invalid input");
    break;
}

}
}
