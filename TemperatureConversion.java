import java.util.*;
class TemperatureConversionProgram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("TEMPERATURE  CONVERSION  PROGRAM");
        System.out.println("1.Celsius");
        System.out.println("2.Fahrenheit");
        System.out.println("3.kelvin");
        System.out.print("Enter Your Choice : ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:{
                 System.out.print("Enter Temperature in Celsius : ");
                 double Celsius=sc.nextDouble();
                 double Fahrenheit=(Celsius*9/5)+32;
                 double kelvin=Celsius+273.15;
                 System.out.println("Temperature in Fahrenheit : "+Fahrenheit);
                 System.out.println("Temperature in Kelvin : "+kelvin);
            }break;
            case 2:{
                 System.out.print("Enter Temperature in Fahrenheit : ");
                 double Fahrenheit=sc.nextDouble();
                 double Celsius=(Fahrenheit-32)*5/9;;
                 double kelvin=((Fahrenheit-32)*5/9)+273.15;
                 System.out.println("Temperature in Celsius : "+Celsius);
                 System.out.println("Temperature in Kelvin : "+kelvin);
            }break;
            case 3:{
                 System.out.print("Enter Temperature in Kelvin : ");
                 double kelvin=sc.nextDouble();
                 double Celsius=kelvin-273.15;;
                 double Fahrenheit=(Celsius*9/5)+32;
                 System.out.println("Temperature in Celsius : "+Celsius);
                 System.out.println("Temperature in Fahrenheit : "+Fahrenheit);
            }break;
            default:System.out.println("Enter Valid Choice :  ");
        }
    }
}