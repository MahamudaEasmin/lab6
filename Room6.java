public class Room6 {
    int roomno;
    String roomtype;
    float roomarea;
    boolean Acmachine;

    public Room6() {
        System.out.println("Hello, an object of Room class is created.");
    }

    public Room6(int no, String type, float area, boolean Ac) {
       roomno = no;
        roomtype = type;
        roomarea = area;
        Acmachine = Ac;
    }

    public void displayData() {
        System.out.println(roomno);
        System.out.println(roomtype);
        System.out.println(roomarea);
        System.out.println(Acmachine);
    }
    public static void main(String[] args) {
        Room6 obj = new Room6(222,"CSE",201.5f,true);
        Room6 obj1=new Room6();
        obj.displayData();
    }

}
