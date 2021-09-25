import java.util.ArrayList;

public class arrayNesting {
    public static void main(String[] args) {
        // int[] arr= {0,1,2};
        int[] arr={0,2,1};
        // int[] arr={5,4,0,3,1,6,2};
        System.out.println(arrNesting(arr));
    }

    static int arrNesting(int[] nums){
        ArrayList <Integer> arr= new ArrayList<>();
        arr.add(nums[0]);
        int i=0;
        while(true){
            int start=0;
            int end= arr.size()-1;
            arr.add(nums[arr.get(i++)]);
            // int target=arr.get(i);
            while(start <= end){
                int mid=start+(end-start)/2;
                if(arr.get(i) < arr.get(mid)){
                    end=mid-1;
                }else if(arr.get(i) > arr.get(mid)){
                    start=mid+1;
                }else{
                    arr.remove(mid);
                    return arr.size();
                }
            }
        }
    }
}
