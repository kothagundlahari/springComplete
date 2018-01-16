package beans;

public class Test {
    
    private int age;
    private String eid;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printData() {
        System.out.println("age:" +age);
        System.out.println("name:" +name);
        System.out.println("eid:" +eid);

    }
}

