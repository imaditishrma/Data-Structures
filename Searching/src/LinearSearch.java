public class LinearSearch {
    public static int Search(int[] Array, int target){
        int index = -1;
        for(int i=0; i<Array.length; i++){
            if (Array[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
            int target=70;
            int[] Array= {12,13,45,78,90,70,76,34,96,10 };
            System.out.println(Search(Array, target));
    }
}
