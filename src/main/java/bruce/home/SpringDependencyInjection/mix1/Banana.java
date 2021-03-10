package bruce.home.SpringDependencyInjection.mix1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("m1Banana")
public class Banana {
    private Apple apple;

    @Autowired
    public Banana(@Qualifier("m1Apple") Apple apple) {
        this.apple = apple;
    }
}
