'use strict';

var userController = angular.module('userController', []);

userController.controller('RegisterController', ['$scope', '$window', '$http', 'UsersFactory',
  function($scope, $window, $http, UsersFactory) {
	
	//Constructing days for birth date
	var days = [];
	for(var i=1; i<=31; i++){
		days.push(i);
	}
	$scope.days = days;

	//Constructing months for birth date
	$scope.months = ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 
	                 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre']
    
	//Constructing years for birth date
	var year = new Date().getFullYear();
	var years = [];
	var props = $window.properties;
	for(var i=year-props.minAge; i>=year-props.maxAge; i--){
		years.push(i);
	}
	$scope.years = years;
	
    $scope.createNewUser = function () { //it doesnt work, read/:id work btw
      //UsersFactory.create($scope.user);
//      $http
//      .post('localhost:8080/Tabdyl/api/user', $scope.user)
//      .success(function(data, status, headers, config) {
//  
//      }).error(function(data, status, headers, config) {
//     });
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