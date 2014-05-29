var userService = angular.module('userService', ['ngResource']);

userService.factory('User', ['$resource',
  function($resource){
    return $resource('api/user/:userId.json', {}, {
      query: {method:'GET', params:{userId:'users'}, isArray:true}
    });
  }]);