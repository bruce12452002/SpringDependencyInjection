package bruce.home.SpringDependencyInjection.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//@Component("cApple")
public class Apple {
    private Banana banana;

    @Autowired
    public Apple(@Qualifier("cBanana") Banana banana) {
        this.banana = banana;
    }
}
