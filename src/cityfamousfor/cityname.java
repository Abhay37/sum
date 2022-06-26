package cityfamousfor;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class cityname {


    @Contract(pure = true)
    public static @NotNull String property(String city){
        if(city=="Mumbai")
        {
            return "Financial city";
        }
        else if(city=="Kolkata")
        {
            return "City of Joy";
        }
        else if(city=="Delhi")
        {
            return "Capital of the country";
        }
        else if(city=="Bangalore")
        {
            return "Cyber City";
        }
        else {
            return "May be Other Indian City";
        }
    }





    public static void main(String[] args) {




        cityname obj1=new cityname();

        String res= obj1.property("Bangalore");

        System.out.println(res);

        }




        }















