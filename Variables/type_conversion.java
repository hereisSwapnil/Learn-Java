public class type_conversion{
    public static void main(String args[]){
        // byte < short < int < float < long < double
        // double has greatest size
        // small data types can be converted to large data types but large data types cannot be converted into small ones
        // this is also called lossy conversion
        int a = 4;
        float b = a;
        System.out.print(b);
        // implicit conversion , wideing conversion
    }
}