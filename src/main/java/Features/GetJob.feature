Feature: As a Daggr user,  Create a GetJob 
Scenario Outline: User should create a get job

Given open daggr application
Then user enter valid username "<username>"
Then user enter valid password "<password>"
When click on login button 
Then user succesfully reached to homepage
When user able to see homepage
Then user click on filemenu
And user click on getjob functionality
Then user choose to company database function
And user enter CompanyName mandatory as "abc technology"
And user select the type mandatory as "Public"
And user select companystatus mandatory "Active"
And user enter company website mandatory as "https://abc.com"
And user enter employee as "4343434"
And user enter startdate as "2021-08-19"
And user enter enddate as "2022-04-05"
And user enter sector and industry
And user select countryname mandatory as "India" 
And user enter address, phonenumber and company description
And user enter company identifiers as ISIN, CIK, CUSIP and SEDOL
Then user click on first next button to preceed 
When user able to see second step
Then user enter IrSection Link mandatory as "https://abc.com"
And user enter PrSection Link as "https://abc.com"
And user enter IR Executive as IRName, IRDesignation, IRPhoneNumber, IREmail
And user press IRResponding to email "No"
And user press IRResponding to phone call "No" 
And user enter Executives Section Link ""
And user enter Analyst Coverage Link ""
Then user click on second next button to proceed
When user able to see third step
Then user enter eventsection link mandatory as "https://abc.com"
And user press Earnings Announcement "No"
And user press Earnings Call Conducted "No"
And user select Language "English"
And user select Earnings Call Frequency "Quarterly"
And user press Email alerts set Up "no"
And user press Add to Calendar Option "no"
And user enter Comments "anythings"
Then user click on third next button
When user able to see fourth step
Then user press Tracking Type mandatory "HTTP"
And user enter tracking link mandatory as "https://abc.com"
And user tracking status "ACTIVE"
And user enter scraping frequency as "1 hour"
And user enter commentss "anythings"
When user click on final next Step
Then user able to create a get job
Examples:
| username                           | password |
| saraswatipanda@digital-nirvana.com | Dnis@123 |