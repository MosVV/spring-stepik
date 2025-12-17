package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{


    public void getBook(String bookName){
        System.out.println("Мы берем книгу в UniLibrary "+bookName);
        return;
    }

    protected String returnBook(){
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "Ok";
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал в UniLibrary");
    }

}
