# Java 注解

1. 认识注解
 ```
 @Target({ ElementType.FIELD }) //定义作用域
    @Retention(RetentionPolicy.RUNTIME) //定义声明周期
    public @interface Column {
	String value();
    }
 ```
2.  注解的作用范围@Target 和 生命周期 @Retention
    * 作用范围：包，类，字段，方法，方法的参数，局部变量
    * 生命周期：源文件SOURCE、编译CLASS、运行RUNTIME
3. 能读懂注解
4. 能在实际项目中用注解解决问题，并能自定义注解。