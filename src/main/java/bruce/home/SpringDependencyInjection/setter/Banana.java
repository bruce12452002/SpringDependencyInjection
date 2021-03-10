package bruce.home.SpringDependencyInjection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("sBanana")
public class Banana {
    private Apple apple;

//    @Autowired
    @Resource(name = "sApple")
    public void setApple(/*@Qualifier("sApple")*/ Apple apple) {
        this.apple = apple;
    }
}
