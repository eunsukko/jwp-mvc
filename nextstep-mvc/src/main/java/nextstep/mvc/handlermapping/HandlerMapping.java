package nextstep.mvc.handlermapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public interface HandlerMapping {
    void initialize();

    Optional<Object> getHandler(HttpServletRequest request);
}
