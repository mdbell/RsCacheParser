package me.mdbell.jag.config.annotations;

import me.mdbell.jag.config.Codec;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by matthew on 5/9/16.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Serialize {
    int[] opcodes();

    Class<? extends Codec> codec();
}
