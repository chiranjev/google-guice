package com.drawingapp.annotations;

import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import com.google.inject.BindingAnnotation;

@BindingAnnotation
@Target({FIELD, PARAMETER, METHOD}) @Retention(RUNTIME)
public @interface ColorValue {

}
