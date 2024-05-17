# Why do we need waits?
Synchronization issue — When the Script execution speed doesn't match with
the browser speed.

# Wait Commands
What are Wait commands in Selenium?
The wait commands are essential when it comes to executing Selenium tests. They help to  
observe and troubleshoot issues that may occur due to variation in time lag  
While running Selenium tests, it is common for testers to get the message "Element Not  
Visible Exception'. This appears when a particular web element with which has to  
interact, is delayed in its loading. To prevent this Exception, Selenium Wait Commands must  
be used.  

In automation testing, Selenium Uebdtiygc wait commands direct test execution to pause  
for a certain length of time before moving onto the next step. This enables UeÄQÄgrto  
check if one or more web elements are present/visible/enriched/clickable, etc when  
identifying certain elements. If an element is not located, then the  
appears. Selenium Wait commands help resolve this  
issue.  
Important point — When the element is actually but there is a browser  
delay issue.

# Implicit Wait in Selenium
Implicit Wait directs the Selenium to wait for a certain measure of time before  
throwing an exception. Once this time is set, will wait for the element before the  
exception occurs.  
It sets a global wait for a certain amount of time for the entire script. Selenium will wait for a  
specified amount of time before throwing a if an element is not  
present  
Once the command is run, Implicit Wait remains forthe entire duration for which the browser  
is open. default setting is 0, and the specific wait time needs to be set by the following  
protocol.  
Implicit Wait Syntax  