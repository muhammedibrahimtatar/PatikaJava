package Odevler.maasHesaplama;

public class Employee {

    // Attribute
    String name;
    double salary;
    int workHours;
    int hireYear;

    //Constructor Method
    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    //Methods
    public double tax(){
        if(this.salary<=1000){
            return 0;
        }else{
            return salary*0.03;
        }
    }

    public double bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;

        }else{
            return 0;
        }
    }

    public double raiseSalary(){
        if(this.hireYear>2012){
            this.salary+=(this.salary*0.5);
            return this.salary;
        }else if(this.hireYear<=2011 && this.hireYear>2001){
            this.salary+=(this.salary*0.10);
            return this.salary;
        }else if(this.hireYear<2001){
            this.salary+=(this.salary*0.15);
            return this.salary;
        }else {
            return 0;
        }
    }

    public void tooString(){
        System.out.println(
                "Adı:"+this.name+"\n"+
                "Maaşı:"+this.salary+"\n"+
                "Çalışma Saati:"+this.workHours+"\n"+
                "Başlangıç Yılı:"+this.hireYear+"\n"+
                "Vergi:"+tax()+"\n"+
                "Bonus:"+bonus()+"\n"+
                "Maaş Artışı:"+raiseSalary()+"\n"+
                "Vergi ve Bonuslar ile birlikte maaş:"+((this.salary+bonus())-tax())+"\n"+
                "Toplam Maaş:"+salary+bonus()+raiseSalary()+"\n"

        );

    }
}
