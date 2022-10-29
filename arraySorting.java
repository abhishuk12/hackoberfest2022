public class arraySorting {    public static void main(String[] args) {
    int[] arr = {2,3,5,16,7,9};
    System.out.println(sort(arr,0));
}
    //this will check weather array is sorted or not
    static boolean sort(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sort(arr,index+1);
    }

}
