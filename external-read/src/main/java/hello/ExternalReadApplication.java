package hello;

import hello.config.MyDataSourcePropertiesConfigV1;
import hello.config.MyDataSourcePropertiesConfigV2;
import hello.config.MyDataSourcePropertiesConfigV3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Import;

//@Import(MyDataSourceEnvConfig.class)
//@Import(MyDataSourceValueConfig.class)
//@Import(MyDataSourcePropertiesConfigV1.class)
//@Import(MyDataSourcePropertiesConfigV2.class)
@Import(MyDataSourcePropertiesConfigV3.class)
@SpringBootApplication(scanBasePackages = "hello.datasource")
//@ConfigurationPropertiesScan({"hello"})
public class ExternalReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalReadApplication.class, args);
    }

}
