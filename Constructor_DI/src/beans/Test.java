package beans;

public class Test {
    
    private int age;
//    private String eid;


    public Test(int age) {
        this.age = age;
    }

//    public Test(String eid) {
//        this.eid = eid;
//    }

    public void printData(){
        System.out.println("age:"+age);
//        System.out.println("eid:"+eid);
    }


}

