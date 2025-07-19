final class Product{
    int prodId=1001;
    void displayProduct(){

    }
}

class Electronics extends Product{
    void demo(){
        prodId = 1002;

    }
}
class Final{
    public static void main(String [] args){
        Electronics obj = new Electronics();
        obj.demo();
    }
}