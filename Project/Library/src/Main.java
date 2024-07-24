package Project.Library.src;

import java.util.Scanner;

public class Main {
    private static Book library [] = new Book[120];
    private static int count = 0;

    public static int AddBook(Scanner sc){
        if(Book.instance >= 120) {
            System.out.println("The library is full");
            return 1;
        }
        System.out.print("Give me the title of the book : ");
        String bookTitle = sc.nextLine();
        // sc.nextLine();

        System.out.print("Give me the Author of the book : ");
        String bookAuthor = sc.nextLine();
        // sc.nextLine();

        System.out.print("Give me the year of the book : ");
        int bookYear = sc.nextInt();
        sc.nextLine();

        library[count] = new Book(bookTitle, bookAuthor, bookYear);
        System.out.println(library[count].toString());
        count++;
        return 0;
    }

    public static void DisplayBooks(){
        for (int i = 0; i < count; i++) {
            System.out.println("Book number" + (i+1) + "\n" + library[i].toString());
        }
    }

    public static int SearchBook(Scanner sc){
        System.out.print("What's the title of the book : ");
        String titleSearched = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (titleSearched.equals(library[i].getTitle())) {
                System.out.println("The book searched exist and it's Book number" + (i+1) + "\n" + library[i].toString());
                return i;
            }
        }
        System.out.println("The book searched doens't exist");
        return -1;
    }

    public static void DeleteBook(Scanner sc){
        int deleteBookId = SearchBook(sc);
        if (deleteBookId != -1) {
            for (int i = deleteBookId; i < count ; i++) {
                library[i] = library[i+1];
            }
        }
        library[count] = null;
        count--;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose an action");
            System.out.println("┌───────────────────────────────┐\r\n" + //
                                "│1 - Add a book\t\t\t│\r\n" + //
                                "│\t\t\t\t│\r\n" + //
                                "│2 - Display all books\t\t│\r\n" + //
                                "│\t\t\t\t│\r\n" + //
                                "│3 - Search for a book by title\t│\r\n" + //
                                "│\t\t\t\t│\r\n" + //
                                "│4 - Delete a book by title\t│\r\n" + //
                                "│\t\t\t\t│\r\n" + //
                                "│5 - Exit\t\t\t│\r\n" + //
                                "└───────────────────────────────┘");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    AddBook(sc);
                    break;

                case 2:
                    DisplayBooks();
                    break;

                case 3:
                    SearchBook(sc);

                case 4:
                    DeleteBook(sc);
            
                default:
                    break;
            }
        } while (choice != 5);
        sc.close();

    }
}
