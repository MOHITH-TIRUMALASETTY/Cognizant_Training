/*public class Main{
    public static void main (String [] args){
        String s1=args[0];
        int m=Integer.parseInt(s1);
        if(m==12 || m==1 || m==2)
            System.out.println("Winter");
        else if(m==3 || m==4 || m==5)
            System.out.println("summer");
        else if(m==6 || m==7 || m==8)
            System.out.println("Spring");
        else
            System.out.println("Invalid");
    }
}
*/
/*
public class Main{
    public static void main (String args[]){
        int [] arr= {10,60,40,80,100};
        for (int val:arr){
            System.out.println(val);
        }
    }
}
    */

/*
class Employee {
    String empName;
    String empEmail;
    String empDesc;

    void display() {
        System.out.println("Inside method");
    }

    Employee() {
        System.out.println("Default constructor");
    }
    Employee(String eName,String empEmail){
        empName =ename;
        empEmail=eEmail;
        empDesc=desig;
        System.out.println("parameterized constructor");
    }
}

class Main {
    public static void main(String args[]){
	
			Employee obj = new Employee();
            System.out.println(obj.empName+"/"+obj.empEmail+"/"+obj.empDesc);
            obj.display();
		}
}*/
/* 
//Bean class
class Main{
    static int deptId;
    static String deptName;

    public void setDeptId(int did){
        this.deptId=did;
    }
    public int getDeptId(){
        return deptId;
    }
    public void setDeptName(String dName){
        this.deptName=dName;
    }
    public String getDeptName(){
        return deptName;
    }
    void diaplay(){

    }


    public static void main(String [] args){
        //Dept obj=new Dept();
        //obj.setDeptId(1001);
        //obj.setDeptName("Mohith");
        System.out.println(deptId+"/"+deptName);
    }
}*/
/*
class Main{
    int empId=7;
    static int deptId=8;
    Main(){// constructor
        empId++;
        deptId++;
        System.out.println("empId:"+empId+"deptId:"+deptId);
    }
    public static void main (String [] args){
        Main obj=new Main();
        Main obj1=new Main();
        Main obj2=new Main();
        Main obj3=new Main();

    }
}

class Main{
    int prodId;
    static int d;
    Main(){
        System.out.println("Default constructor");
    }
    static{
        d=10;
        System.out.println("Static block called");
    }
    public static void main(String[] args) {
        Main obj=new Main();
        Main obj1=new Main();
        Main obj2=new Main();
    }
}

*/
/*
import java.io.InputStreamReader;
import java.io.*;

class Main{
    public static void main(String[] args )throws IOmohithException{
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a name");
        String name=rd.readLine();
        System.out.println(name);
    }
}*/
/* Inheritance ---> extends
class Employee{
    private int empId=101;
    private String empName="MAX";
    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int eid){
        this.empId=eid;
    }
    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String eName){
        this.empName=eName;
    }
}
class Manager extends Employee{
    private String desig="Admin";
    public String getDesig(){
        return desig;
    }
    public void setDesig(String desig){
        this.desig=desig;
    }
}
class Main{
    public static void main(String[] args) {
        Manager obj=new Manager();
        System.out.println(obj.getEmpId()+"/"+obj.getEmpName()+"/"+obj.getDesig());
    }
}*/
/* Super keyword
class A{
    int a=30;
}
class B extends A{
    int a=40;
    void show(){
        System.out.println("a="+a+" super.a="+super.a);
    }
}
class Main{
    public static void main(String[] args) {
        B obj =new B();
        obj.show();
    }
}*/
/* super function
class AA{
    int x;
    int y;
    AA(){

    }
    AA(int a, int b){
        this.x=a;
        this.y=b;
        System.out.println("x="+x+"y="+y);
    }
}
class BB extends AA{
    int z;
    BB(){

    }
    BB(int a,int b,int c){
        super(a,b);
        //this.x=a;
        //this.y=b;
        this.z=c;
        System.err.println("x="+x+"y="+y+"z="+z);
    }
}
class Main{
    public static void main(String[] args) {
        BB obj=new BB(100,200,300);
    }
}*/