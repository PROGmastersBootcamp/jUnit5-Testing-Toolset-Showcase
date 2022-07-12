# Intro

## Why do we test?

## Why automatize, and how?

## Methodology

## JUnit 5

Let's take a look at what JUnit 5 offers:

- running tests on the JVM
- well-defined test-instance lifecycle (before/after a test)
- built-in assertions to verify the outcome of your test
- parameterized tests
- extension model for implementing cross-cutting concerns for tests

# 01 - Basics

## Training

### @Test annotation

### execution order

### anatomy of a test method

### naming conventions

## Hands-on

Közös feladatmegoldás

## Exercise

Önálló feladatmegoldás

# 02 - Test Fixtures

## Training

### new annotations

### purpose of these methods

## Hands-on

Közös feladatmegoldás

## Exercise

Önálló feladatmegoldás

# 02 - Test Fixtures

## Training

### @Test annotation

## Hands-on

Közös feladatmegoldás

## Exercise

Önálló feladatmegoldás

# 03 - Assertions

## Training

### different assertion methods

### assertEquals, True/False, arrayEquals,

### throws, notThrows,

### timeout, timeoutPreemptively

### assertAll

### nestedAssertions

## Hands-on

Közös feladatmegoldás

## Exercise

Önálló feladatmegoldás

# 04 - Assumptions

## Training

## The difference between assert and assume

## use cases of assumptions

## Hands-on

Közös feladatmegoldás

## Exercise

Önálló feladatmegoldás

# 05 - More annotations!

## Training

### to disable/enable tests

### to add descriptive display names

### to order methods (and why it's a bad practice)

### custom ordering method (DemoTestWithCustomOrder class)

### running tests parallel (DemoTestParallel class)

## Hands-on

Közös feladatmegoldás

## Exercise

Önálló feladatmegoldás

# 05 - Test lifecycle and nesting

## Training

//TODO Talk about:  
// - new annotations  
// - use-cases of PER_CLASS lifecycle  
//TODO Talk about:  
// - new annotations  
// - the power and purpose of nesting classes

## Hands-on

Közös feladatmegoldás

## Exercise

Önálló feladatmegoldás

# 06 - Tagging tests

## Training

//TODO Talk about:  
// - how to tag tests, and how to use this to your benefit

## Hands-on

Közös feladatmegoldás

## Exercise

Önálló feladatmegoldás

# 07 - Parameterized and Dynamic tests

## Training

//TODO Talk about:  
// - different ways to pass parameters to test classes  
// - purpose and power of this approach

## Hands-on

Közös feladatmegoldás

## Exercise

Önálló feladatmegoldás

# 08 - TempDirectory

# 09 - Hamcrest

# 10 - AssertJ

# 11 - Test double, Mockito,

argument matcher, argument captor, verify, dependency injection, stubbing

# 12 - Test Coverage

# 13 - Mutation testing

# 14 - JSONAssert + JSONPath

- TODO: Ezt valahová be lehetne rakni

# 20 - Benchmarking

# Néhány hasznos tip:

### Run tests before commit (Nem sikerült működésre bírni)

- IntelliJ -> Settings -> Version Control -> Commit -> Run Tests before commit

### Auto-create tests

- IntelliJ --> classname -> Alt+Enter -> 'Create Test'

### Test-run history

- Run window --> Test History ( stopwatch icon )

### Test Data plugin

- Install plugin
- Alt + Insert -> Test Data
- Extra: Custom Generator
