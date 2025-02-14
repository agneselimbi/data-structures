import java.util.ArrayList;
import java.util.List;

public class merge_sort_pairs {

   
   public List<Pair> mergeSort(List<Pair> pairs){
        return ms(pairs, 0,pairs.size()-1);
    }
   public static int comparePair(Pair left, Pair right){
       if (left.key>right.key){
           return 1;
       }else if (left.key<right.key){
           return -1;
       }else {
           if (left.value.compareTo(right.value)>1){
               return 1;
           }
            return -1;
       }
    }

    public List<Pair> ms(List<Pair> pairs, int s, int e) {
        // base case : length of the List is 1
        if (e-s+1<=1){
            return pairs;
        }
        
        int m = (s+e)/2;
        //Split the list in 2 
        ms(pairs, s, m);
        ms(pairs, m+1, e);

        // Merge the sorte sub-List<Pairs>
        merge(pairs ,s,m,e);

        return pairs;
        }
    
    public void merge(List<Pair> pairs, int s, int m, int e){
          
        // Create right list and left list 
        List<Pair> left = new ArrayList<>(pairs.subList(s,m+1));
        List<Pair> right = new ArrayList<>(pairs.subList(m+1, e+1));
        int n1 = left.size();
        int n2 = right.size();

        // Merge the elts of the lists
        int l = 0;
        int r = 0; 
        int top=s;
        
        while (l<n1 && r<n2){

            if (left.get(l).key<=right.get(r).key){
                pairs.set(top, left.get(l));
                l++;
            } else if (left.get(l).key>right.get(r).key){
                pairs.set(top, right.get(r));
                r++;
            }
            top++;
            
        }

        while (l<n1){
            pairs.set(top,left.get(l));
             l++;
             top++;
             
        }

        while (r<n2){
            pairs.set(top,right.get(r));
            r++;
            top++;
        }

        }
       
    public static void main(String[] args) {
        merge_sort_pairs solution = new merge_sort_pairs();
        List<Pair> pairs = new ArrayList<>();        
        pairs.add(new Pair(2, "banana"));
        pairs.add(new Pair(5,"apple"));
        pairs.add(new Pair(9,"cherry"));
        pairs.add(new Pair(1,"date"));
        pairs.add(new Pair(9,"elderberry"));
        List<Pair> result = solution.mergeSort(pairs);
        for(Pair p : result){
            System.out.println(p);
        }
    
        Pair p1 = new Pair(1,"apple");
        Pair p2 = new Pair(1,"date");
        
        //int test = merge_sort_pairs.comparePair(p1,p2);
        //System.out.println(test);

    }
    
    }
    


