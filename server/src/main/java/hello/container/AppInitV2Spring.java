package hello.container;

import hello.spring.GoodByeConfig;
import hello.spring.HelloConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitV2Spring implements AppInit {

    @Override
    public void onStartUp(ServletContext servletContext) {
        System.out.println("AppInitV2Spring-servletContext = " + servletContext);

        AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
        webContext.register(HelloConfig.class);
        webContext.register(GoodByeConfig.class);

        // spring web mvc dispatcher servlet
        DispatcherServlet dispatcher = new DispatcherServlet(webContext);

        // dispatcher servlet을 컨테이너에 등록
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcherV2", dispatcher);

        // /spring/* 요청이 디스패처 서블릿을 통하도록 설정
        servlet.addMapping("/spring/*");

    }
}
