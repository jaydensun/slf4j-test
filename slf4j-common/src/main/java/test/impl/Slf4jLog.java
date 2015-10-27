package test.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.BaseLog;

/**
 *
 * <pre>
 * HISTORY
 * ****************************************************************************
 *  ID   DATE            PERSON          REASON
 *  1    2015-10-26       089245          Create
 * ****************************************************************************
 * </pre>
 *
 * @author 089245
 * @since 1.0
 */
public class Slf4jLog extends BaseLog {
    Logger logger = LoggerFactory.getLogger(Slf4jLog.class);

    @Override
    public void log() {
        logger.info(getLogContent());
    }
}
