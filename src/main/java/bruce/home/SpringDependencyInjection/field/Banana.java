package bruce.home.SpringDependencyInjection.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("fBanana")
public class Banana {
//    @Autowired
//    @Qualifier("fApple")
    @Resource(name = "fApple")
    private Apple apple;
}
