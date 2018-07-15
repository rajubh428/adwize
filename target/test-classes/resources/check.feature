Feature: Login user
  Scenario Outline: validate login of Advertiser
    Given launch Adwize site
    And   click on advertiser radio button
    When  enter userid as "<username>"
    When  enter password "<password>"
    And   click on signin button
    And   close site
    Examples:
      | username              |    password      |     criteria  |
      | rajuadv@gmail.com     |  rajuadv321    |     valid     |
      | rajuadvnew@gmail.com  |  rajuadv123    |    invalid    |
      | rajuadveww@gmail.com  |  rajuadv321    |    invalid    |
      | rajuadv@gmail.com     |  rajuad123     |    invalid    |
  Scenario Outline: validate login of publisher
    Given launch Adwize site
    And click on publisher radio button
    When enter userid as "<username>"
    When enter password "<password>"
    And  click on signin button
    And close site
    Examples:
      | username             |   password      |     criteria  |
      | rajupub@gmail.com  |  rajupub321    |     valid     |
      | rajupubnew@gmail.com  |  rajupub123    |    invalid    |
      | rajupubeww@gmail.com  |  rajuadv321    |    invalid    |
      | rajuadv@gmail.com     |  rajuad123     |    invalid    |
  Scenario Outline: validate login of admin
    Given launch Adwize site
    And   click on admin radio button
    When  enter userid as "<username>"
    When  enter password "<password>"
    And   click on signin button
    And   close site
    Examples:
      | username              |   password      |     criteria  |
      | adwize@gmail.com      |  adwize@5       |     valid     |
      | adwize@gmail.com      |  rajupub123     |    invalid    |
      | rajupubeww@gmail.com  |  rajuadv321     |    invalid    |
      | rajuadv@gmail.com     |  rajuad123      |    invalid    |