import java.util.*;
class Currentbill
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double units=sc.nextDouble();
System.out.println(ElectricityBill(units));
}
public static double ElectricityBill(double units)
{
if(units<=100)
{
return units*3.25;
}
else if(units<=200)
{
return (100*3.25)+(units-100)*5.63;
}
else if(units<=300)
{
return (100*3.25)+(100*5.63)+(units-200)*6.88;
}
else if(units<=400)
{
return (100*3.25)+(100*5.63)+(100*6.88)+(units-300)*7.38;
}
else if(units<=500)
{
return (100*3.25)+(100*5.63)+(100*6.88)+(100*7.38)+(units-400)*7.88;
}
else if(units>500)
{
return (100*3.25)+(100*5.63)+(100*6.88)+(100*7.38)+(100*7.88)+(units-500)*8.38;
}
return 0;
}
}

output1:

Enter units : 100
Current Bill : 325.0

output2:

Enter units : 320
Current Bill : 1723.6