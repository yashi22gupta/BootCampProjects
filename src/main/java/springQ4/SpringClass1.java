package springQ4;

import org.springframework.stereotype.Component;

@Component

public class SpringClass1 {

    @Deprecated
    void display()
    {
        System.out.println("Depricated Display Method Called.");
    }

    void display2()
    {
        System.out.println("Non depricated method called.");
    }
}
