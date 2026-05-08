import java.util.*;

class Arrlist{
    public static void main(String []args){
        ArrayList<Integer>res =  new ArrayList<>();
        res.add(12);
        res.add(13);
        res.add(14);
        res.add(15);
        res.add(16);
        res.add(17);

        int idx1  = 1, idx2 = 3;
        Swap(res,idx1,idx2);

        // System.out.println(res);
        // Collections.sort(res);
        // System.out.println(res);

        //descending order
        Collections.sort(res,Collections.reverseOrder());
        System.out.println(res);





    }
    public static void Swap(ArrayList<Integer>res,int idx1,int idx2){
        int temp = res.get(idx1);
        res.set(idx1,res.get(idx2));
        res.set(idx2,temp);
        System.out.println(idx1);
        System.out.println(idx2);
        System.out.println(res);


    }
}
