package test.base.impl;

import org.apache.log4j.Logger;
import test.base.BaseLogger;

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
public class Log4jLogger extends BaseLogger {
    Logger logger = Logger.getLogger(Log4jLogger.class.getName());


    @Override
    public void log() {
        logger.info(getContent());
    }
}
