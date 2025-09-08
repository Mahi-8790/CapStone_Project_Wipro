Feature: To login to ecommerce page and return to home page
Scenario Outline: login to ecommerce website
Given page should open in browser
And   enter "<username>" and "<password>"
And click on sign in
And to return home click on page
Examples:
 | username                      | password |
 | mahi87902@gmail.com           |8919215039@Mk  |
 | mahenderreddy8919@gmail.com   | 8919215039@Mk |

