import java.util.ArrayList;  
import java.util.List;  
import java.util.stream.Stream;   
class Employee{
    int empId,empSalary;
    String empName,empDesignation,empLocation;
    public Employee(int id,String name,String empdes,String emploc,int sal) 
    {
    	this.empId=id;
    	this.empName=name;
    	this.empSalary=sal;
    	this.empDesignation=empdes;
    	this.empLocation=emploc;
    }
    public static void main(String[] args) 
    {  
        List<Employee> list=new ArrayList<Employee>();  
        list.add(new Employee(1,"Sai Teja","Founder","Maldives",1000000));
        list.add(new Employee(2,"Teja","Team leader","Bangalore",35000)); 
        list.add(new Employee(3,"Prasanna","Manager","Bangalore",75000));
        list.add(new Employee(4,"Lakshmi","CEO","Manhattan",125000));
        list.add(new Employee(5,"Reddy","Trainee","Hyderabad",10000));
        list.add(new Employee(6,"Chowdary","Trainee","Hyderabad",10000));
        list.add(new Employee(7,"Rahul","Team leader","Pune",35000));
        list.add(new Employee(8,"Kiran","Manager","Pune",75000));
        list.add(new Employee(9,"Venu","Supervisor","Mangalore",55000));
        list.add(new Employee(10,"Padma","Assistant supervisor","Mumbai",40000));
//part-a
        System.out.print("Employee names are : ");
        list.forEach(Employee->System.out.print("("+Employee.empName+")"+" ")); 
        System.out.println();
//part-b____Salaries are shown with the respective IDS
        System.out.print("Salaries with IDs which are greater than 50,000 are : ");
        Stream<Employee> sals=list.stream().filter(e->e.empSalary>50000);
        sals.forEach(  
                Employee -> System.out.print(Employee.empId+"-"+Employee.empSalary+" ")  
        );
        System.out.println();
//part-c
        System.out.print("Locations ending with m are : ");
        Stream<Employee> locs=list.stream().filter(e->e.empLocation.charAt(0)=='M' || e.empLocation.charAt(0)=='m');
        locs.forEach(  
                Employee -> System.out.print(Employee.empLocation+" ")  
        );  
        System.out.println();
//part-d 
        System.out.print("Designations ending with e are : ");
        Stream<Employee> pos=list.stream().filter(e->e.empDesignation.charAt(e.empDesignation.length()-1)=='E' || e.empDesignation.charAt(e.empDesignation.length()-1)=='e');
        pos.forEach(
                Employee -> System.out.print(Employee.empId+"-"+Employee.empDesignation+" ")  
        );  
        System.out.println();
    }  
}  
