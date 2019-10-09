package nextstep.mvc;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public interface HandlerMapping {
    void initialize();

    Optional<HandlerExecution> getHandler(HttpServletRequest request);
}
