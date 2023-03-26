public class Employee {

      String name ;
      double salary ;
      int workHours;
      int hireYear ;

     public Employee(String name , double salary ,int workHours, int hireYear) {

         this.name = name;
         this.salary = salary;
         this.workHours = workHours;
         this.hireYear = hireYear;
     }
       public  double tax (){
         double tax =0 ;
         if (this.salary >1000){
             tax = this.salary * 0.03 ;

             return tax;
         }
         return tax ;
       }
       public int bonus (){
       if (this.workHours > 40){
           int extraHours= this.workHours-40 ;

           int extraPay=extraHours*30;

           return extraPay  ;
       }
       return 0 ;
       }
        public double raiseSalary () {
         int thisYear = 2021;
        double raiseCount ;
         if (thisYear-this.hireYear<10){
             raiseCount=this.salary*0.05 ;
             return raiseCount ;
         }else if (thisYear-this.hireYear <20 && thisYear-this.hireYear >9) {
             raiseCount =this.salary*0.1;
             return raiseCount;
            }
         else if (thisYear-this.hireYear > 19){
           raiseCount= this.salary*0.15 ;
             return raiseCount;
         }
         return 0 ;
        }
    public String toString() {
        System.out.println("------------------");
        return "Name: " + this.name + "\nSalary: " + this.salary +
                "\nWork Hours: " + workHours + "\nHire Year: " + hireYear +
                "\nTax: " + tax() + "\nBonus: " + bonus() + "\nsalary increase: " + raiseSalary() +
                "\nSalary including tax and bonus: " + (this.salary + bonus() - tax()) +
                "\nNet Salary: " + (this.salary + raiseSalary());

    }
}
