import java.util.ArrayList;
import java.util.List;
public class insert_sort_pairs {

    public List<List<Pair>> insertionSort(List<Pair> pairs){
        if (pairs.isEmpty()){
            return new ArrayList<>();
        }
        List<List<Pair>> result = new ArrayList<>();
        result.add(new ArrayList<>(pairs));
        for(int i = 1; i < pairs.size(); i++){
            int j = i-1;
            
            while (j >= 0 && comparePair(pairs.get(j),pairs.get(j+1))){
                Pair temp = pairs.get(j);
                pairs.set(j , pairs.get(j+1));
                pairs.set(j+1,temp);                
                j--;
            }
            List<Pair> copy = new ArrayList<>(pairs);
            result.add(copy);
        }
        return result;
    }


    public static boolean comparePair(Pair left, Pair right){
        if (left.key > right.key){
            return true;
        }else{
            return false;
        }
    }

     public static void main(String[] args) {
        insert_sort_pairs solution = new insert_sort_pairs();
        List<Pair> pairs = new ArrayList<>();        
        pairs.add(new Pair(5,"apple"));
        pairs.add(new Pair(2, "banana"));
        pairs.add(new Pair(9,"cherry"));
        pairs.add(new Pair(1,"date"));
        pairs.add(new Pair(9,"elderberry"));

        List<List<Pair>> res = solution.insertionSort(pairs);
       
        System.out.println(res);
}
}
