
public class Main {
    public static void main(String[] args) {
        liberary lb=new liberary();
        lb.addBook("java");
        lb.addBook("c++");
        lb.addBook("html");
        lb.addBook("java script");
        lb.addBook("python");

        lb.showAvailableBooks();

        lb.issue_book("c++");
        lb.issue_book("html");


        lb.showAvailableBooks();

        lb.returnBook("c++");

        lb.showAvailableBooks();




    }
}