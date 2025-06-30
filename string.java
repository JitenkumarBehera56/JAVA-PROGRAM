
public class string
{
    public static void main(String[] args) 
    {           
        String s=" Java Pro ";
        System.out.println(s.toUpperCase());                //toUpperCase() Method in String   #1
        System.out.println(s.toLowerCase());                //toLowerCase() Method in String   
        System.out.println(s.trim());                       //trim() Method in String          #2
        System.out.println(s.startsWith(" Ja"));            //startsWith(" ") Method in String #3
        System.out.println(s.endsWith("ij"));               //endssWith(" ") Method in String 
        System.out.println(s.charAt(7));                    //charAt() Method in String        #4
        System.out.println(s.length());                     //length() Method in String        #5
        System.out.println(s.replace("Java","Python"));     //replace() Method in String       #7
        System.out.println(s.replaceAll("Python");   //replaceAll() Method in String
        System.out.println(s.replaceAll(" "," ");
    }
}

