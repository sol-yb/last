class Book{
    string title, author;
    int isbn;
    Book(string title, string author, int isbn);
    this.title=title;
    this.author=author;
    this.isbn= isbn;
    void getTitle(){System.out.println("the book title is:"+ title)};
    void getAuthor(){System.out.println("the book author was: "+ author)};
    void getISBN NO(){System.out.println("the book id no is: ")};
    public stati void main(string args){
        Book b1= new Book;
        b1.getTitle();
        b1.getAuthor();
        b1.getISBN();
    }
}
