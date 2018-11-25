# Week 3: Derive tests by analyzing the internal structure of our source code

## Favorite bug

I could think of none...

## Structural testing (testing with knowledge of implementation; what else is it called?)

### Line coverage

* Define criteria for "when to stop" or "when is good enough"
* Line coverage is one such criterion: happy when all lines of code are covered (100%)
  * *coverage = number of lines exercised / total number of lines * 100%*
* IntelliJ has (class, method, line) coverage measurement built-in
* Line coverage depends on how developers write code (is it best to scatter the code into many lines to improve coverage?)

### Statement coverage

* Count statements iso lines

Black box testing only achieves 60-75% coverage. Structural testing is needed as well.

Is 100% line/statement coverage enough for full confidence?

### Branch coverage

* Means that branches in the control flow are exercised
  * *coverage = number of branches exercised / total number of branches * 100%*

### Condition coverage

* Ensure coverage of every condition in the program
* Covers more than line and branch coverage
* IntelliJ has support for condition coverage

### Path coverage

* Covering all the conditions does not mean covering all the paths (all combinations of conditions)
* However that might be impractical (too many combinations)
* We can focus only on important ones: MC/DC method helps with that

### Modified condition / decision coverage

* Write down all conditions and the combined outcomes in the "truth table"
* Identify a condition that independently affects the outcome of the entire decision
* A pair of tests for each such condition is usually enough
* MC/DC only needs N+1 tests, where N is the total number of conditions
* MC/DC is used in some industries, like avionics, and gives a manageable amount of tests when the number of combinations is too high

### Loop boundary criteria

* If testing all iterations is unfeasible
* Loop boundary adequacy criteria: iterate the loop once, zero and multiple times

### Criteria subsumption

* E.g. full line/statement coverage is achieved if full branch/condition coverage is achieved
* Branch/condition coverage are **stronger** than line/statement coverage

## Data flow vs. control flow testing

What is data flow testing?