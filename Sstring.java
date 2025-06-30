public class Sstring                                  
{
    public static void main(String[] args) 
    {
       String s1="Java";
       String s2="Programs";
       String s3="Java";


     System.out.println(s1.compareTo(s2));                       //compareTo() Method in String  #8
     System.out.println(s2.compareTo(s1));
     System.out.println(s1.compareTo(s3));

     System.out.println(s1.concat(" is good."));                //concat() Method in String   #9


     System.out.println(s1.contains("ava"));                    //contains() Method in String  #10

      String s4="JaVA";   
      System.out.println(s1.equals(s4));                         //equals() Method in String 
      System.out.println(s1.equalsIgnoreCase(s4));               //equalsIgnoreCase() Method in String  #11 

     int p=s1.indexOf("v");                                     //indexOf() Method in Strong      #12
     System.out.println(p);                                     

     System.out.println(s2.lastIndexOf("g"));                   //lastIndexOf() Method un String   #13

     String s5="";
     System.out.println(s5.isEmpty());                          //isEmpty() Method in String       #14
     System.out.println(s1.isEmpty());


     char[]ch=s1.toCharArray();                                  //toCharArray() Method in String   #15
     for(int i=0;i<ch.length;i++)
     {
       System.out.println(ch[i]);
     }
     
     String s6=String.join("_","Welcome","to","ABIT");            //join() Method in String            #16 
     System.out.println(s6);

     String s8 = "Mi,Csk,Rcb";                                    //split() Method in String          
            String[] Teams = s8.split(",");
            System.out.println("Teams:");
            for (String Team:Teams) 
            {
                System.out.println(Team);
            }

      String s7=new String("Rohit");                             //new String(" ") Method in String    #17
      String s=s7.intern();
      System.out.println(s); 

    }
}
