package com.prowidesoftware.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks generated code
 * @author mgriffa
 */
@Retention(RetentionPolicy.SOURCE)
public @interface Generated {
    
    String value();
}
