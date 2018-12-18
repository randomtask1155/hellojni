#!/bin/bash
javac -h . HelloJNI.java
jar cmf HelloJNI.mf HelloJNI.jar HelloJNI.class HelloJNI.java
cf push --health-check-type none -p HelloJNI.jar
