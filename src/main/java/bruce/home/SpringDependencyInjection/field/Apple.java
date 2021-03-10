package bruce.home.SpringDependencyInjection.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("fApple")
public class Apple {
//    @Autowired
//    @Qualifier("fBanana")
    @Resource(name = "fBanana")
    private Banana banana;
}
