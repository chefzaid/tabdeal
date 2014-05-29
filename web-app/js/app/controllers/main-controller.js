'use strict';

var mainController = angular.module('mainController', []);

mainController.controller('HomeController', ['$scope', 
  function($scope,$http) {
    $scope.pageTitle = 'Accueil';
}]);

mainController.controller('ContactController', ['$scope', 
  function($scope) {
    $scope.pageTitle = 'Contactez nous !';
}]);

mainController.controller('ExampleController', ['$scope','$http', 
  function($scope,$http) {
    $scope.pageTitle = 'Example';
    $http.get('./static/js/app/ads/ads.json').success(function(data) {
      $scope.ads = data;
    });
}]);