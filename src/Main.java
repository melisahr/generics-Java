public class Main {
    public static void main(String[] args) {

        //Reference Data Types
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {5.5,4.4,3.3,2.2,1.1};
        Character[] charArray = {'H', 'E','L','L','O'};
        String[] stringArray = {"B","Y","E"};

        //Call methods
        /*
        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);*/


        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));
    }
    //Generic method
    public static <Thing> void displayArray(Thing[] array){
            for(Thing x: array){
            System.out.println(x+" ");
        }
        System.out.println();
    }
    //Generic method with a return type
    public static <Thing> Thing getFirst(Thing[] array){
      return array[0];
    }

}