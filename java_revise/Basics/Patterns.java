
class Patterns{
    public static void main(String[] args){
        for(int i=0; i<4; i++){
            for(int j=0; j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int n=4;
        int m=5;
        for(int i=1; i<=n; i++){
            for(int j=1;j<=m;j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=4; i>0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}