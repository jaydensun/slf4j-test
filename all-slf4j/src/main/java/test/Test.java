package test;

import org.slf4j.bridge.SLF4JBridgeHandler;
import test.base.ILogger;
import test.base.impl.JclLogger;
import test.base.impl.JulLogger;
import test.base.impl.Log4jLogger;
import test.base.impl.Slf4jLogger;
import uk.org.lidalia.sysoutslf4j.context.SysOutOverSLF4J;

import java.util.ArrayList;
import java.util.List;

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
public class Test {
    public static void main(String[] args) {
        SLF4JBridgeHandler.install();
        SysOutOverSLF4J.sendSystemOutAndErrToSLF4J();

        List<ILogger> loggers = new ArrayList<>();
        loggers.add(new JulLogger());
        loggers.add(new JclLogger());
        loggers.add(new Log4jLogger());
        loggers.add(new Slf4jLogger());

        loggers.forEach(ILogger::log);

        System.out.println("system out ...");
    }
}
