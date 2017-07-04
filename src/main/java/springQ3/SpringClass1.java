package springQ3;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component

public class SpringClass1 {

    void throwException() throws IOException {
        System.out.println("Display Method Called.");
        throw new IOException();
    }
}
