package beans;

public class Car {
    private String carName;
    private Engine engineName;


    public void setCarName(String carName) {
        this.carName = carName;
    }


    public void setEngineName(Engine engineName) {
        this.engineName = engineName;
    }


    public void printData() {

        System.out.println("carName='" + carName );
        System.out.println("engineName=" + engineName.geteModleYear());


    }
}
