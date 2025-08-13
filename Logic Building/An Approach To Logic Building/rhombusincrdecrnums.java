class rhombusincrdecrnums{
    public static void main(String[] args){
        int rows=10;
        //top
        for(int i=1;i<=rows;i++){
            for(int spaces=1;spaces<=rows-i;spaces++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
        //down
        for(int i=1;i<=rows;i++){
            for(int spaces=1;spaces<=i;spaces++){
                System.out.print(" ");
            }
            for(int j=1;j<=rows-i;j++){
                System.out.print(j);
            }
            for(int k=rows-i-1;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}