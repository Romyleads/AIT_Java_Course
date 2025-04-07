package homeworks.hw_41.LibraryApp.view;


import homeworks.hw_41.LibraryApp.repository.BookRepository;
import homeworks.hw_41.LibraryApp.repository.BookRepositoryImpl;
import homeworks.hw_41.LibraryApp.repository.UserRepository;
import homeworks.hw_41.LibraryApp.repository.UserRepositoryImpl;
import homeworks.hw_41.LibraryApp.service.MainService;
import homeworks.hw_41.LibraryApp.service.MainServiceImpl;


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
