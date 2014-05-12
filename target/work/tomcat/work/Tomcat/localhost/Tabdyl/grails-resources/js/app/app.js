'use strict';

var tabdylApp = angular.module('tabdylApp', [
	'ngRoute',
	'tabdylControllers',
]);

tabdylApp.config(['$routeProvider',
	function($routeProvider) {
		$routeProvider.
		when('/home', {
			templateUrl: 'content/home.html',
			controller: 'HomeCtrl'
		}).
		when('/example', {
			templateUrl: 'content/example.html',
			controller: 'HomeCtrl'
		}).
		when('/register', {
			templateUrl: 'content/register.html',
			controller: 'RegisterCtrl'
		}).
		when('/contact', {
			templateUrl: 'content/contact.html',
			controller: 'ContactCtrl'
		}).
		when('/post-ad', {
			templateUrl: 'content/post-ad.html',
			controller: 'PostAdCtrl'
		}).
		when('/terms', {
			templateUrl: 'content/terms.html',
		}).
		when('/help', {
			templateUrl: 'content/help.html',
		}).
		when('/listings', {
			templateUrl: 'content/listings.html',
		}).
		when('/details', {
			templateUrl: 'content/details.html',
		}).
		when('/my-account', {
			templateUrl: 'content/my-account.html',
		}).
		otherwise({
			redirectTo: '/home'
		});
}]);