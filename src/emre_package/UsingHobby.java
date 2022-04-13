package emre_package;

import java.util.ArrayList;

public class UsingHobby {
    public static void main(String[] args) {

        ArrayList<Hobby> list=new ArrayList<>();
        list.add(new Hobby("Fishing",300,true,false));
        list.add(new Hobby("Playing sports",250,true,true));
        list.add(new Hobby("Hiking", 350,true,true));
        list.add(new Hobby("Drinking",1000,false,false));
        list.add(new Hobby("Painting",200,false,true));
        list.add(new Hobby("Photography",600,true,false));
        System.out.println(list);
        System.out.println();
        for(Hobby each:list){
            each.doIt();
        }
        System.out.println();
        System.out.println("Indoor Hobbies");
        ArrayList<Hobby> list2= new ArrayList<>(list);
        list2.removeIf(n->n.isOutdoors);
        System.out.println(list2);
        System.out.println();
        System.out.println("Hobbies can be done alone");
        ArrayList<Hobby>list3=new ArrayList<>(list);
        list3.removeIf(k->k.requiresOthers);
        System.out.println(list3);
        System.out.println();
        System.out.println("Hobbies cost less than $500");
        ArrayList<Hobby>list4=new ArrayList<>(list);
        list4.removeIf(j->j.annualCost>500);
        System.out.println(list4);
        System.out.println();
    }
}

