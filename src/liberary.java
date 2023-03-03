class liberary{
    String books[];
    int number_of_books;

    public liberary() {
        this.number_of_books=0;
        books =new String[10];
    }

    public void addBook(String book){
        books[number_of_books]=book;
        number_of_books++;
        System.out.println(book +" has been added");
    }

    public void showAvailableBooks(){
        System.out.println("available books");
        for (int i=0; i<books.length; i++){
            if (books[i]==null){
                continue;
            }
            System.out.println(books[i]);
        }
    }

    public void issue_book(String book){
        for (int i=0; i<books.length; i++){
            if (books[i]==null){
                continue;
            }
            if(books[i]==book){
                System.out.println(books[i]+" has been issued");
                books[i]=null;
            }
        }
    }


    public void returnBook(String book){
        addBook("c++");
    }
}