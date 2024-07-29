package anotacao;

import java.lang.annotation.*;

/**
 * @author Vinícius Pelizzari
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
