
import java.util.*;
import java.lang.*;


public class Librarycat {
    private List <Book> catalog;

    public Librarycat(){

        catalog = new ArrayList<>();
    }
    public void addBook(String title, String author){
        Book book = new Book(title, author);
        catalog.add(book);
        System.out.println("Book added to the Catalog: "+book);
    }
    public void removeBook(String title){
        for(int i=0;i<catalog.size();i++) {
            if (catalog.get(i).getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book removed from the catalog : " + catalog.get(i));
                catalog.remove(i);
                return;
            }
        }
        System.out.println("Book not found in the catalog");
    }
    public void searchBook(String title){
        for(Book book:catalog){
            if(book.getTitle().equalsIgnoreCase(title)){
                System.out.println("book found int the catalog: "+book);
                return;
            }
        }
        System.out.println("Book is not found in the catalog.");

    }
    public void displayCatalog(){
        if(catalog.isEmpty()){
            System.out.println("The catalog is empty");
        }
        else{
            System.out.println("Library Catalog : ");
            for(Book book:catalog){
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args){
        Librarycat librarycat = new Librarycat();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Library Catalog menu : ");
            System.out.println("1. Add a Book");
            System.out.println("2. Remove a Book");
            System.out.println("3. Search for a Book");
            System.out.println("4. Display Catalog");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter book title : ");
                    String title = input.nextLine();
                    System.out.println("Enter author name: ");
                    String author = input.nextLine();
                    librarycat.addBook(title,author);
                    break;
                case 2:
                    System.out.println("Enter the title of the book to be removed : ");
                    String titletoRemove = input.nextLine();
                    librarycat.removeBook(titletoRemove);
                    break;
                case 3:
                    System.out.println("Enter the title of the book to search: ");
                    String titletoSearch = input.nextLine();
                    librarycat.searchBook(titletoSearch);
                    break;
                case 4:
                    librarycat.displayCatalog();
                case 5:
                    System.out.println("Exiting the program.....");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. please enter the valid choice");
            }
        }
    }

}
