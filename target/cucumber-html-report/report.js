$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Training_h2a.06.17/Documents/selenium/casestudycucumber/features/feature4.feature");
formatter.feature({
  "name": "add to cart",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "valid add to cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "alex  now is on demowebshop home page",
  "keyword": "Given "
});
formatter.match({
  "location": "invalidcart.alex_now_is_on_demowebshop_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Alex now searches for a product",
  "keyword": "When "
});
formatter.match({
  "location": "invalidcart.alex_now_searches_for_a_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Alex againclicks on search",
  "keyword": "And "
});
formatter.match({
  "location": "invalidcart.alex_againclicks_on_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks again on add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "invalidcart.clicks_again_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks againon shopping cart",
  "keyword": "And "
});
formatter.match({
  "location": "invalidcart.clicks_againon_shopping_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Alex finds the product in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "invalidcart.he_finds_the_product_in_the_cart()"
});
formatter.result({
  "status": "passed"
});
});