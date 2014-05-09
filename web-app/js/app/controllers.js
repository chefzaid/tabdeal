'use strict';

var tabdylControllers = angular.module('tabdylControllers', []);

tabdylControllers.controller('HomeCtrl', ['$scope', 
  function($scope) {
    $scope.pageTitle = 'Accueil';
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