'use strict';

var tabdylApp = angular.module('tabdylApp', [                                         
	'ngRoute',
	
	/* Controllers */
	'mainController',
	'adController',
	'userController',
	
	/* Services */
	'mainService',
	'adService',
	'userService'
]);

tabdylApp.config(['$routeProvider',
	function($routeProvider) {
		$routeProvider.
		
		/* Main Routes */
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
		
		/* Ad Routes */
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
		
		/* User Routes */
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
		
		/* Default Route */
		otherwise({
			redirectTo: '/home'
		});
}]);