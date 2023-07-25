package com.hoaxvo.common.annotation;

public @interface Audit {
    String functionName() default "";

    String userIdentifyKey() default "";

    String mongoCollection() default "auditlog";

    String serviceName() default "";
}
