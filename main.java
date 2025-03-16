public class main {
    public static void main(String[] args) {
    int[]arr={1,2,3,4,5,6};
    System.out.println(java.util.Arrays.toString(Filterevenindexodd(arr)));
    }
    public static int[]Filterevenindexodd(int[]arr){
        int counter=0;
        for(int i=0;i<arr.length;i+=2){
            if(arr[i]%2!=0){
                counter++;
            }
        }
        int[] result=new int[counter];
        int index=0;
        for(int i=0;i<arr.length;i+=2){
            if(arr[i]%2!=0){
                result[index++]=arr[i];
            }
        }
        return result;
    }
}
