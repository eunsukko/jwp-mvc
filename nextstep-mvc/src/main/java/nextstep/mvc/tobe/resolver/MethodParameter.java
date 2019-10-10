package nextstep.mvc.tobe.resolver;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Objects;

public class MethodParameter {
    private final Parameter parameter;
    private final String name;
    private final int index;
    private Method method;

    public MethodParameter(final Parameter parameter, final String name, final int index, final Method method) {
        this.parameter = parameter;
        this.name = name;
        this.index = index;
        this.method = method;
    }

    public boolean isAnnotationPresent(final Class<? extends Annotation> annotation) {
        return parameter.isAnnotationPresent(annotation);
    }


    public <T extends Annotation> T getAnnotation(final Class<T> annotation) {
        return method.getAnnotation(annotation);
    }

    public Parameter getParameter() {
        return parameter;
    }

    public String getName() {
        return name;
    }

    public Class<?> getType() {
        return parameter.getType();
    }

    public int getIndex() {
        return index;
    }

    public Method getMethod() {
        return method;
    }

    public boolean isSameType(final Class<?> classType) {
        return parameter.getType().equals(classType);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final MethodParameter that = (MethodParameter) o;
        return index == that.index &&
                Objects.equals(parameter, that.parameter) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameter, name, index);
    }
}
