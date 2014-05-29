'use strict';

var userController = angular.module('userController', []);

userController.controller('RegisterController', ['$scope', 
  function($scope) {
    $scope.pageTitle = 'Créer un compte';
}]);

userController.controller('AccountController', ['$scope', 
  function($scope) {
    $scope.pageTitle = 'Mon compte';
}]);

userController.controller('LoginController', ['$scope', 
  function($scope) {
    $scope.pageTitle = 'Se connecter';
}]);