# ZoomChart
Home task to create automation suit to test Shortening of values
Task 2
1.Created a "value shortening" Java function which converts a raw number into an appropriate shortened number and shortened unit.
path:ZoomChartTestSuit\src\main\java\CommonUtil\ShorteningValues.java
2.created an appropriate suite of tests verifying this function behaves as expected
Solution:I have created a maven project in data driven frame work  to test the functionality
i)Used ApachePOI to read an excel-TestData ,which contains the test cases along with the shortening value and valuUnits.
ii)Used TestNG @Dataprovider to get each cell value as object[][] passed this value to the Shortening function
To run the solution ->Go to testng.xml>Rightclick >RunAs >TestNG Suit
