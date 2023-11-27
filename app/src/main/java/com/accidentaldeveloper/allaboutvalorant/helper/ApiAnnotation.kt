package com.accidentaldeveloper.allaboutvalorant.helper

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

@Qualifier //to make your annotation qualifier you have to use @Qualifier annotation
@Documented // it will decide weather it wwill come in java doc or not.
@Retention(RetentionPolicy.RUNTIME) //this will decicide your timeline till what time it will be valid there few more you can check it out
annotation class ApiAnnotation()

