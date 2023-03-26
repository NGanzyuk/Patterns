import java.text.SimpleDateFormat;

public class Logger {
    private static Logger instance = null;
    protected int num = 0;
    public void log(String msg) {
        System.out.println("[" + num++ +"] [" +new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()) + "] " + msg);
    }
    private static Logger logger;
    private Logger() {}
    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }
}