public class wrappall
{
    public static void main(String[] args) {
        
        //Autoboxing process of all Datatypes
        int a=56;
        byte b=18;
        char c='J';
        short s=7;
        long l=456751L;
        float f=5.6f;
        double d=5.1;

        Integer i1=Integer.valueOf(a);
        Integer j1=a;  
        Byte i2=Byte.valueOf(b);
        Byte j2=b;      
        Character i3=Character.valueOf(c);
        Character j3=c;   
        Short i4=Short.valueOf(s);
        Short j4=s; 
        Long i5=Long.valueOf(l);
        Long j5=l;    
        Float i6=Float.valueOf(f);
        Float j6=f;  
        Double i7=Double.valueOf(d);
        Double j7=d;  

            System.out.println(i1+" "+j1+" "+i2+" "+j2+" "+i3+" "+j3+" "+i4+" "+j4+" "+i5+" "+j5+" "+i6+" "+j6+" "+i7+" "+j7);

            //Unboxing process of all the Datatypes
          Integer i=4;
          int i8=i.intValue();
          int j8=i;
          Byte y=7;
          byte i9=y.byteValue();
          byte j9=y; 
          Character c1='A';
          char i10=c1.charValue();
          char j10=c1; 
          Short s1=9;
          short i11=s1.shortValue();
          short j11=s1; 
          Long l1=-1236L;
          long i12=l1.longValue();
          long j12=l1; 
          Float f1=56.51f;
          float i13=f1.floatValue();
          float j13=f1; 
          Double d1=45.51;
          double i14=d1.doubleValue();
          double j14=d1; 
           
           System.out.println(i8+" "+j8+" "+i9+" "+j9+" "+i10+" "+j10+" "+i11+" "+j11+" "+i12+" "+j12+" "+i13+" "+j13+" "+i14+" "+j14);
    }
}