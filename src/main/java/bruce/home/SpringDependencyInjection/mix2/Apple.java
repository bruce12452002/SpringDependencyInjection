package bruce.home.SpringDependencyInjection.mix2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Spring 按照自然排序注入，先注入的使用建構子注入有可能會有循環依賴，使用 @Lazy 可以在執行時注入
 */
@Component("m2Apple")
public class Apple {
    private Banana banana;

    @Autowired
    public Apple(@Lazy @Qualifier("m2Banana") Banana banana) {
        this.banana = banana;
    }
}
