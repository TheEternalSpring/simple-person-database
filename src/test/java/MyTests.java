import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.nio.file.Path;

public class MyTests {

    @BeforeEach
    public void setUp() throws Exception {
        Path tehDatabase = Path.of("Datas.txt");
        FileWriter databaseWriter = new FileWriter(tehDatabase.toFile(),true);

    }


    @Test
    public void test1(){
        //Person testPerson = new Person('john');

    }
}
