class CompileTimePolymorphism {
    static int sum(int a, int b){return a+b;}

    static float sum(float a, float b){return a+b;}

    static float sum(float a, int b){return a+b;}
    public static void main(String[] args) {
        System.out.println(sum(7.0f,9.0f));
        System.out.println(sum(99,88.0f));
        System.out.println(sum(17,19));
    }
}
