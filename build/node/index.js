(function (_, Kotlin) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  var arrayListOf = Kotlin.kotlin.collections.arrayListOf_i5x0yv$;
  var IntRange = Kotlin.kotlin.ranges.IntRange;
  var distinct = Kotlin.kotlin.collections.distinct_7wnvza$;
  function classes() {
    println('\n******************  CLASSES ******************');
    println('\n*** Instantiate class with constructor ***');
    var objFromClassWithCons = ClassWithConstructor_init();
    println(objFromClassWithCons);
    println(objFromClassWithCons.toString());
    var objExample = AnotherClassExample_init('Meeka Faulkner');
    println(objExample);
  }
  function Empty() {
  }
  Empty.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: 'Empty',
    interfaces: []
  };
  function ClassWithConstructor() {
  }
  ClassWithConstructor.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: 'ClassWithConstructor',
    interfaces: []
  };
  function ClassWithConstructor_init($this) {
    $this = $this || Object.create(ClassWithConstructor.prototype);
    ClassWithConstructor.call($this);
    println('Built ClassWithConstructor');
    return $this;
  }
  function ClassWithProps() {
    this.name = '';
  }
  ClassWithProps.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: 'ClassWithProps',
    interfaces: []
  };
  function ClassWithProps_init(newName, $this) {
    $this = $this || Object.create(ClassWithProps.prototype);
    ClassWithProps.call($this);
    $this.name = newName;
    return $this;
  }
  function ClassWithFunctions() {
    this.firstName = '';
    this.lastName = '';
  }
  ClassWithFunctions.prototype.fullName = function () {
    return this.firstName + this.lastName;
  };
  ClassWithFunctions.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: 'ClassWithFunctions',
    interfaces: []
  };
  function ClassWithFunctions_init(firstName, lastName, $this) {
    $this = $this || Object.create(ClassWithFunctions.prototype);
    ClassWithFunctions.call($this);
    return $this;
  }
  function AnotherClassExample() {
    this.testName = '';
  }
  AnotherClassExample.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: 'AnotherClassExample',
    interfaces: []
  };
  function AnotherClassExample_init(testName, $this) {
    $this = $this || Object.create(AnotherClassExample.prototype);
    AnotherClassExample.call($this);
    $this.testName = testName;
    return $this;
  }
  function runningFunctions() {
    println('\n**** Run function requiring no variables ****');
    hello();
    println('\n**** Run another function, containing 1 variable ****');
    helloName('Boaty McBoatface');
    println('\n**** Run function with optional argument, using no values ****');
    helloNameMaybe();
    println('\n**** Run function with optional argument, using 1 value ****');
    helloNameMaybe('GrArgh');
    println('\n**** Run function with nullable argument using null ****');
    helloNameMaybe(null);
    println("\n**** Run function with return type 'String' and display returned string ****");
    println(buildHello());
  }
  function hello() {
    println('Hello!');
  }
  function helloName(name) {
    println('Hello ' + name + '!');
  }
  function helloNameMaybe(name) {
    if (name === void 0)
      name = null;
    if (name != null)
      helloName(name);
    else
      hello();
  }
  function buildHello(name) {
    if (name === void 0)
      name = null;
    if (name != null)
      return 'Hello ' + Kotlin.toString(name) + '!';
    else
      return 'Hello!';
  }
  function lists() {
    println('\n****** Declare a list of type Int ******');
    var list1 = arrayListOf([0, 1, 2]);
    println('\n****** Declare an untyped list ******');
    var list2 = ['Mon', 'Tue', 'Wed', 'Thur', 'Fri', 'Sat'];
    println('\n****** Get list size ******');
    var list1Size = list1.size;
    println(list1Size);
    println(ranges_0(0, 5));
  }
  function ranges_0(start, end) {
    println('\n*** Define a range between 2 given integers ***');
    println(new IntRange(1, 6));
    println('\n*** Define a range between given start and end value ***');
    var range = new IntRange(start, end);
    return distinct(range);
  }
  function main(args) {
    println('Hello JavaScript!');
    variableTypes();
    runningFunctions();
    lists();
    classes();
    var express = require('express');
  }
  function variableTypes() {
    println('\n*** Define a mutable variable ***');
    var someVar = 'ok';
    someVar = 'okokok';
    println('Output defined mutable variable: ' + someVar);
    println('\n*** Define an immutablevariable ***');
    var someImmutableVar = 3;
    println('Output defined immutable variable: ' + Kotlin.toString(someImmutableVar));
  }
  _.classes = classes;
  _.Empty = Empty;
  _.ClassWithConstructor_init = ClassWithConstructor_init;
  _.ClassWithConstructor = ClassWithConstructor;
  _.ClassWithProps_init_61zpoe$ = ClassWithProps_init;
  _.ClassWithProps = ClassWithProps;
  _.ClassWithFunctions_init_puj7f4$ = ClassWithFunctions_init;
  _.ClassWithFunctions = ClassWithFunctions;
  _.AnotherClassExample_init_61zpoe$ = AnotherClassExample_init;
  _.AnotherClassExample = AnotherClassExample;
  _.runningFunctions = runningFunctions;
  _.hello = hello;
  _.helloName_61zpoe$ = helloName;
  _.helloNameMaybe_pdl1vj$ = helloNameMaybe;
  _.buildHello_pdl1vj$ = buildHello;
  _.lists = lists;
  _.ranges_vux9f0$ = ranges_0;
  _.main_kand9s$ = main;
  _.variableTypes = variableTypes;
  Kotlin.defineModule('index', _);
  main([]);
  return _;
}(module.exports, require('kotlin')));
