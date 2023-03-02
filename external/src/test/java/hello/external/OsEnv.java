package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class OsEnv {

    public static void main(String[] args) {
        Map<String, String> getenv = System.getenv();
        for (String key : getenv.keySet()) {
            System.out.println("key = " + key);
            System.out.println("System.getenv(key) = " + System.getenv(key));
        }

        // DBURL = dev.db.com: 개발 서버
        // DBURL = prod.db.com: 운영 서버
        System.getenv("DBURL");
    }
}
