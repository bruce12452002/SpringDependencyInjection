package bruce.home.SpringDependencyInjection.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("cBanana")
public class Banana {
    private Apple apple;

    @Autowired
    public Banana(@Qualifier("cApple") Apple apple) {
        this.apple = apple;
    }
}
