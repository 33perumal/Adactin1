$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin1.feature");
formatter.feature({
  "line": 1,
  "name": "User want to book a Hotel",
  "description": "",
  "id": "user-want-to-book-a-hotel",
  "keyword": "Feature"
});
formatter.before({
  "duration": 205000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "As an Existing user i want to login",
  "description": "",
  "id": "user-want-to-book-a-hotel;as-an-existing-user-i-want-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters userName",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters the submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.user_launch_the_Application()"
});
formatter.result({
  "duration": 4691166900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_enters_userName()"
});
formatter.result({
  "duration": 98609900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_enters_password()"
});
formatter.result({
  "duration": 64091100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_enters_the_submit_button()"
});
formatter.result({
  "duration": 926610900,
  "status": "passed"
});
formatter.after({
  "duration": 132900,
  "status": "passed"
});
formatter.before({
  "duration": 77600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User searches the Hotel",
  "description": "",
  "id": "user-want-to-book-a-hotel;user-searches-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User selecting the location \"New York\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Select your hotel type",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Select your Roomtype",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Select no of rooms",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Select Check in date",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Select check out date",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Select person per room",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Select child per room",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click search button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 29
    }
  ],
  "location": "StepDefinition1.user_selecting_the_location(String)"
});
formatter.result({
  "duration": 114127500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.select_your_hotel_type()"
});
formatter.result({
  "duration": 113990100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.select_your_Roomtype()"
});
formatter.result({
  "duration": 97864900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.select_no_of_rooms()"
});
formatter.result({
  "duration": 46552400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.select_Check_in_date()"
});
formatter.result({
  "duration": 137060700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.select_check_out_date()"
});
formatter.result({
  "duration": 109417800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.select_person_per_room()"
});
formatter.result({
  "duration": 33452600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.select_child_per_room()"
});
formatter.result({
  "duration": 31606500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_search_button()"
});
formatter.result({
  "duration": 523660600,
  "status": "passed"
});
formatter.after({
  "duration": 59000,
  "status": "passed"
});
formatter.before({
  "duration": 63000,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "User confirms Hotel",
  "description": "",
  "id": "user-want-to-book-a-hotel;user-confirms-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "User confirm the Hotel name",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User sumbits the hotel name confirmation",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.user_confirm_the_Hotel_name()"
});
formatter.result({
  "duration": 63417500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_sumbits_the_hotel_name_confirmation()"
});
formatter.result({
  "duration": 562952900,
  "status": "passed"
});
formatter.after({
  "duration": 59200,
  "status": "passed"
});
formatter.before({
  "duration": 71600,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "User Booking page",
  "description": "",
  "id": "user-want-to-book-a-hotel;user-booking-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "Enter the name",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "Enter last name",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Enters Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Enters card Number",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Enters card type",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Enters expiry Month",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Enters expiry year",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Enters CVV No",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Submits for booking",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.enter_the_name()"
});
formatter.result({
  "duration": 73663500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.enter_last_name()"
});
formatter.result({
  "duration": 62076000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.enters_Billing_Address()"
});
formatter.result({
  "duration": 101151000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.enters_card_Number()"
});
formatter.result({
  "duration": 74363900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.enters_card_type()"
});
formatter.result({
  "duration": 85323700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.enters_expiry_Month()"
});
formatter.result({
  "duration": 85787500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.enters_expiry_year()"
});
formatter.result({
  "duration": 79773900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.enters_CVV_No()"
});
formatter.result({
  "duration": 67990800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.submits_for_booking()"
});
formatter.result({
  "duration": 66397800,
  "status": "passed"
});
formatter.after({
  "duration": 55900,
  "status": "passed"
});
formatter.before({
  "duration": 199300,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "User exit the application",
  "description": "",
  "id": "user-want-to-book-a-hotel;user-exit-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "User scrolldown the page for checking",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "User scrollup the page for checking",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "User Logout",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.user_scrolldown_the_page_for_checking()"
});
formatter.result({
  "duration": 25675000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_scrollup_the_page_for_checking()"
});
formatter.result({
  "duration": 25071300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_Logout()"
});
formatter.result({
  "duration": 321170800,
  "status": "passed"
});
formatter.after({
  "duration": 51000,
  "status": "passed"
});
});