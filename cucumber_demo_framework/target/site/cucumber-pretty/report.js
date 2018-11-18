$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotelshomepage.feature");
formatter.feature({
  "line": 2,
  "name": "Clicking today\u0027s date",
  "description": "",
  "id": "clicking-today\u0027s-date",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@hotels-regression"
    }
  ]
});
formatter.before({
  "duration": 5837964272,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on home page of Hotels",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelsHomePageSD.amIOnHotelsHomePage()"
});
formatter.result({
  "duration": 1126718025,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Entering destination",
  "description": "",
  "id": "clicking-today\u0027s-date;entering-destination",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@hotels-destination"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I enter Paris in Where To box",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter tomorrow\u0027s date in Check in box",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter a 6 days from now in Check out box",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify 6 nights is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on rooms drop-down",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select 2 from adults drop-down",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select 2 from Children drop-down",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select 2 from Child1 drop-down",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select \u003c1 from Child2 drop-down",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click Search button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I see Paris, France selected",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I\u0027m on Paris, France destination page",
  "keyword": "And "
});
formatter.match({
  "location": "HotelsHomePageSD.enterPlace()"
});
formatter.result({
  "duration": 4785230698,
  "status": "passed"
});
formatter.match({
  "location": "HotelsHomePageSD.clickDatebox()"
});
formatter.result({
  "duration": 946143520,
  "status": "passed"
});
formatter.match({
  "location": "HotelsHomePageSD.clickFutureNext()"
});
formatter.result({
  "duration": 684955708,
  "status": "passed"
});
formatter.match({
  "location": "HotelsHomePageSD.verifyNights()"
});
formatter.result({
  "duration": 45614191,
  "status": "passed"
});
formatter.match({
  "location": "HotelsHomePageSD.clickEditChoice()"
});
formatter.result({
  "duration": 150192813,
  "status": "passed"
});
formatter.match({
  "location": "HotelsHomePageSD.selectMenu1()"
});
formatter.result({
  "duration": 127363515,
  "status": "passed"
});
formatter.match({
  "location": "HotelsHomePageSD.selectMenu2()"
});
formatter.result({
  "duration": 137297907,
  "status": "passed"
});
formatter.match({
  "location": "HotelsHomePageSD.selectAge1Menu()"
});
formatter.result({
  "duration": 111713686,
  "status": "passed"
});
formatter.match({
  "location": "HotelsHomePageSD.selectAge2Menu()"
});
formatter.result({
  "duration": 191611426,
  "status": "passed"
});
formatter.match({
  "location": "HotelsHomePageSD.clickSearchButton()"
});
formatter.result({
  "duration": 2803708523,
  "status": "passed"
});
formatter.match({
  "location": "HotelsHomePageSD.verifyDestination()"
});
formatter.result({
  "duration": 5073822856,
  "status": "passed"
});
formatter.match({
  "location": "HotelsHomePageSD.verifyPage()"
});
formatter.result({
  "duration": 12567478,
  "status": "passed"
});
formatter.after({
  "duration": 167788180,
  "status": "passed"
});
});