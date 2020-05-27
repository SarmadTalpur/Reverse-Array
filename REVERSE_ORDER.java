public class REVERSE_ORDER {
    public static void REVERSE(int a[]) {
        int temp=0;
        for (int i=a.length-1; i>=0; i--) {
            System.out.print(a[i]);
            System.out.println(" index:"+temp);
            temp++;
        }
    }
    public static void main(String[] args) {
        int numbers[]= new int[]{3,7,-4,6,9};
        REVERSE(numbers);
    }
}