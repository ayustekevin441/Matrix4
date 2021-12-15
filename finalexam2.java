import java.util.Scanner;
class Main
{
  public static void main(String[] args){
    double as;
    double mtr;
    double dlr;
    double hlr;
    double atd;
    double mtd;
    double np;
    Scanner input = new Scanner(System.in);
	  System.out.println("Enter Annual Salary: ");
     as = input.nextDouble();
    atd = 0;
    if (as <= 250000){
      atd = 0;
    }else if (as >= 250000 && as < 400000){
     atd = 30000 * 0.2;
    }else if (as >= 400000 && as < 800000){
      atd = 30000 + (0.25 * (as - 400000));
    }else if (as >= 800000 && as < 20000000){
      atd = 130000 + (0.3 * (as - 800000));
    }else if (as >= 250000 && as < 400000){
      atd = 490000 + (0.32 * (as - 2000000));
    }else if (as >= 250000 && as < 400000){
      atd = 2410000 + (0.35 * (as - 8000000));}
    String[] Salary = {"Your Annual Salary: " + String.format("%.2f", as), "Your Monthly Rate: " + String.format("%.2f", mtr = as/12), "Your Daily Rate: " + String.format("%.2f", dlr = mtr/22), "Your Hourly Rate: "+ String.format("%.2f", hlr = dlr/8), "Your Annual Tax Deduction: " + String.format("%.2f", atd), "Your Monthly Tax Deduction: " + String.format("%.2f", mtd = atd/12), "Net Pay: " + String.format("%.2f", np = mtr-mtd)};
    for (String a : Salary) 
  System.out.println(a);}
}