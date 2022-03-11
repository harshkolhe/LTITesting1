Feature: Test Register Functionality

  Scenario Outline: Register with valid data/inputs
    * users open chrome browser
    * navigate to newtours
    * Click on register
    * users enter username as "<username>"
    * users enter password as "<password>"
    * users enter confirm password as"<confirmpassword>"
    * users click on submit button
    * verify register success
    * close the browser

    Examples: 
      | username | password | confirmpassword |
      | Harsh    | harsh    | harsh           |
      | Amey     | kolhe    | kolhe           |
