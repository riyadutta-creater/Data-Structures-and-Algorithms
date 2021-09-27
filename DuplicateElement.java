import java.util.HashSet;
import java.util.Set;


public class DuplicateElement{
    public static void main(String args[]) {
        int arr[] = {1,4,5,1,3,5,7,8,5};
        Set<Integer> uniqueNo = new HashSet<>();
        Boolean isDuplicateNo = false;
        for(int i=0;i<arr.length;i++){
            if(uniqueNo.contains(arr[i])){
               isDuplicateNo = true;
               System.out.println(arr[i]); 
               break;
            }
            else{
                uniqueNo.add(arr[i]);
            }
        }
        if(!isDuplicateNo){
            System.out.println(-1);
        }
    }
}