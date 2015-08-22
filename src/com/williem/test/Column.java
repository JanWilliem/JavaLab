package com.williem.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD }) //定义作用域
@Retention(RetentionPolicy.RUNTIME) //定义声明周期
public @interface Column {
	String value();
}
