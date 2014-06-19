var userService = angular.module('userService', ['ngResource']);

/**
 * User Factory REST API
 */
userService.factory('UserFactory', ['$resource', '$rootScope', 
  function($resource, $rootScope){
    return $resource($rootScope.API_URL + 'user', {}, {
      query: { method: 'GET', isArray: true },
      create: { method: 'POST' }
    });
}]);