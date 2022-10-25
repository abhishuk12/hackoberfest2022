public class TableFrom1to20 {
    public static void main(String[] args) {
        for(int j=1;j<=20;j++){
            int tableOf=j;
            for(int i=1;i<=10;i++){
                tableOf*=i;
                System.out.println(tableOf);
            }
            System.out.println();
        }
        
    }
    
}
