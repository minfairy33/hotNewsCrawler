package top.kanetah.hotNewsCrawler.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * created by kane on 2017/10/28.
 */
@Component
public class DaoProxy {

    private Logger logger = LoggerFactory.getLogger(DaoProxy.class);

    public void beforePerformance() {
        logger.info("访问数据库");
    }
}
