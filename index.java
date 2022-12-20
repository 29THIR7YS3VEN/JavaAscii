public class AsciiValue {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter character ");
        char input = myObj.nextChar();
        
        char ch = input;
        int ascii = ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }
}
