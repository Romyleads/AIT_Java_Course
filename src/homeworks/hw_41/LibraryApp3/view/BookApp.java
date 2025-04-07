package homeworks.hw_41.LibraryApp3.view;


import homeworks.hw_41.LibraryApp3.repository.BookRepository;
import homeworks.hw_41.LibraryApp3.repository.BookRepositoryImpl;
import homeworks.hw_41.LibraryApp3.repository.UserRepository;
import homeworks.hw_41.LibraryApp3.repository.UserRepositoryImpl;
import homeworks.hw_41.LibraryApp3.service.MainService;
import homeworks.hw_41.LibraryApp3.service.MainServiceImpl;


/*** Author: Roman Romashko Date: 18.03.2025 ***/

public class BookApp {
    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepositoryImpl();
        UserRepository userRepository = new UserRepositoryImpl();


        MainService service = new MainServiceImpl(bookRepository,userRepository);
        Menu menu = new Menu(service);
        menu.start();
        
    }
}
