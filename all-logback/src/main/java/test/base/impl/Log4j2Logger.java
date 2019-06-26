package test.base.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import test.base.BaseLogger;

/**
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
public class Log4j2Logger extends BaseLogger {
    private Logger logger = LogManager.getLogger(Log4j2Logger.class.getName());


    @Override
    public void log() {
        logger.info(getContent());
    }
}
