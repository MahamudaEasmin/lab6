public class PErson6 {

        private  String Name;
        private  int ID;

        public PErson6(String Name, int ID) {
            this.Name = Name;
            this.ID = ID;
        }

        public void setName(String Name){
            this.Name=Name;
        }

        public void setID(int ID){
            this.ID=ID;
        }

        public String getName() {
            return Name;
        }

        public int getID() {
            return ID;
        }
        public static void main(String[] arg){
            PErson6 a1 = new PErson6("Sumona" ,5683);
            System.out.println(a1.getName());
            System.out.println(a1.getID());
            a1.setName("mahamuda");
            a1.setID(221-15-5683);
            System.out.println(a1.getName());
            System.out.println(a1.getID());
        }

}
