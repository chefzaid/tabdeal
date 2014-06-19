'use strict';

/**
 * Angular main application file, contains:
 * Modules, controllers, and services declarations
 * URL routings
 * Config global variables
 */

var tabdylApp = angular.module('tabdylApp', [
	//Modules
	'ngRoute',
	
	//Controllers
	'mainController',
	'adController',
	'userController',
	
	//Services
	'mainService',
	'adService',
	'userService'
]);

tabdylApp.config(['$routeProvider',
	function($routeProvider) {
		$routeProvider.
		
		//Root routes
		when('/home', {
			templateUrl: 'content/home.html',
			controller: 'HomeController'
		}).
		when('/contact', {
			templateUrl: 'content/contact.html',
			controller: 'ContactController'
		}).
		when('/terms', {
			templateUrl: 'content/terms.html',
		}).
		when('/help', {
			templateUrl: 'content/help.html',
		}).
		when('/example', {
			templateUrl: 'content/example.html',
			controller: 'ExampleController'
		}).
		
		//Ad routes
		when('/post-ad', {
			templateUrl: 'content/post-ad.html',
			controller: 'PostAdController'
		}).
		when('/listings', {
			templateUrl: 'content/listings.html',
			controller: 'ListingController'
		}).
		when('/details', {
			templateUrl: 'content/details.html',
			controller: 'DetailsController'
		}).
		
		//User routes
		when('/register', {
			templateUrl: 'content/register.html',
			controller: 'RegisterController'
		}).
		when('/my-account', {
			templateUrl: 'content/my-account.html',
			controller: 'AccountController'
		}).
		when('/login', {
			//templateUrl: 'content/my-account.html',
			controller: 'LoginController'
		}).
		
		//Default route
		otherwise({
			redirectTo: '/home'
		});
}]);

tabdylApp.run(function ($rootScope) {
	//REST API Endpoint:
    $rootScope.API_URL = 'http://localhost:8080/Tabdyl/api/';
    //Deployed environment type: values(dev, test, prod) 
    $rootScope.ENV = 'dev';
});