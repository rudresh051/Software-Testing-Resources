# Displacements

## Ignore Displacements

* Toggled on from the code
    * Vertical displacements only

* Toggled on from the Test Manager Dashboard
    * Horizontal & vertical displacements

* Ignores noisy displacement differences

```java
eyes.check(Target.window().ignoreDisplacements());
```

## .ignoreDisplacements()

* Flag for eyes.check()
* Ignores noisy displacement differences
* Can be turned on from the IJI or the code
* Should only be used when necessary
* Only available for the Strict & Ignore Colors
Match Levels