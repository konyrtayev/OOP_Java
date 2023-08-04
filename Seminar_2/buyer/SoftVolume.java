package Seminar_2.buyer;

import java.util.ArrayList;

import Seminar_2.delivery.Beverage;

public class SoftVolume {
    
    public ArrayList <Beverage> getSortVoiume(ArrayList <Beverage> no_sort_list){
        ArrayList <Beverage> sort_list = new ArrayList<>();
        int i;
        double max;
        int max_index;
        while (no_sort_list.size() > 0){
            max = no_sort_list.get(0).getVolume();
            max_index = 0;
            for (i=1; i<no_sort_list.size(); i++){
                if(no_sort_list.get(i).getVolume()>max){
                    max = no_sort_list.get(i).getVolume();
                    max_index = i;
                }
            }
            sort_list.add(no_sort_list.get(max_index));
            no_sort_list.remove(max_index);
        }

        return sort_list;

    }

}
