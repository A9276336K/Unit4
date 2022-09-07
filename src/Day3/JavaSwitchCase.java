package Day3;

public class JavaSwitchCase {

    static void city(String city){

        if(city=="Mumbai") {

            System.out.println("Financial city");
        } else if (city=="Kolkata"){
            System.out.println("City of Joy");
        } else if (city=="Delhi") {
            System.out.println("Capital of the Country");
        } else if (city=="Bangalore") {
            System.out.println("Cyber city");
        }else{
            System.out.println("May be Other Indian City");
        }
    }


    public static void main(String[] args) {

        city("Delhi");

    }



}
