import java.util.*;

public class MergeSort {

    public static ArrayList<Comparable> mergeSort(ArrayList<Comparable> list){
        if (list.size() <= 1)
            return list;
        else{
            ArrayList<Comparable> x = new ArrayList<Comparable>();
            ArrayList<Comparable> y = new ArrayList<Comparable>();
            for (int i = 0; i < list.size()/2; i++)
                x.add(list.get(i));
            for (int i = list.size()/2; i < list.size(); i++)
                y.add(list.get(i));
            ArrayList<Comparable> array1 = mergeSort(x);
            ArrayList<Comparable> array2 = mergeSort(y);
            return sort(array1,array2);
        }
    }
    public static ArrayList<Comparable> sort(ArrayList<Comparable> list1, ArrayList<Comparable> list2){
        ArrayList<Comparable> result = new ArrayList<Comparable>();
        int index1 = 0, index2 = 0;
        for (int i = 0; i < list1.size() + list2.size(); i++){
            if (index1 < list1.size() && index2 < list2.size()){
                if (list1.get(index1).compareTo(list2.get(index2)) < 0){
                    result.add(list1.get(index1));
                    index1++;
                }else{
                    result.add(list2.get(index2));
                    index2++;
                }
            }else if (index1 < list1.size()){
                result.add(list1.get(index1));
                index1++;
            }else{
                result.add(list2.get(index2));
                index2++;
            }
        }
        return result;
    }


    public static String toString(ArrayList<Comparable> list){
        String string = "";
        for (int i = 0; i < list.size(); i++){
            string += list.get(i) + " ";
        }
        return string;
    }

    public static void main(String[] args){
        ArrayList<Comparable> a = new ArrayList();
        Person d=new Person("david",17);
        Person p=new Person("pavel",23);
        Person e=new Person("eugene",4);
        a.add(d);
        a.add(p);
        a.add(e);

        System.out.println(toString(mergeSort(a)));
    }
}
