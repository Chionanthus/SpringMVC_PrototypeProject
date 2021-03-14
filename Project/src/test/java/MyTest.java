import com.chionanthus.pojo.Books;
import com.chionanthus.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01()
    {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("services.xml");
        BookService bookServiceImpl =(BookService) classPathXmlApplicationContext.getBean("bookServiceImpl");
        for (Books book : bookServiceImpl.queryAllBooks()) {
            System.out.println(book);
        }
    }

}
