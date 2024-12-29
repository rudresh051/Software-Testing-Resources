# What is Data Driven Testing?

DDT is a testing approach where test scenarios are
executed multiple times with different sets of input data.

* DDT helps in increasing test coverage and ensuring that the application behaves correctly under various conditions.

* DDT separates test data from test scripts because it makes it easier to maintain and resuse test cases.

## what are the data sources for DDT?

=> External files e.g. csv files
Test data can be stored in external files such as csv, excel, json, xml.
=> Data bases - Test data can be retrieved from data bases such as mysql.
=> Data provider - TestNG and JUnit provides data provider annotations to supply test data directly within the code.

* Using TestNG data provider
TestNG provides @dataProvider annotation to supply test data to test methods.
Each data provider method returns a 2D array of objects representing different test data sets.

@Test(dataProvider = "data Provider Method Name") to receive test data from Data Provider.
