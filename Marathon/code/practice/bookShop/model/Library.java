package practice.bookShop.model;

public interface Library {
    //добавить книгу;
    //удалить книгу;
    //найти книгу;
    //кол-во книг;
    //напечатать список книг.

    boolean addBook(Book book);
    Book removeBook(int isbn);
    Book findBook(int isbn);
    int quantityBook();
    void printBook();

}
