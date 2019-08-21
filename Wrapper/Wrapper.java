/* Justin Rojas */
/* Format definition: Wrapper Classes*/
/* A Wrapper class is a class whose object wraps or contains a primitive data types.
 When we create an object to a wrapper class, it contains a field and in this field, 
 we can store a primitive data types. 
 In other words, we can wrap a primitive value into a wrapper class object. Thus making it formal */

 //Java program to convert primitive into objects  
//Autoboxing example of int to Integer  
public class Wrapper {  
    public static void main(String args[]){  
    //Converting int into Integer  
    int a=12;  
    Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
    Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
    
    //Unboxing example
    //Converting Integer to int    
        Integer b = new Integer(34);
int w=b.intValue();//converting Integer to int explicitly  
int z=b;//unboxing, now compiler will write b.intValue() internally    

    System.out.println(a+" "+i+" "+j);  

    System.out.println(b+" "+w+" "+z);  
    }


/**
 * Is this writtin correctly and if its not, what is the correct format?
 * ArrayList<String> Cars = new ArrayList<String>();  
 *Cars.add("Tesla");
 *Cars.add("Mclaren");
 *Cars.add("Lamborgini");
 *Cars.add("Ferrari");
 *Cars.add("Maserati");

 System.out.println(Cars);
 * Why are java wrapper classes imuttable? 
*/

}