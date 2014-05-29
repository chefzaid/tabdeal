var mainService = angular.module('mainService', ['ngResource']);

mainService.factory('Main', ['$resource',
  function($resource){
    return $resource('api/main/:mainId.json', {}, {
      query: {method:'GET', params:{mainId:'mains'}, isArray:true}
    });
  }]);