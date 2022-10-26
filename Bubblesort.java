public class Bubblesort {
    public static void main(String [] args){
        int [] a={2,1,4,7,8,0};
        int n=a.length;
       
        for(int i=0;i<=n-1;i++){
            boolean sorted=True;
            for(int j=0;j<=n-1;j++){
                if(a[j+1]< a[j]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;

                    sorted=False;


                }
            }
            if(sorted==True){
                break;
            }
        }
        
     //for each loop is used - its is used to print itrable element 
     for(int item:a){
System.out.print(item+" "); 
     }   
         
    }
    
}
