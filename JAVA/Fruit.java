public class Fruit{
    String fruitName;
    String taste;
    String size;
    Fruit(String fruitName,String taste,String size){
        this.fruitName=fruitName;
        this.taste=taste;
        this.size=size;
    }
    void eat(){
        System.out.println("Fruit="+fruitName+" "+"Taste="+taste+" "+"size="+size);
    }
}
 
class Apple extends Fruit {
    Apple(String fruitName, String taste,String size){
        super(fruitName, taste,size);
    }
    void eat(){
        super.eat();
    }
}
   
class Orange extends Fruit{
    Orange(String fruitName,String taste, String size){
        super(fruitName,taste,size);
    }
    void eat(){
        super.eat();
    }
}
class HandsOn11{
    public static void main(String[] args){
        Apple obj=new Apple("Apple","sweet","small");
        Orange obj1=new Orange("Orange","Sour","medium");
        obj.eat();
        obj1.eat();
    }
}
  
