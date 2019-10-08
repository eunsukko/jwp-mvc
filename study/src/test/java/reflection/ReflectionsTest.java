package reflection;

import annotation.Controller;
import annotation.Repository;
import annotation.Service;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReflectionsTest {
    private static final Logger logger = LoggerFactory.getLogger(ReflectionsTest.class);

    @Test
    public void showAnnotationClass() {
        Reflections reflections = new Reflections("examples");

        // TODO 클래스 레벨에 @Controller, @Service, @Repository 애노테이션이 설정되어 모든 클래스 찾아 로그로 출력한다.
        reflections.getTypesAnnotatedWith(Controller.class).stream()
                .forEach(type -> logger.debug("@Controller : {}", type));
        reflections.getTypesAnnotatedWith(Service.class).stream()
                .forEach(type -> logger.debug("@Service : {}", type));
        reflections.getTypesAnnotatedWith(Repository.class).stream()
                .forEach(type -> logger.debug("@Repository : {}", type));
    }
}
