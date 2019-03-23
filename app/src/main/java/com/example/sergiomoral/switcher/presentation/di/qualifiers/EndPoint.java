package com.example.sergiomoral.switcher.presentation.di.qualifiers;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Retention(RUNTIME)
public @interface EndPoint {
}
