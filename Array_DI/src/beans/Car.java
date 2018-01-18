package beans;

public class Car {
    private String carName[];
    private Engine engineName[];

    public String[] getCarName() {
        return carName;
    }

    public void setCarName(String[] carName) {
        this.carName = carName;
    }

    public Engine[] getEngineName() {
        return engineName;
    }

    public void setEngineName(Engine[] engineName) {
        this.engineName = engineName;
    }

    public void printData(){
        for (String  Car: carName){
            System.out.println(carName);
        }


    }


}
