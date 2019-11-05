Feature: Google Search

  Scenario: Show result list after enter keyword
    Given The google home page is showed
    When The User enter the keyword into search box then press Enter
    Then The list of result is showed