public class Menu {
    public static void main(String[] args) {
        System.out.println("a.\tNew document\nb.\tOpen document\nc.\tSave as ... \nd.\tMail document to ... ");
        System.out.print("\tPlease, make your choice (a-d): ");
        char c;
        c = SIn.readChar();
        if(c == 'a')
            System.out.println("You chose to create a new document");
        else if(c == 'b')
            System.out.println("You chose to open a document");
        else if(c == 'a')
            System.out.println("You chose save the current document");
        else if(c == 'b')
            System.out.println("You chose to send the current document by email");
        else System.out.println("Your choice is not valid");

    }
}
