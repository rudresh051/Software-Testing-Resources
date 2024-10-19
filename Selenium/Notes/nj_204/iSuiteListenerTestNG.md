# ISuiteListener in TestNG

* testng_child1.xml

```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="sampleDemoISuiteListener.TestPack1"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
```

* testng_child2.xml

```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="sampleDemoISuiteListener.TestPack2"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
```

* testngISuiteListener.xml

```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="ParentSuite">
 <listeners>
  <listener class-name="sampleDemoISuiteListener.ListenerTest"></listener>
 </listeners>
 <suite-files>
  <suite-file path="testng_child1.xml"></suite-file>
  <suite-file path="testng_child2.xml"></suite-file>
 </suite-files> 
</suite>

```
