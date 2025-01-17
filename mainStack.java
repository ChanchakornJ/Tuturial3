//Chanchakorn Jullapech 
//672115007
import java.util.*;
class mainStack{
    public static void main(String[] args) {
        Stack array = new Stack(5);

        array.push("Chanchakorn","Jullapech",4.0, 672115007);
        array.push("Vidchayada", "Abhi", 4.0, 672115044);
        array.push("Josh", "Seki", 3.0, 672115002);
        array.push("Shoto", "TheRouge", 3.0, 672115001);
        array.push("Sonny", "Brisko", 3.8, 672115010);
        array.push("Shu", "Yamino",2.5, 672115030);
        array.pop();
        array.peek();
        array.display();

    }
}
