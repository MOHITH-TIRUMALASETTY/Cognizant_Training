class Clothing1{
    int id,size;
    double price;
    char color;

    Clothing1(){

    }
    Clothing1(int id,int size,double price,char color){
        this.id=id;
        this.size=size;
        this.price=price;
        this.color=color;
    }
    void display(){
        System.out.println(id+" ");
        System.out.println(size+" ");
        System.out.println(price+" ");
        System.out.println(color+" ");
    }
}
class shirt extends Clothing1{
    
    int fit;
    shirt(){
    
    }
    shirt(int id,int size,double price,char color,int fit){
        super(id,size,price,color);
        this.fit=fit;
        System.out.println(" id= "+id+" size= "+size+" price= "+price+" color= "+color+" fit= "+fit);
    }
    
}
class trousers extends Clothing1{
    
    int fit;
    String gender;
    trousers(){

    }
    trousers(int id,int size,double price,char color,int fit,String gender){
        super(id, size,price, color);
        this.fit=fit;
        this.gender=gender;
        System.out.println("id= "+id+" size= "+size+" price= "+price+" color= "+color+" gender= "+gender+" fit= "+fit+" gender= "+gender);
    }
    
}

class Clothing{
    public static void main(String[]args){
        shirt obj1=new shirt(101,25,2000.00,'W',1);
        shirt obj2=new shirt(102,35,3000.00,'M',2);
        shirt obj3=new shirt(103,45,4000.00,'O',3);
        trousers obj4=new trousers(98,38,1001.00,'B',1,"Male");
        trousers obj5=new trousers(99,36,4561.00,'W',3,"Female");
        trousers obj6=new trousers(100,34,6501.00,'G',2,"Male");
    }

}