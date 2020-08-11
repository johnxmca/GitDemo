$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/SearchCheckoutlist.feature");
formatter.feature({
  "line": 1,
  "name": "Search and then place order for vegetables",
  "description": "",
  "id": "search-and-then-place-order-for-vegetables",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Search for items and validate results",
  "description": "",
  "id": "search-and-then-place-order-for-vegetables;search-for-items-and-validate-results",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@SelTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on Greencart landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User searched for \u003cname\u003e vegetables",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Added items to cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user proceeded to checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "verify selected \u003cname\u003e item is been displayed in checkout page",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "search-and-then-place-order-for-vegetables;search-for-items-and-validate-results;",
  "rows": [
    {
      "cells": [
        "name"
      ],
      "line": 14,
      "id": "search-and-then-place-order-for-vegetables;search-for-items-and-validate-results;;1"
    },
    {
      "cells": [
        "Brinjal"
      ],
      "line": 15,
      "id": "search-and-then-place-order-for-vegetables;search-for-items-and-validate-results;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 196200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Search for items and validate results",
  "description": "",
  "id": "search-and-then-place-order-for-vegetables;search-for-items-and-validate-results;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@SelTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on Greencart landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User searched for Brinjal vegetables",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Added items to cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user proceeded to checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "verify selected Brinjal item is been displayed in checkout page",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepsSearchCheckOut1.user_is_on_Greencart_landing_page()"
});
formatter.result({
  "duration": 9642239400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brinjal",
      "offset": 18
    }
  ],
  "location": "StepsSearchCheckOut1.user_searched_for_vegetables(String)"
});
formatter.result({
  "duration": 4211257400,
  "status": "passed"
});
formatter.match({
  "location": "StepsSearchCheckOut2.added_items_to_cart()"
});
formatter.result({
  "duration": 115752700,
  "status": "passed"
});
formatter.match({
  "location": "StepsSearchCheckOut2.user_proceeded_to_checkout_page()"
});
formatter.result({
  "duration": 4127063500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brinjal",
      "offset": 16
    }
  ],
  "location": "StepsSearchCheckOut2.verify_selected_item_is_been_displayed_in_checkout_page(String)"
});
formatter.result({
  "duration": 42015900,
  "status": "passed"
});
formatter.after({
  "duration": 137458800,
  "status": "passed"
});
});