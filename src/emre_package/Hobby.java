package emre_package;

public class Hobby {

    String name;
    double annualCost;
    Boolean isOutdoors,requiresOthers;


    public Hobby (String name){
        this.name=name;
    }

    public Hobby(String name, double annualCost){
        this(name);
        this.annualCost=annualCost;
    }

    public Hobby(String name, double annualCost,boolean isOutdoors,boolean requiresOthers){
        this(name,annualCost);
        this. isOutdoors=isOutdoors;
        this. requiresOthers=requiresOthers;
    }

    public void doIt(){
        System.out.println("Doing "+ name+  (isOutdoors? " It i an outdoor sport " : " It is an indoor sport") );
    }

    public String toString(){
        String str=name;
        str+=" $"+(annualCost >0? annualCost:"");
        str+=" "+(isOutdoors? " Outdoor ": "Indoor");
        str+=" "+(requiresOthers? " requires more than one people " : " does not require others ");
        return str;
    }




}