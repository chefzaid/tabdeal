var adService = angular.module('adService', ['ngResource']);

adService.factory('Ad', ['$resource',
  function($resource){
    return $resource('api/ad/:adId.json', {}, {
      query: {method:'GET', params:{adId:'ads'}, isArray:true}
    });
  }]);