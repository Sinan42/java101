import java.time.LocalDate;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    public double tax(){
        double tax;
        if(this.salary>1000){
            tax=salary*(0.03);
            return tax;
        }else {
            return 0;
        }
    }
    public double bonus(){
        if(this.workHours>40){
            int difference;
            difference = (workHours-40)*30;
            return difference;

        }else{
            return 0;
        }
    }
    public double raiseSalary(){
        int currentYear= LocalDate.now().getYear();
        this.hireYear=hireYear;
        int difference=currentYear-hireYear;
        if(difference<10){
            return this.salary*(0.05);
        }
        else if(difference>9&&difference<20){
            return this.salary*(0.10);
        }
        else {
            return this.salary*(0.15);
        }


    }

    public String toString(){
        double sum_tax_bonus=this.salary-tax()+bonus();
        double sum=this.salary+raiseSalary();
        return "name :"+this.name
                +"\nHours :"+this.workHours
                +"\nYeor of Start :"+this.hireYear
                +"\nTax :"+tax()
                +"\nBonus:"+bonus()
                +"\nRaised salary:"+raiseSalary()
                +"\nSalary with bonus and tax: "+sum_tax_bonus
                +"\nSalary: "+sum;



    }

}
