
## create JAR file

```
./build.sh
```

## push app

```
cf push --health-check-type none -p HelloJNI.jar
```
