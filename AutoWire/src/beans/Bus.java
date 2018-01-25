package beans;

public class Bus {

    private Bus bus;
    private Engine engine;

    public Bus(Bus bus, Engine engine) {
        this.bus = bus;
        this.engine = engine;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void printData(){
        System.out.println("bus engine" + engine.getModelYear());
    }
}
