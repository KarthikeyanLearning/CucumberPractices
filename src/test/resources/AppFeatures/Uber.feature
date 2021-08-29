@All
Feature: Uber Booking Feature

@Smoke
Scenario: Booking Cab Sedan
Given User wants to select a car type "sedan" from uber app
When User selects car "sedan" and pick up point "Bangalore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD


@Regression
Scenario: Booking Cab SUV
Given User wants to select a car type "SUV" from uber app
When User selects car "SUV" and pick up point "Chennai" and drop location "Bangalore"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Smoke @Prod
Scenario: Booking Cab for Mini
Given User wants to select a car type "Mini" from uber app
When User selects car "Mini" and pick up point "Chennai" and drop location "Pondicherry"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD
