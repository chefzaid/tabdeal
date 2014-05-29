'use strict';

var adController = angular.module('adController', []);

adController.controller('PostAdController', ['$scope', 
  function($scope) {
    $scope.pageTitle = 'Postez une annonce';
}]);
  
adController.controller('ListingController', ['$scope', 
  function($scope) {
    $scope.pageTitle = 'Liste des annonces';
}]);

adController.controller('DetailsController', ['$scope', 
  function($scope) {
    $scope.pageTitle = 'Details de l annonce';
}]);