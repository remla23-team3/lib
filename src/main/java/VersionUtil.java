import java.util.logging.Logger;

public class VersionUtil {
	private static final Logger logger = Logger.getLogger(VersionUtil.class.getName());

	public static void main(String[] args) {
		String version = VersionUtil.getVersion();
		logger.info("The version of lib is " + version + ".");
	}

	public static String getVersion() {
		return System.getenv().get("CURRENT_VERSION"); 	}
}