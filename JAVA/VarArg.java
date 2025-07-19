public class VarArg {
    static void show(int x[]){
    //static void show(int ... arr){
        for (int i:x){
            System.err.println(i);
        }
    }
    public static void main(String[] args) {
        int a[]={20,30,40,50,60};
        show(a);
    }
}
