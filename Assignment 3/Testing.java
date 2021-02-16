
public class Testing {

    public static void main(String[] args) {
         
        RyansObject derik = new RyansObject("Derik", "C", "Dreher", "0", 1);
        RyansObject ryan = new RyansObject("Ryan","W","Dreher","0", 2, derik);
        RyansObject idiot = new RyansObject();

        System.out.println(derik.getName());
        System.out.println(ryan.getName());
        System.out.println(idiot.getName());
        System.out.println(ryan.getBrother());
        System.out.println(derik.getBrother());
        derik.setBrother(ryan);
        System.out.println(derik.getBrother());
        System.out.println(ryan.getBrotherName());
    }
}

class RyansObject {

    private String first_name;
    private String middle_name;
    private String last_name;
    private String dob;
    private int sin;
    private RyansObject brother;

    RyansObject() {

        this.first_name = null;
        this.middle_name = null;
        this.last_name = null;
        this.dob = null;
        this.sin = 0;
        this.brother = null;
    }

    RyansObject(String first_name, String middle_name, String last_name, String dob, int sin) {

        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.dob = dob;
        this.sin = sin;
        this.brother = null;
    }

    RyansObject(String first_name, String middle_name, String last_name, String dob, int sin, RyansObject brother) {

        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.dob = dob;
        this.sin = sin;
        this.brother = brother;
    }

    public String getName() {

        if(this.first_name == null || this.middle_name == null || this.last_name == null) 
            return "Access Denied.";

        return this.first_name + " " + this.middle_name + " " + this.last_name;
    }

    public RyansObject getBrother() {

        return this.brother;
    }

    @Override
    public String toString() {

        return this.first_name + " is my brother";
    }

     public void setBrother(RyansObject brother) {

        this.brother = brother;
     }

     public String getBrotherName() {

        return this.brother.getName();
     }
}