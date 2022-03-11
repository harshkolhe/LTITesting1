Feature: Test Login with different set of inputs

  Scenario Outline: Login with valid data/inputs
    * user open chrome browser
    * navigates to newtours
    * enter username as "<username>"
    * enter password as "<password>"
    * user clicks on submit
    * verify login is success
    * close the browser

    Examples: 
      | username | password |
      | mercury  | mercury  |
      | mercury  | mer      |
      | Har      | harsh    |
