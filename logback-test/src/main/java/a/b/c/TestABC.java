package a.b.c;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * √Ë ˆ£∫
 * <pre>
 * HISTORY
 * ****************************************************************************
 *  ID   DATE            PERSON          REASON
 *  1    2015-10-27       089245          Create
 * ****************************************************************************
 * </pre>
 *
 * @author 089245
 * @since 1.0
 */
public class TestABC {
    static Logger logger = LoggerFactory.getLogger(TestABC.class.getName());
    public static void main(String[] args) {
        logger.info("info ...");
        logger.warn("warn ...");
        logger.error("error ...");
    }
}
