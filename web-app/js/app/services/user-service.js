var userService = angular.module('userService', ['ngResource']);


userService.factory('UsersFactory', ['$resource',
  function($resource){
    return $resource('localhost:8080/Tabdyl/api/user', {}, {
      query: { method: 'GET', isArray: true },
      create: { method: 'POST' }
    });
}]);