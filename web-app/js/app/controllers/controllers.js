'use strict';

var tabdylControllers = angular.module('tabdylControllers', []);

tabdylControllers.controller('HomeCtrl', ['$scope','$http', 
  function($scope,$http) {
    $scope.pageTitle = 'Accueil';
  }]);

tabdylControllers.controller('ExampleCtrl', ['$scope','$http', 
  function($scope,$http) {
    $scope.pageTitle = 'Example';
    $http.get('./static/js/app/ads/ads.json').success(function(data) {
        $scope.ads = data;
      });
  }]);

tabdylControllers.controller('RegisterCtrl', ['$scope', 
  function($scope) {
    $scope.pageTitle = 'Créer un compte';
  }]);
  
tabdylControllers.controller('ContactCtrl', ['$scope', 
  function($scope) {
    $scope.pageTitle = 'Contactez nous !';
  }]);

tabdylControllers.controller('PostAdCtrl', ['$scope', 
  function($scope) {
    $scope.pageTitle = 'Postez une annonce';
  }]);
  
tabdylControllers.controller('ListingsCtrl', ['$scope', 
  function($scope) {
    $scope.pageTitle = 'Liste des annonces';
  }]);