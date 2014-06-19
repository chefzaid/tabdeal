'use strict';

var userController = angular.module('userController', []);

/**
 * User registration controller
 * Builds the form's Date
 * Binds button click to REST API
 */
userController.controller('RegisterController', ['$scope', 'UserFactory',
  function($scope, UserFactory) {
	
	//Date's constants
	var MIN_AGE = 13;
	var MAX_AGE = 90;
	
	//Building days for birth date
	var days = [];
	for(var i=1; i<=31; i++){
		days.push(i);
	}
	$scope.days = days;

	//Building months for birth date
	$scope.months = ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 
	                 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre']
    
	//Building years for birth date
	var year = new Date().getFullYear();
	var years = [];
	for(var i=year-MIN_AGE; i>=year-MAX_AGE; i--){
		years.push(i);
	}
	$scope.years = years;
	
	//Binding button click to Factory for User creation
    $scope.createNewUser = function () {
      UserFactory.create($scope.user);
    }
}]);

userController.controller('AccountController', ['$scope', 
  function($scope) {
    $scope.pageTitle = 'Mon compte';
}]);

userController.controller('LoginController', ['$scope', 
  function($scope) {
    $scope.pageTitle = 'Se connecter';
}]);