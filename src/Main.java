public class Main {
    public static void main(String[] args) {
        int x=0;
        int y=99;
        int dem=0;
        for (int i=x;i<=y;i++){
         if (i%9==0){
             dem++;
         }
        }
        System.out.println("cac so chia het cho 9 laf:"+dem);
    }
}