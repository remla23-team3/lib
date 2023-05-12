import java.util.logging.Logger;

import io.github.cdimascio.dotenv.Dotenv;

public class VersionUtil {
	private static final Logger logger = Logger.getLogger(VersionUtil.class.getName());

	public static void main(String[] args) {
		String version = VersionUtil.getVersion();
		logger.info("The version of lib is " + version + ". ");
	}

	public static String getVersion() {
		Dotenv dotenv = Dotenv.configure().directory("./").load();
		return dotenv.get("CURRENT_VERSION");
	}
}