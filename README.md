Chanchakorn Jullapech 672115007

#How to compile and run the program
Java Development Kit is required
User have to create an array using Stack ArrayName = new Stack(size) to create an array with preferable size
When adding array, user have to write ArrayName.push("First name","Last name", GPA, Student ID);
ArrayName.pop to remove last Student
ArrayName.peek to retrieve top Student's information

#Example output
Input: 
 array.push("Chanchakorn","Jullapech",4.0, 672115007);
        array.push("Vidchayada", "Abhi", 4.0, 672115044);
        array.push("Josh", "Seki", 3.0, 672115002);
        array.push("Shoto", "TheRouge", 3.0, 672115001);
        array.push("Sonny", "Brisko", 3.8, 672115010);
        array.push("Shu", "Yamino",2.5, 672115030);
        array.pop();
        array.peek();
        array.display();

Output: 
Chanchakorn, Jullapech, 4.0, 672115007 pushed into the stack
Vidchayada, Abhi, 4.0, 672115044 pushed into the stack
Josh, Seki, 3.0, 672115002 pushed into the stack
Shoto, TheRouge, 3.0, 672115001 pushed into the stack
Sonny, Brisko, 3.8, 672115010 pushed into the stack
Stack overflow
Sonny, Brisko, 3.8, 672115010 popped from the stack
Shoto, TheRouge, 3.0, 672115001
Student list:
Chanchakorn, Jullapech, 4.0, 672115007
Vidchayada, Abhi, 4.0, 672115044
Josh, Seki, 3.0, 672115002
Shoto, TheRouge, 3.0, 672115001
