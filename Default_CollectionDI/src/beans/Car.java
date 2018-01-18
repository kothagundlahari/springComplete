package beans;


import java.util.List;
import java.util.Set;


public class Car {

    private List fruits[];
    private Set cricketers[];


    public void setFruits(List[] fruits) {
        this.fruits = (java.util.List[]) fruits;
    }

    public void setCricketers(Set[] cricketers) {
        this.cricketers = cricketers;
    }



    public void printData(){
        System.out.println(".............");
        for (Object fruit: fruits){
            System.out.println(fruit);
        }

        System.out.println(".............");
        for(Object cricketer:cricketers){
            System.out.println(cricketer);
        }


        }
}
