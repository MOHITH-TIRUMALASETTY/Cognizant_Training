class Shirt{
    private int fit;
    private int size;
    private String color;
    private int cost;
    Shirt(){

    }
    Shirt(int fit, int size, String color,int cost){
        this.fit=fit;
        this.size=size;
        this.color=color;
        this.cost=cost;
    }
    public String toString(){
        return fit+"/"+size+"/"+color+"/"+cost;
    }
}
class ArrayDemo{
    public static void main (String args []){
        int a []=new int[5];
            a[0]=1;
            a[1]=2;
            a[3]=3;
            a[4]=4;
            //a[5]=5;
        System.out.println(a[3]);

        Shirt sh[] = new Shirt[1];
        sh[0] = new Shirt(23,34,"blue",100);
        System.out.println(sh[0]);

    }
}