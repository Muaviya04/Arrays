public class StringArray {
    public static void main(String[] args) {
        String[] names = {"goutham", "muaviya", "abc" };

        for (String values : names )
        {
            System.out.println("The name is :" +values);
        }
        System.out.println(names[1]);
        System.out.println(names.length);
    }
}
